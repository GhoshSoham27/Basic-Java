import java.util.LinkedList;

public class Hashing {
    private int capacity = 10;
    private LinkedList<Integer>[] table;

    public Hashing() {
        table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) table[i] = new LinkedList<>();
    }

    private int hash(int key) {
        return key % capacity;
    }

    public void insert(int key) {
        int idx = hash(key);
        table[idx].add(key);
    }

    public boolean search(int key) {
        int idx = hash(key);
        return table[idx].contains(key);
    }

    public void delete(int key) {
        int idx = hash(key);
        table[idx].remove((Integer) key);
    }

    public static void main(String[] args) {
        Hashing h = new Hashing();
        h.insert(10);
        h.insert(20);
        h.insert(15);

        System.out.println("Search 20: " + h.search(20)); // true
        h.delete(20);
        System.out.println("Search 20 after deletion: " + h.search(20)); // false
    }
}