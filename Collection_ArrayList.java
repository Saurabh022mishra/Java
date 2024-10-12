import java.util.ArrayList;
import java.util.List;
public class Collection_ArrayList {

    public static void main(String[] args) {
         List<String> namesList = new ArrayList();
         namesList.add("John");
            namesList.add("David");
            namesList.add("Mathew");
            namesList.add("Smith");
        for (String name : namesList) {
            System.out.println(name);

        }
        namesList.remove(0);
        System.out.println("After removing the first element");
        for (String name : namesList) {
            System.out.println(name);
        }
        namesList.add(1, "Tom");
        System.out.println("After adding Tom at index 1");
        for (String name : namesList) {
            System.out.println(name);
        }
        System.out.println("Size of the list is: "+namesList.size());
        System.out.println("Is the list empty? "+namesList.isEmpty());
        System.out.println("Does the list contain John? "+namesList.contains("John"));
        System.out.println("Index of Mathew is: "+namesList.indexOf("Mathew"));
        namesList.clear();
        System.out.println("After clearing the list");
        System.out.println("Size of the list is: "+namesList.size());
        System.out.println("Is the list empty? "+namesList.isEmpty());
        
    }
}