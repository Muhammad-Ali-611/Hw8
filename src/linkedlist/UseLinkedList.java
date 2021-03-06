package linkedlist;

import java.util.*;

public class UseLinkedList {
    public static void main(String[] args) {
        List<String> cityList = new LinkedList<>();
        cityList.add("NY");
        cityList.add("FL");
        cityList.add("NJ");

        Iterator it = cityList.listIterator();
        while (it.hasNext());
        System.out.println(it.next());
    }
}