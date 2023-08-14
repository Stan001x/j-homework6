package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        SetImit setImit = new SetImit();
        System.out.println(setImit.add(1));
        System.out.println(setImit.add(1));
        System.out.println(setImit.add(2));
        System.out.println(setImit.add(6));
        System.out.println(setImit.delete(6));
        System.out.println(setImit.delete(6));
        System.out.println(setImit.size());
        System.out.println(setImit.isEmpty());
        System.out.println(setImit.contains(1));

        for (int i = 0; i<15; i++){
            setImit.add(new Random().nextInt(500));
        }
        Iterator<Integer> iterator = setImit.iterator();
        while (iterator.hasNext()){
            int i = iterator.next();
            System.out.print(i + " ");
        }
        System.out.println(setImit.getByIndex(6));


        }
    }

    class SetImit<E> {
        private HashMap<E, Object> map = new HashMap<>();
        private static final Object OBJECT = new Object();

        public boolean add(E num) {
            return map.put(num, OBJECT) == null;

        }

        public boolean delete(E num) {
            return map.remove(num, OBJECT);
        }

        public int size() {
            return map.size();
        }

        public boolean isEmpty() {
            return map.isEmpty();
        }

        public boolean contains(Object num) {
            return map.containsKey(num);
        }

        public Iterator<E> iterator() {
            return map.keySet().iterator();
        }


        public E getByIndex(int index) {
            E[] mapArray = (E[]) map.keySet().toArray();
            return mapArray[index];
        }
    }




