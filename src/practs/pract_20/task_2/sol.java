package practs.pract_20.task_2;


import java.io.Serializable;

public class sol<T extends String, V extends Animal & Serializable, K extends Number> {
    private T t;
    private V v;
    private K k;

    public sol(T t, V v, K k) {
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
        //sol<String, Animal, Integer> error = new sol<>("Hello", new Animal(), 1);
        sol<String, Cat, Integer> t = new sol<>("Hello", new Cat(), 1);
        t.printTypes();

    }
}
