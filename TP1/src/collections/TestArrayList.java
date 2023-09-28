package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        // 1. Create and initialize a countries_list
        List<String> countries_list = new ArrayList<>();
        countries_list.add("USA");
        countries_list.add("China");
        countries_list.add("Japan");
        countries_list.add("Germany");
        countries_list.add("France");

        // 2. Display the number of elements in the list
        System.out.println("Number of elements in the list: " + countries_list.size());

        // 3. Display the elements of the countries_list
        displayList(countries_list);

        // 4. Modify the value at position 3 to "Tunisia"
        countries_list.set(2, "Tunisia");
        

        // 5. Sort the countries_list in ascending order
        Collections.sort(countries_list);

        // 6. Clear the list
        countries_list.clear();
    }

    private static void displayList(List<String> list) {
        System.out.println("Elements of the list:");
        for (String element : list) {
            System.out.println(element);
        }
    }
}
