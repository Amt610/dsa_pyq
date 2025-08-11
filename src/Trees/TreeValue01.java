package Trees;

import java.util.TreeMap;

public class TreeValue01 {
    public static void main(String[] args) {
        //Create java Tree value programme
        TreeMap<String,String> tr=new TreeMap<>();

        //show list of element before storing any element
        System.out.println("Elements before storing data:-"+tr);
        //using put object or class we can add element
        tr.put("Name","Amit");
        tr.put("Course","BCA");
        tr.put("Specilization","Computer Science");
        tr.put("University","VBSPU University");
        tr.put("Completing Year","2027");

        //show to data after storing some random data
        System.out.println(tr);


        //Access TreeMap Element
        System.out.println(tr.get("Name"));
        System.out.println(tr.get("Course"));
        System.out.println(tr.get("Specilization"));
        System.out.println(tr.get("University"));
        System.out.println(tr.get("Completing Year"));

        //Remove Element
        if (tr.remove("Specilization")=="Computer Science"){
            System.out.println("Successfully element is removed");
        }
        else{
            System.out.println("Not remove element");
        }

        System.out.println(tr);

        //TreeMap size
        System.out.println("TreeMap Size is:-"+tr.size());

        //TreeMap Clear
//        tr.clear();
//        System.out.println(tr);
//        System.out.println("After Clear TreeMap size is:-"+tr.size());

        //Loops in TreeMap
        for (String i:tr.values()){
            System.out.println("the element of TreeMap:-"+i);
        }

        //Loops in TreeMap for Values and
        for (String i:tr.keySet()){
            System.out.println("key:-"+i+" Values:-"+tr.get(i));
        }
    }
}

