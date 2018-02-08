import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> AL=new ArrayList<String>();

        AL.add("Daniel");
        AL.add("Siggns");
        AL.add("Prince");
        AL.add("Sharon");
        AL.add("Mezue");

        System.out.println("Currently the array list has the following elements"+AL);

        // Add element at the given index
        AL.add(0,"Divine");
        AL.add(0,"Nobel");
        
        // remove elements from the array llist
        AL.remove("Daniel");
        AL.remove("Siggns");

        System.out.println("Current array list is "+AL);
        
        // Remove element from the given index;
        AL.remove(1);

        System.out.println("Current array list is  "+AL);
    }
    
}