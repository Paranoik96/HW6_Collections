package com.cursor.collections;

import com.cursor.collections.interfaces.Removable;

import java.util.ArrayList;
import java.util.Iterator;

public class Application {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(9);
        arrayList.add(11);
        arrayList.add(18);
        arrayList.add(64);
        arrayList.add(20);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(4);
        arrayList2.add(8);
        arrayList2.add(9);
        arrayList2.add(38);
        arrayList2.add(20);
        arrayList2.add(12);

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Banana");
        stringArrayList.add("Grapes");
        stringArrayList.add("Pomegranates");
        stringArrayList.add("Pineapple");
        stringArrayList.add("Apple");
        stringArrayList.add("Peach");
        stringArrayList.add("Orange");
        stringArrayList.add("Blueberries");
        Removable removeValue = new Removable() {
            @Override
            public ArrayList<Integer> removeDivisible(ArrayList<Integer> arrayList) {
                Iterator<Integer> iterate = arrayList.iterator();
                while (iterate.hasNext()) {
                    if (iterate.next() % 3 == 0) {
                        iterate.remove();
                    }
                }
                return arrayList;
            }

            @Override
            public void replaceValue(ArrayList<String> arrayList) {
                int count = 0;
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i).equals("Orange")) {
                        arrayList.set(i, "Grapefruit");
                        count++;
                    }
                }
                if (count == 0) {
                    System.out.println("\nThat value not present.");
                } else {
                    System.out.println(arrayList);
                }
            }

            @Override
            public void similarElements(ArrayList<Integer> firstList, ArrayList<Integer> secondList) {
                for (int value = 0; value < arrayList.size(); value++) {
                    for (int integer = 0; integer < arrayList.size(); integer++) {
                        if (firstList.get(value).equals(secondList.get(integer))) {
                            System.out.println(secondList.get(integer) + " -- Same value on indexes : "
                                    + value + " (First ArrayList) " + " "
                                    + integer + " (Second ArrayList) ");
                        }
                    }
                }
            }
        };
        removeValue.similarElements(arrayList, arrayList2);
        System.out.println(removeValue.removeDivisible(arrayList));
        removeValue.replaceValue(stringArrayList);
        removeValue.replaceValue(stringArrayList);
    }
}

