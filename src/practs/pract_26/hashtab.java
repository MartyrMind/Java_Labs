package practs.pract_26;


import java.util.ArrayList;

class HashNode<K, V> {

    private K key;
    private V value;
    public HashNode<K, V> next; //ссылка на следующий элемент для разрешения коллизий

    public HashNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class hashtab<K, V> {
    private ArrayList<HashNode<K, V>> bucketArray; //массив односвязных списков
    private int numBuckets; //количество корзин
    private int size; //количество элементов в хеш-таблице

    public hashtab() {
        numBuckets = 10;
        bucketArray = new ArrayList<>();
        for (int i = 0; i < numBuckets; i++)
            bucketArray.add(null);
    }

    public void add(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        HashNode<K, V> head = bucketArray.get(bucketIndex); //получаем голову односвязного списка
        if (head == null) {
            bucketArray.set(bucketIndex, new HashNode<K, V>(key, value));
            size++;
        } else {
            while (head.next != null) { //проходим по списку
                if (head.getValue() == value) { //если значение уже есть в списке, то просто выходим
                    return;
                }
                head = head.next;
            }
            head.next = new HashNode<K, V>(key, value); //добавляем новый элемент в конец списка
            size++;
        }
        //балансировка таблицы
        if ((1.0 * size) / numBuckets >= 0.7) {
            ArrayList<HashNode<K, V>> temp = bucketArray; //сохраняем старую таблицу
            numBuckets = 2 * numBuckets; //увеличиваем количество ячеек в таблице
            size = 0; //обнуляем количество элементов в таблице
            bucketArray = new ArrayList<>(numBuckets); //создаем новую таблицу
            for (int i = 0; i < numBuckets; i++) {
                bucketArray.add(null); //заполняем таблицу null
            }

            for (var node : temp) {
                while (node != null) { //обходим каждый связный список
                    add(node.getKey(), node.getValue()); //добавляем элементы из него в новую таблицу
                    node = node.next;
                }
            }

        }

    }

    public V get(K key) { //получает последнее значение по ключу
        int bucketIndex = getBucketIndex(key);
        HashNode<K, V> head = bucketArray.get(bucketIndex);
        while (head.next != null) {
            head = head.next;
        }
        return head.getValue();
    }

    public void remove(K key) { //удаляет последнее значение по ключу
        int bucketIndex = getBucketIndex(key);
        HashNode<K, V> head = bucketArray.get(bucketIndex);
        while (head.next.next != null) {
            head = head.next;
        }
        head.next = null;
        size--;
    }

    private int getBucketIndex(K key) { //получение индекса по объекту
        int hashCode = key.hashCode(); //получаем хеш-код ключа
        int index = hashCode % numBuckets; //получаем индекс ячейки в таблице
        return index;
    }

    public void print() {
        System.out.println("Вывод хеш-таблицы:");
        for (var node : bucketArray) {

            while (node != null) {
                System.out.print(node.getValue() + " ");
                node = node.next;
            }
            System.out.println();
        }
        System.out.println("Количество элементов в хеш-таблице: " + size);
    }

    public static void main(String[] args) {
        hashtab<String, Integer> map = new hashtab<>();
        map.add("one", 1);
        map.add("two", 2);
        map.add("three", 3);
        map.add("four", 4);
        map.add("five", 5);
        map.add("one", 10);
        map.print();
        System.out.println("Получение значения по ключу: " + map.get("one"));
        map.remove("one");
        map.print();
    }
}