package ru.merkuzio;

import java.util.*;

public class Arrays {

    public static void main(String[] args) {
        ArrayListExample arrayListExample = new ArrayListExample();
        LinkedListExample linkedListExample = new LinkedListExample();
        HashSetExample hashSetExample = new HashSetExample();
        HashMapExample hashMapExample = new HashMapExample();
        DequeExample dequeExample = new DequeExample();

        arrayListExample.demo();
        linkedListExample.demo();
        hashSetExample.demo();
        hashMapExample.demo();
        dequeExample.demo();
    }

    private static class ArrayListExample {
        private ArrayList<String> list = new ArrayList<>();

        void demo() {
            System.out.println("ArrayList Example:");
            add("One");
            add("Two");
            add("Three");
            remove("Two");
            search("One");
            search("Two");
        }

        void add(String element) {
            list.add(element);
            System.out.println("Added: " + element);
            System.out.println("List at the moment: " + list);
        }

        void remove(String element) {
            list.remove(element);
            System.out.println("Removed: " + element);
            System.out.println("List at the moment: " + list);
        }

        void search(String element) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(element)) {
                    System.out.println("Found: " + element);
                    return;
                }
            }
            System.out.println("Not found: " + element);
        }
    }

    private static class LinkedListExample {
        private LinkedList<String> list = new LinkedList<>();

        void demo() {
            System.out.println("LinkedList Example:");
            add("One");
            add("Two");
            add("Three");
            remove("Two");
            search("One");
            search("Two");
        }

        void add(String element) {
            list.add(element);
            System.out.println("Added: " + element);
            System.out.println("List at the moment: " + list);
        }

        void remove(String element) {
            list.remove(element);
            System.out.println("Removed: " + element);
            System.out.println("List at the moment: " + list);
        }

        void search(String element) {
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                String item = iterator.next();
                if (item.equals(element)) {
                    System.out.println("Found: " + element);
                    return;
                }
            }
            System.out.println("Not found: " + element);
        }
    }

    private static class HashSetExample {
        private HashSet<String> set = new HashSet<>();

        void demo() {
            System.out.println("HashSet Example:");
            add("One");
            add("Two");
            add("Three");
            remove("Two");
            search("One");
            search("Two");
        }

        void add(String element) {
            set.add(element);
            System.out.println("Added: " + element);
            System.out.println("Set at the moment: " + set);
        }

        void remove(String element) {
            set.remove(element);
            System.out.println("Removed: " + element);
            System.out.println("Set at the moment: " + set);
        }

        void search(String element) {
            Iterator<String> iterator = set.iterator();
            do {
                String item = iterator.next();
                if (item.equals(element)) {
                    System.out.println("Found: " + element);
                    return;
                }
            } while (iterator.hasNext());
            System.out.println("Not found: " + element);
        }

    }

    private static class HashMapExample {
        private HashMap<Integer, String> map = new HashMap<>();

        void demo() {
            System.out.println("HashMap Example:");
            add(1, "One");
            add(2, "Two");
            add(3, "Three");
            remove(2);
            search(1);
            search(2);
        }

        void add(Integer key, String value) {
            map.put(key, value);
            System.out.println("Added: " + key + " -> " + value);
            System.out.println("Map at the moment: " + map);
        }

        void remove(Integer key) {
            map.remove(key);
            System.out.println("Removed: " + key);
            System.out.println("Map at the moment: " + map);
        }

        void search(Integer key) {
            for (Integer k : map.keySet()) {
                if (k.equals(key)) {
                    System.out.println("Found: " + key + " -> " + map.get(key));
                    return;
                }
            }
            System.out.println("Not found: " + key);
        }
    }

    private static class DequeExample {
        private Deque<String> deque = new ArrayDeque<>();

        void demo() {
            System.out.println("Deque Example:");
            add("One");
            add("Two");
            add("Three");
            remove();
            search("One");
            search("Two");
        }

        void add(String value) {
            deque.offerLast(value);
            System.out.println("Added: " + value);
            System.out.println("Deque at the moment: " + deque);
        }

        void remove() {
            String removed = deque.pollFirst();
            System.out.println("Removed: " + removed);
            System.out.println("Deque at the moment: " + deque);
        }

        void search(String value) {
            if (deque.contains(value)) {
                System.out.println("Found: " + value);
            } else {
                System.out.println("Not found: " + value);
            }
        }
    }
}
