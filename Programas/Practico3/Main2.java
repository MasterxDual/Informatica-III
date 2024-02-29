package Practico3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

import Practico3.utils.Person;

public class Main2 {
    public static void main(String[] args) {
        /* The ArrayList class is a Java class that you can use to store lists of objects.
           You can also store objects in an array, but arrays have a couple of obvious problems.
         * To create an array, you have to specify a size for the array. Sometimes you won't know
           what size array you will need at the instant you create the array.
         * Although it is possible to resize arrays by creating a new, larger array and 
           copying data over from the old array, doing this is clunky and awkward.
         * The primary goal of the Java ArrayList class is to provide a class that replicates many of the features of arrays,
           while adding some new features that are designed to work around the problems listed above.
              Common uses:
         * Dynamic data storage: ArrayLists are useful when you need a data structure that can grow or shrink 
           in size dynamically, such as a list of items in a task list or results of a query.
         * Collection Iteration and Processing: Can be used to store and process collections of data that need
           to be iterated, filtered, or transformed, such as records from a log file or results from a database.
         * Implementation of data structures: They are often used as a basis for implementing other more complex
           data structures, such as stacks, queues, or linked lists.
              Time Complexities:
         * Random access takes O(1) time.
         * Adding element takes amortized constant time O(1).
         * Inserting/Deleting takes O(n) time.
         * Searching takes O(n) time for unsorted array and O(log n) for a sorted one.
              Advantages:
         * Dynamic size: can dynamically grow and shrink in size as elements are added or removed.
         * Random Access: Elements can be accessed using their index, allowing for fast retrieval.
         * Data Manipulation: ArrayList provides methods for adding, removing, and updating elements. 
         * Object based: ArrayList can store only Objects data types. They cannot be used for primitive
           data types (int, float, etc). We require a wrapper class in that case.
         * Not Synchronized: ArrayList in Java is not synchronized, we can use the Vector class 
           for the synchronized version. It means ArrayList operations are not thread-safe and 
           multiple threads should not operate on the same ArrayList object at the same time.
              Disadvantages:
         * Performance Overhead: ArrayList may have performance overhead when elements are added 
           or removed, as it may require resizing the internal array.
         * Memory Overhead: ArrayList may consume more memory than necessary if it is
           initially allocated with a large capacity but does not use all of it.
         * Slower Insertions and Deletions: Inserting or deleting elements in the middle
           of an ArrayList can be slower compared to other data structures like LinkedList.
        */
        ArrayList<Person> people = new ArrayList<>();

        /* A Linked List is a linear data structure that is used to store a collection of data with the help of 
           nodes. A linked list is made up of two items that are data and a reference to the next node. A reference
           to the next node is given with the help of pointers and data is the value of a node. Each node 
           contains data and links to the other nodes.
              Common uses:
         * Linked Lists are used to implement stacks and queues.
         * It is used for the various representations of trees and graphs.
         * It is used in dynamic memory allocation( linked list of free blocks).
         * It is used for representing sparse matrices.
         * It is used for the manipulation of polynomials.
         * It is also used for performing arithmetic operations on long integers.
         * It is used for finding paths in networks.
         * In operating systems, they can be used in Memory management, process scheduling and file system.
         * Linked lists can be used to improve the performance of algorithms that need to frequently insert 
           or delete items from large collections of data.
         * Implementing algorithms such as the LRU cache, which uses a linked list to keep track of
           the most recently used items in a cache.
         * Linked Lists are mostly used because of their effective insertion and deletion. 
         * Insertion and deletion in the linked list are very effective and take less time 
           complexity as compared to the array data structure.
              Time Complexity:
         * Accessing, insertion, or deletion at the beginning and searching for an element, where n is the number of elements is O(n).
         * Insertion and deletion at the beginning or end take O(1) time in a doubly linked list due to direct access to the 
           head and tail nodes. 
         * Space complexity for both types of linked lists is O(n), as each element requires space for its data and pointers 
           to the next (and possibly previous) node, resulting in linear space usage proportional to the number of elements.
              Advantages:
         * Dynamic size: Linked lists do not have a fixed size, so you can add or remove elements as needed, without having 
           to worry about the size of the list. 
         * Efficient Insertion and Deletion: Inserting or deleting elements in a linked list is fast and efficient, as you
           only need to modify the reference of the next node, which is an O(1) operation.
         * Memory Efficiency: Linked lists use only as much memory as they need, so they are more efficient with memory
           compared to arrays, which have a fixed size and can waste memory if not all elements are used. 
         * Easy to Implement: Linked lists are relatively simple to implement and understand compared
           to other data structures like trees and graphs.
         * Flexibility: Linked lists can be used to implement various abstract data types, 
           such as stacks, queues, and associative arrays.
         * Easy to navigate: Linked lists can be easily traversed, making it easier to find specific elements
           or perform operations on the list.
              Disadvantages:
         * Slow Access Time: Accessing elements in a linked list can be slow, as you need to traverse the linked list 
           to find the element you are looking for, which is an O(n) operation. This makes linked lists a poor 
           choice for situations where you need to access elements quickly.
         * Higher overhead: Linked lists have a higher overhead compared to arrays, as each node in a linked
           list requires extra memory to store the reference to the next node.
         * Cache Inefficiency: Linked lists are cache-inefficient because the memory is not contiguous. This
           means that when you traverse a linked list, you are not likely to get the data you need in the cache, leading to cache misses and slow performance.
         * Extra memory required: Linked lists require an extra pointer for each node, which takes up extra memory. This can be a problem when you are working
           with large data sets, as the extra memory required for the pointers can quickly add up. 
         * In conclusion, if you need fast access time, arrays might be a better choice, but if you need to
           insert or delete elements frequently, linked lists might be the better choice.
        */
        LinkedList<Person> people2 = new LinkedList<>();

        /* HashMap is a class in Java that provides a way to store and retrieve key-value pairs.
           It is part of the Java Collections Framework and is based on the hash table data structure.
           Each key is mapped to a value, which can be any Java object. The key must be unique
           within the HashMap, but the same value can be associated with multiple keys.
           Hashing is used to provide fast access to the elements in the map. When a key-value
           pair is added to the map, the key is hashed to generate an index into an array of 
           buckets. Each bucket contains a linked list of elements with the same hash code. 
           When a key is used to retrieve a value, its hash code is used to locate the appropriate 
           bucket, and the linked list is searched for the key.
              Common uses:
         * Counting Frequency: count the frequency of elements in a collection.
         * Data Structure Representation: HashMap can also represent data structures like Graphs. 
           For instance, an adjacency list representation of a Graph can be implemented with a 
           HashMap where nodes are keys and the corresponding adjacent nodes are values.
         * Fast data indexing: HashMaps are ideal for indexing large volumes of data efficiently.
         * Management of data caches in web applications: In web applications, HashMaps are very useful 
           for storing temporary data in the server memory. You can use a HashMap to store user session 
           information, authentication data, or configuration information that you need to maintain 
           during the lifecycle of an HTTP request.
         * Implementation of dictionaries and symbol tables: HashMaps are the basis of implementations 
           of dictionaries and symbol tables in Java. You can use a HashMap to map words to definitions 
           in a dictionary, or to map variable names to values in a programming language runtime environment.
         * Caching: HashMaps are commonly used for caching data, where the key represents 
           the data identifier and the value is the data itself. This reduces the need for 
           expensive operations like database or network operations, as the data can be quickly retrieved using the key.
              Time Complexity:
         * Insertion, lookup, and deletion in a well-designed hash map is O(1) on average. 
         * Insertion, Lookup and Deletion (worst): O(n), where n is the size of the hash map. 
           This occurs when there are many hash collisions, leading to linear probing or other 
           collision resolution strategies that may involve traversing the entire hash map.
         * The space complexity is typically O(n). Where n is the number of key-value pairs 
           stored in the hash map. Each key-value pair occupies constant space, and the space 
           required grows linearly with the number of elements.
              Advantages:
         * Speedy Retrieval: The retrieval and insertion of elements are quick. 
           Searching for elements in a HashMap is done in constant time, which means 
           that the search speed does not depend on the size of the map.
         * Flexibility: It allows null keys and values. It can store key-value pairs of any data type in Java.
         * Key-value data structure: HashMaps are useful for associating values with keys. This is especially 
           useful when you need to store and retrieve data based on a unique identifier (key).
         * Storage: While mapping keys to indices in an array, HashMap uses a hashing function. This helps in the 
           instant lookup of values based on keys, and efficient data storage in Java.
            Disadvantages:
         * No thread-safety: Data inconsistencies in Java increase if multiple threads access 
           it simultaneously. Thus, they are not thread safe.
         * Unordered Iteration: The elements in a HashMap are not stored in a specific order. 
           Therefore, if you need to iterate over elements in a specific order (such as insertion order), 
           you will need to use a different data structure, such as LinkedHashMap.
         * Performance Drop: Performance degradation is a very real possibility. Sometimes, due to poor 
           implementation of the hashing function or a high load factor, the performance can be affected.
         * Higher memory usage: It can use more memory compared to other data structures in Java. 
           This is because it uses an underlying array.
        */
        Map<String, Integer> agesMap = new HashMap<>();

        /* The TreeMap in Java is a data structure that implements the Map interface using a Red-Black tree.
           Sometimes you need to store data in a structured way and be able to navigate through it. 
           In this case, another implementation of the Map interface (TreeMap) comes to the rescue. 
           TreeMap implements the Navigable Map interface, which inherits Sorted Map, which in turn inherits the Map interface. 
           By implementing the NavigableMap and SortedMap interfaces, TreeMap receives additional functionality that is not available 
           in HashMap, but it pays a price in terms of performance. 
         *    Common uses:
         * Implementing complex data structures: You can use a TreeMap as a base to implement more complex data structures, 
           such as a MultiMap (a map that can contain multiple values for a given key), or an IntervalMap 
           (a map that can map intervals to values).
         * Ranges and Submaps: TreeMaps allow you to perform range operations, such as obtaining a subset of elements 
           within a specific range of keys. This can be useful in situations where you need to work with a subset 
           of the elements in the map.
         * Maintain an ordered collection of elements: One of the main advantages of a TreeMap is that it keeps 
           its elements ordered according to the key. This can be useful when you need to keep a collection of 
           items in a specific order, such as ordering words in a dictionary, names in a phone list, or dates on a calendar.
              Time Complexity:
         * Insertion, deletion, search, min/max retrieval are O(log n).
         * Iteration through all elements: O(n), where 'n' is the number of elements in the TreeMap.
         * Space complexity is O(n), where 'n' is the number of key-value mappings stored in the TreeMap.
              Advantages:
         * Ordered: The elements in a TreeMap are ordered according to their natural ordering (increasing order) 
           or a custom comparator, which can be useful for certain applications.
         * Efficient retrieval: TreeMap provides efficient retrieval of elements based on their keys, with a time 
           complexity of O(log n) for operations like get, put, and remove.
         * NavigableMap operations: TreeMap implements the NavigableMap interface, 
           providing navigational methods for querying the map based on the order of the keys.
         * Efficiency in lookup and access operations: Like HashMaps, TreeMaps also use an underlying binary 
           search tree structure, allowing efficient lookup and access operations in logarithmic time (O(log n)).
         * Iteration in order: Since the elements of a TreeMap are sorted by key, you can iterate over them in 
           ascending or descending order using the forEach, keySet, entrySet, etc. methods.
              Disadvantages:
         * Memory consumption: TreeMaps can consume more memory than other data structures due to the overhead 
           associated with maintaining the ordered search tree structure. This can be especially noticeable 
           in large data collections.
         * Slower insertion and deletion: While retrieval is efficient, insertion and deletion operations 
           in a TreeMap have a time complexity of O(log n), which can be slower than HashMap for large datasets, 
           especially in situations where the tree needs to be rebalanced to maintain its order property.
         * Not thread-safe: TreeMap is not thread-safe by default, so concurrent access to a TreeMap 
           without proper synchronization can lead to data inconsistency.
         * Complexity in order customization: If you need to customize the order of elements based on 
           something other than the key, such as a custom comparator, it can be a little more complicated 
           to implement compared to other data structures.
        */
        Map<String, Integer> agesMap2 = new TreeMap<>();

        /* A linkedHashMap in Java is a hybrid data structure that implements the Map interface using 
           a hash table and a linked list, providing predictable iteration order. You can access 
           and manipulate key-value pairs in the order they were inserted, unlike a regular HashMap.
           A LinkedHashMap is a Map, meaning it stores key-value pairs. The keys are unique, and each 
           key maps to a specific value. However, unlike a regular HashMap, a LinkedHashMap also 
           maintains the order in which keys were inserted. This is where it gets its 
           name – it’s a HashMap that is also a LinkedList.
         *    Common uses:
         * Storing settings or properties in predefined order: If you need to maintain an ordered list 
           of settings or properties in your application, a LinkedHashMap allows you to store them in 
           the order in which they are specified, making it easier to later retrieve and process them.
         * Implementation of caches with LRU (Least Recently Used) replacement policy: A LinkedHashMap 
           can be used to implement a cache with LRU replacement policy. Setting the third parameter of 
           the LinkedHashMap constructor to true activates access mode, which reorders elements according 
           to the order in which they are accessed. This allows the least recently used items to be 
           automatically removed when the cache capacity is reached.
         * Iteration in insertion order: If you need to iterate over the elements of a map in 
           the same order in which they were inserted, a LinkedHashMap guarantees that you 
           maintain that order. This can be useful in situations where insertion order is 
           important, such as log processing or maintaining the history of actions in an application.
         *    Time Complexity:
         * Insertion, remove and search have O(1) (best and worst case). Search has O(n) in worst case (when 
           there are hash collisions and you need to traverse the elements in a linked list).
         * Iteration (entrySet, keySet, values): O(n), where 'n' is the number of elements in the 
           LinkedHashMap. Iterating over all map elements requires visiting each element 
           once, which takes linear time based on the size of the map.
         *    Advantages:
         * Retains insertion order: LinkedHashMap maintains the order in which elements are 
           inserted, which can be useful for iterating through the map in a predictable order.
         * Faster iteration: Iterating through a LinkedHashMap is faster compared to a HashMap 
           because of the doubly linked list used to maintain the insertion order.
         * Implementation of Map interface and navigability: Like HashMap, LinkedHashMap 
           implements the Map interface and also the NavigableMap interface, allowing 
           advanced navigation operations to be performed on the map.
         * Access order: LinkedHashMap can be configured to maintain elements based on their 
           access order, which can be useful for implementing LRU (Least Recently Used) caching. 
         *    Disadvantages:
         * Higher memory overhead: LinkedHashMap has a higher memory overhead compared to 
           HashMap due to the additional pointers for maintaining the insertion order.
         * Slower insertion and deletion: Insertion and deletion operations in a LinkedHashMap 
           are slower compared to a HashMap due to the additional overhead of maintaining the insertion order.
         * Increased complexity: Maintaining insertion order introduces additional complexity to LinkedHashMap 
           implementation and operations compared to HashMap, which could slightly impact performance and code complexity.
        */
        Map<String, TreeMap<String, Integer>> linkedHashMap = new LinkedHashMap<>();

        /*int count = 1;

        people.add(new Person("Agustin", 26));
        people.add(new Person("Nicolas", 28));
        people.add(new Person("Ariela", 51));
        people.add(new Person("Daniel", 51));
        
        System.out.println("Complete list:");
        for (Person person : people) {
            System.out.println("Person " + count);
            System.out.println("Name: " + person.name() + ", Age: " + person.age());
            count++;
        }
        
        System.out.println("Printing element 1:");
        System.out.println(people.get(0));

        System.out.println("Eliminating element 3:");
        System.out.println(people.remove(2));

        System.out.println("Complete list after eliminating element 3:");
        for (int t = 0; t < people.size(); t++) {
            System.out.println("Person " + (t + 1));
            System.out.println(people.get(t));
        } */
        
        /* people2.add(new Person("Gabriel", 10));
        people2.add(new Person("Guibert", 60));
        people2.add(new Person("Eduardo", 30));
        people2.add(new Person("Ricardo", 20));

        System.out.println("Complete linked list:");
        /*Usando lambda function:
        people2.forEach(elemento -> System.out.println(elemento)); */
        //Usando una referencia a un metodo:
        /* people2.forEach(System.out::println);

        System.out.println("Last person in the linked list:");
        System.out.println(people2.getLast());

        System.out.println("Person 3:");
        /*System.out.println(people2.get(2));*/
        //Usando lambda function:
        /* 
        int[] count = {0};

        people2.forEach((elemento) -> {
            if(count[0] == 2) {
                System.out.println(elemento);
            }
            count[0]++;
        });

        count[0] = 0;
        System.out.println("Eliminated person 1 from the linked list:");
        people2.remove();
        people2.forEach(System.out::println);
        */

        /* agesMap.put("Juan", 30);
        agesMap.put("Pedro", 25);
        agesMap.put("Maria", 40);
        agesMap.put("Jose", 35);

        System.out.println("HashMap before elimination:");
        agesMap.forEach((name, age) -> {
            System.out.println("Name: " + name + ", Age: " + age);
        });

        System.out.println("Age of Maria: " + agesMap.get("Maria"));

        String dataToEliminate = "Jose";
        System.out.println(dataToEliminate + " was eliminated from the map, with " + agesMap.remove(dataToEliminate) + " years.");
        System.out.println("HashMap after elimination:");
        agesMap.forEach((name, age) -> {
            System.out.println("Name: " + name + ", Age: " + age);
        }); */

        /* agesMap2.put("Carlos", 10);
        agesMap2.put("Martin", 26);
        agesMap2.put("Leandro", 30);

        System.out.println("TreeMap before elimination:");
        for(Map.Entry<String, Integer> entry : agesMap2.entrySet()) {
          System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }

        String nameToFind = "Leandro";
        System.out.println("Name to find: " + nameToFind + ", Age: " + agesMap2.get(nameToFind));

        String nameToRemove = "Carlos";
        agesMap2.remove(nameToRemove);
        System.out.println("TreeMap after eliminating element with key " + nameToRemove);
        agesMap2.forEach((key, value) -> {
          System.out.println("Name: " + key + ", Age: " + value);
        });
         */

        TreeMap<String, Integer> treeMap1 = new TreeMap<>();

        treeMap1.put("Gabriel", 25);
        treeMap1.put("Valentina", 23);
        treeMap1.put("Alejo", 25);
        linkedHashMap.put("Students A", treeMap1);

        TreeMap<String, Integer> treeMap2 = new TreeMap<>();
        
        treeMap2.put("Juan", 9);
        treeMap2.put("Carlitos", 20);
        treeMap2.put("Gregorio", 19);
        linkedHashMap.put("Students B", treeMap2);

        System.out.println("Linkedhashmap before elimination:");
        linkedHashMap.forEach((team, treeMap) -> {
          System.out.println("Team: " + team);
          treeMap.forEach((name, age) -> {
            System.out.println("Name: " + name + ", Age: " + age);
          });
        });

        String team = "Students B";
        System.out.println("Equipo: " + team);
        linkedHashMap.get(team).forEach((name, age) -> {
          System.out.println("Name: " + name + ", Age: " + age);
        });
        System.out.println(linkedHashMap.get(team));

        String teamToRemove = "Students A";
        linkedHashMap.remove(teamToRemove);
        System.out.println("Linkedhashmap after elimination:");
        for (Map.Entry<String, TreeMap<String, Integer>> entry : linkedHashMap.entrySet()) {
          System.out.println("Team: " + entry.getKey());
          for (Map.Entry<String, Integer> innerEntry : entry.getValue().entrySet()) {
            System.out.println("Name: " + innerEntry.getKey() + ", Age: " + innerEntry.getValue());
          }
        }

    }
}
