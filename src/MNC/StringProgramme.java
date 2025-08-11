package MNC;

//What is difference between string and stringbuffers
public class StringProgramme {
    public static void main(String[] args) {
        //String is mutable
        String name="Amit";
        name+="Yadav";
        System.out.println("String effect:-"+name);//create a new object

        //String Builder
        StringBuilder sb=new StringBuilder("Hello World");
            sb.append("Rahull World");
        System.out.println("String Builder effect:-"+sb); //modified same object
    }
}
