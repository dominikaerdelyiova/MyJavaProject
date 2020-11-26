package sk.kosickaakademia.dominika.erdelyiova;

import java.util.*;
public class JavaExample {
    public static void main(String args[]){
        ArrayList<String> alist=new ArrayList<String>();
        alist.add("Marek");
        alist.add("Tom");
        alist.add("Lucy");
        alist.add("Patrik");
        alist.add("Anna");
        alist.add("Peter");

        System.out.println(alist);

        //adding "Denis" at the fourth position
        alist.add(3, "Denis");

        System.out.println(alist);
    }
}

