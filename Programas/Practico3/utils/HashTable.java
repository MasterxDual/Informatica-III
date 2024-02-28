package Practico3.utils;

import java.util.LinkedList;

public class HashTable <T extends Comparable<T>, V extends Comparable<V>> {
    private Class<T> keyType;
    private Class<V> valueType;
    private static final int DEFAULT_CAPACITY = 10;
    private LinkedList<Entry<T, V>>[] table;
    private int currentSize;

    @SuppressWarnings("unchecked")
    public HashTable(Class<T> keyType, Class<V> valueType) {
        this.keyType = keyType;
        this.valueType = valueType;
        table = new LinkedList[DEFAULT_CAPACITY];
        currentSize = 0;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    /**
     * Verifies if hash table is empty or not.
     * @return true if empty, otherwise returns false.
     */
    public boolean isEmpty() {
        return currentSize == 0;
    }

    /**
     * Calculates hash index of a key
     * @param key to calculate it's index.
     * @return hash index.
     */
    private int hash(T key) {
        if(keyType.equals(String.class)) {
            int hashVal = 0;

            for(int p = 0; p < key.toString().length(); p++) {
                hashVal = (hashVal * 128 + key.toString().charAt(p)) % table.length;
            }
            return hashVal;
        } else if(keyType.equals(Integer.class)) {
            return Math.abs((int)key.hashCode()) % table.length;
        } else if(keyType.equals(Double.class)) {
            return Math.abs((int)key.hashCode()) % table.length;
        }
        return 0;
    }

    /**
     * Inserts a key, value in the hash table.
     * @param key that identifies the value.
     * @param value to be inserted.
     */
    public void put(T key, V value) {
        int index = hash(key);

        //If there's nothing in the hash table at the index:
        if(table[index] == null) {
            table[index] = new LinkedList<>();
        }

        //Verifies if the key exists and updates his value (if key exists):
        for(Entry<T, V> entry : table[index]) {
            if(entry.key.compareTo(key) == 0) {
                entry.value = value;
                return;
            }
        }

        //If key don't exists, we add a new entry:
        table[index].add(new Entry<>(key, value));
        currentSize++;
    }

    /**
     * Obtains a value associated with a key in the hash table.
     * @param key to search for in the hash table.
     * @return value associated with the key parameter, otherwise returns null.
     */
    public V get(T key) {
        int index = hash(key);
        
        if(table[index] != null) {
            for(Entry<T, V> entry : table[index]) {
                if(entry.key.compareTo(key) == 0) {
                    return entry.value;
                }
            }
        }
        //Key wasn't found:
        return null;
    }

    /**
     * Removes (if exists in the hash table) the element that contains the 'key' parameter.
     * If doesn't exists, returns false.
     * @param key to search for.
     * @return true if was removed, otherwise returns false.
     */
    public boolean remove(T key) {
        int index = hash(key);
        
        if(table[index] != null) {
            LinkedList<Entry<T, V>> bucket = table[index];
            for(Entry<T, V> entry : bucket) {
                if(entry.key.compareTo(key) == 0) {
                    currentSize--;
                    return bucket.remove(entry);
                }
            }
        }
        return false;
    }

    /**
     * Iterates through the hash table and prints each "bucket" (position in the table). 
     * If the bucket is empty, print (empty). If there are items in the bucket, it prints
     * each entry, which consists of the key and the associated value in parentheses.
     */
    public void printHashTable() {
        for(int r = 0; r < table.length; r++) {
            if(table[r] != null) {
                System.out.println("Posicion en la tabla " + r + ": ");
                LinkedList<Entry<T, V>> bucket = table[r];

                for(Entry<T, V> entry : bucket) {
                    System.out.println("(" + entry.key + ", " + entry.value + ") ");
                }
                System.out.println();
            } else {
                System.out.println("Posicion en la tabla " + r + ": (empty)");
            }
        }
    }

    private static class Entry <T extends Comparable<T>, V extends Comparable<V>> {
        private T key;
        private V value;

        public Entry(T key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
