package Practico3.tests;

import Practico3.utils.HashTable;

public class HashTableTest <T extends Comparable<T>, V extends Comparable<V>> {

    /**
     * Creates a new hash table, inserting (keys, values): "Primero", 11; "Segundo", 12; "Quinto", 106; "Ultimo", 111 respectively.
     * @return hash table created.
     */
    public HashTable<String, Integer> createFirstHashTable() {
        HashTable<String, Integer> hashTable = new HashTable<>(String.class, Integer.class);

        hashTable.put("Primero", 11);
        hashTable.put("Segundo", 12);
        hashTable.put("Quinto", 106);
        hashTable.put("Ultimo", 111);
        System.out.println("Valor que contiene la llave 'Ultimo': " + hashTable.get("Ultimo"));

        return hashTable;
    }

    /**
     * Creates a new hash table, inserting (keys, values): 1.15, 50; 1.01, 100; 1.80, 150; 1.90, 200; 2.00, 250 respectively.
     * Then removes element with key '1.01', 1.80 respectively. Finally tries to remove element with key '2.50' but it doesn't exist,
     * so it prints that it wasn't found that element with key '2.50'.
     * @return hash table created.
     */
    public HashTable<Double, Integer> createSecondHashTable() {
        HashTable<Double, Integer> hashTable = new HashTable<>(Double.class, Integer.class);
        String k = "No, no se encontró esa llave.";

        hashTable.put(1.15, 50);
        hashTable.put(1.01, 100);
        hashTable.put(1.80, 150);
        hashTable.put(1.90, 200);
        hashTable.put(2.00, 250);
        System.out.println("¿Se pudo eliminar el elemento con clave '1.01'? " + (hashTable.remove(1.01) ? "Si" : k));
        System.out.println("¿Se pudo eliminar el elemento con clave '1.80'? " + (hashTable.remove(1.80) ? "Si" : k));
        System.out.println("¿Se pudo eliminar el elemento con clave '2.50'? " + (hashTable.remove(2.50) ? "Si" : k));
        
        return hashTable;
    }
}
