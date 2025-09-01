package CollectionFramework;

import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        //Create java linked list programme
        LinkedList<Integer> lkd=new LinkedList<Integer>();

        //add element
        lkd.add(10);
        lkd.add(20);
        lkd.add(30);
        lkd.add(40);
        lkd.add(50);
        lkd.add(60);

        //add first element
        lkd.addFirst(1);

        //add last element
        lkd.addLast(0);

        //iterating
        for (int element:lkd){
            System.out.println(element);
        }

        //get first element by index number
        System.out.println("first element is: "+lkd.getFirst());

        //get last element by index number
        System.out.println("last element is: "+lkd.getLast());


        //remove first element
        System.out.println("Remove first element : "+lkd.removeFirst());

        //remove last element
        System.out.println("Remove last element : "+lkd.removeLast());

        //set first element
        System.out.println("set first element : "+lkd.set(0,1200));

        //first element is
        System.out.println("first element : "+lkd.getFirst());
    }
}
