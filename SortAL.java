import java.util.ArrayList;
import java.util.Collections;

public class SortAL {
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>();
        
        //Add element
            list.add(2);
            list.add(5);
            list.add(9);
            list.add(3);
            list.add(6);
            System.out.println(list);

            Collections.sort(list);//Assending order
            System.out.println("Assending "+list);

            Collections.sort(list,Collections.reverseOrder());
            System.out.println("Descending "+list);
    }
}
