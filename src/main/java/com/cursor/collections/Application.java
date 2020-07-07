package com.cursor.collections;

import com.cursor.collections.changeval.Removable;

import java.util.ArrayList;

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

        Removable removeValue = new Removable();
        removeValue.similarElements(arrayList, arrayList2);
        System.out.println(removeValue.removeDivisible(arrayList));
        removeValue.replaceValue(stringArrayList);
        removeValue.replaceValue(stringArrayList);

    }
}

