//package chapter_3;
import java.util.*;
public class Program_java_04 {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(50);
        list.add(40);
        list.add(30);
        list.add(20);
        list.add(10);
        System.out.println("list before sorting:");
        System.out.print(list);

        Collections.sort(list); //used to sort ArrayList
        System.out.println("\nlist after sorting:");
        System.out.print(list);
    }
}
