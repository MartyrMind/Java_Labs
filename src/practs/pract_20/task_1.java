package practs.pract_20;

public class task_1<T, V, K>{
    private T t;
    private V v;
    private K k;

    public task_1(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public void printTypes() {
        System.out.println("Type of T is " + t.getClass().getName());
        System.out.println("Type of V is " + v.getClass().getName());
        System.out.println("Type of K is " + k.getClass().getName());
    }
    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public static void main(String[] args) {
        task_1<String, Integer, Double> t = new task_1<>("Hello", 1, 1.0);
        t.printTypes();

    }
}
