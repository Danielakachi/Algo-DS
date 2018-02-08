import java.util.*;
public class Iterator_ {
    public static void main(String[] args) {
        List<String> names=new ArrayList<String>();
        names.add("Daniel");
        names.add("Prince");
        names.add("Kelly");

        Iterator it=names.iterator();

        while (it.hasNext()) {
            String obj=it.next().toString();
            System.out.println(obj);
        }
    }
}