//import java.util.ArrayList;
import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {

        //java collection framework(ArrayList)
        //classname object = new classname();
        ArrayList <Integer> list= new ArrayList<>();
        ArrayList <String> list2= new ArrayList<>();
        ArrayList <Boolean> list3= new ArrayList<>();

        //Add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(2, 10);

        System.out.println(list);
        //Get list element
        System.out.println(list.get(2));

        //Delete
        list.remove(4);
        System.out.println(list);

        //set element at index
        list.set(1, 0);
        System.out.println(list);

        //contains elemnet
        System.out.println(list.contains(1));
        System.out.println(list.contains(8));

        //size of list
        System.out.println(list.size());
    }
}
