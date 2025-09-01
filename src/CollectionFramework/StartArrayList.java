package CollectionFramework;

import java.util.ArrayList;

public class StartArrayList {
    public static void main(String[] args) {
        //Create ArrayList in java
        ArrayList<String> arr=new ArrayList<String>();

        //add element
        arr.add("Amit");
        arr.add("Sumit");
        arr.add("Pankaj");
        arr.add("Ashish");


        //Iterating
        for(String arrayList:arr){
            System.out.println(arrayList);
        }

        //Access by index
        System.out.println("Access first Element:-"+arr.get(0));

        //Remove element
        arr.remove("Amit");

        System.out.println("After Remove Element : "+arr);
    }
}
