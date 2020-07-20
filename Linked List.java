import java.util.LinkedList;

public class LinkedListClass {

    public static void main(String[] args) {
        LinkedList<String> object = new LinkedList<>();
        
        // 1. Insert Elements ("SPRING", "2020", "CSE", "331"
        object.add("SPRING");
        object.add("2020");
        object.add("CSE");
        object.add("331");
        
        // 2. Insert element "FINAL" at index 2
        object.add(2, "FINAL");
        
        // 3. Iterate through the List
        for (String str : object) {
            System.out.println(str);
        }
        
        // 4. Remove element "331"
        object.remove("331");
        
        // 5. Remove element at index 2
        object.remove(2);
    }
}
