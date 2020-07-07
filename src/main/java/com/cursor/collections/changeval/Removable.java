package com.cursor.collections.changeval;

import java.util.ArrayList;
import java.util.Iterator;

public class Removable {

     public ArrayList<Integer> removeDivisible(ArrayList<Integer> arrayList) {
          Iterator<Integer> iterate = arrayList.iterator();
          while (iterate.hasNext()) {
               if (iterate.next() % 3 == 0) {
                    iterate.remove();
               }
          }
          return arrayList;
     }

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

     public void similarElements(ArrayList<Integer> firstList, ArrayList<Integer> secondList) {
          for (int value = 0; value < firstList.size(); value++) {
               for (int integer = 0; integer < secondList.size(); integer++) {
                    if (firstList.get(value).equals(secondList.get(integer))) {
                         System.out.println(secondList.get(integer) + " -- Same value on indexes : "
                                 + value + " (First ArrayList) " + " "
                                 + integer + " (Second ArrayList) ");
                    }
               }
          }
     }
}

