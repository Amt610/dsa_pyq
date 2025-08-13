package Trees;

import java.util.ArrayList;
import java.util.Vector;

public class VectorArrayList {
    public static void main(String[] args) {
        //create java ArrayList
        ArrayList<Integer> ar=new ArrayList<Integer>();

        //add element
        ar.add(25);
        ar.add(45);
        ar.add(47);
        ar.add(54);
        ar.add(78);

        for (int i = 0; i <ar.size(); i++) {
            System.out.println(ar.get(i));
        }

        //Create Vector programme
        Vector<Integer> vt=new Vector<Integer>();
        vt.add(88);
        vt.add(322);

        System.out.println("This is java Vector List Programme Output start");
        for (int i = 0; i < vt.size(); i++) {
            System.out.println(vt.get(i));
        }
    }
}
