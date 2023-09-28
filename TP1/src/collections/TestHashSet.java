package collections;
import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        // 1. Create and initialize a countriesSet
        Set<String> countriesSet = new HashSet<>();
        countriesSet.add("USA");
        countriesSet.add("China");
        countriesSet.add("Japan");
        countriesSet.add("Germany");
        countriesSet.add("France");

        // 2. Display the size of the countriesSet
        System.out.println("Size of the countriesSet: " + countriesSet.size());

        // 3. Display the elements of the countriesSet
        displaySet(countriesSet);

        // 4. Modify "Germany" to "Tunisia" if it exists
        countriesSet.remove("Germany");
        countriesSet.add("Tunisia");
        displaySet(countriesSet);

        // 5. Clear the set
        countriesSet.clear();
        displaySet(countriesSet);
    }

    private static void displaySet(Set<String> set) {
        System.out.println("Elements of the set: ");
        for (String element : set) {
            System.out.println(element);
        }
    }
}
