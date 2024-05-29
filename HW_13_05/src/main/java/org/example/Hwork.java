package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static class Hwork {
    public static void main(String[] args) {

        System.out.println(onlyEven(
                        List.of(1,3,5,8, 10)
                )
        );

        System.out.println(
                secondBiggest(
                        List.of(1,3,5,8, 10)
                )
        );

        System.out.println(
                reverse(
                        new ArrayList<>(List.of(1,2,3))
                )
        );
    }

    //Task 1
    public static List<Integer> onlyEven(List<Integer> l) {
        List<Integer> r = new ArrayList<>();     for (Integer i : l) {
            if(i % 2 == 0) {
                r.add(i);
            }
        }
        return r; }
}

//Task 2

public static Integer secondBiggest(List<Integer> l) {
    if( l == null && l.size() <= 1) {
        return null;
    }
    List<Integer> r = new ArrayList<>(l);
    Collections.sort(r);
    return r.get(r.size() - 2);
}

//Task 3
public static List<Integer> reverse(List<Integer> l) {
    if( l == null) {
        return null;
    }
    for (int i = 0; i < l.size()/2; i++) {
        Integer temp = l.get(i);
        l.set(i, l.get(l.size() - 1 - i));
        l.set(l.size() - 1 - i, temp);
    }
    return l;
}

public void main() {
}



