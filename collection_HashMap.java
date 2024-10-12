import java.util.Map;
import java.util.HashMap;
public class collection_HashMap {
    public static void main(String[] args) {
        Map<String, Integer> marksMap = new HashMap();
        marksMap.put("John", 80);
        marksMap.put("David", 90);
        marksMap.put("Mathew", 85);
        marksMap.put("Smith", 95);
        System.out.println("Marks of John: "+marksMap.get("John"));
        System.out.println("Marks of David: "+marksMap.get("David"));
        System.out.println("Marks of Mathew: "+marksMap.get("Mathew"));
        System.out.println("Marks of Smith: "+marksMap.get("Smith"));
        marksMap.remove("John");
        System.out.println("After removing John");
        System.out.println("Marks of John: "+marksMap.get("John"));
        System.out.println("Size of the map is: "+marksMap.size());
    }
    
}
