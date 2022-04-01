/**
 * @author Verlygo Dmitry
 * @version 1.0
 */

package com.star;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NewArrayList<Integer> list = new NewArrayList<>();
        list.add(4);
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(2);
        list.add(1);
        list.add(6);

 //       list.clear();
        NewArrayList.NewIterator itt = list.createIterator();
        while(itt.hasNext()) {
            System.out.println(itt.next());
        }
    }
}


