import java.util.Comparator;
import java.util.List;

public class TestBinarySearch {

    public static void main(String[] args) {
        testArrayBinarySearch();
        testCollectionBinarySearch();
    }

    private static void testArrayBinarySearch() {
        int[] intArray = {1, 2, 3, 4, 5};
        int index = Arrays.binarySearch(intArray, 3);
        System.out.println("Index of 3: " + index); // Expect 2

        String[] strArray = {"a", "b", "c", "d"};
        int strIndex = Arrays.binarySearch(strArray, "c", String::compareTo);
        System.out.println("Index of 'c': " + strIndex); // Expect 2
    }

    private static void testCollectionBinarySearch() {
        List<String> list = List.of("apple", "banana", "cherry");
        int index = Collections.binarySearch(list, "banana");
        System.out.println("Index of 'banana': " + index); // Expect 1

        Comparator<String> comp = String::compareToIgnoreCase;
        int compIndex = Collections.binarySearch(list, "Cherry", comp);
        System.out.println("Index of 'Cherry': " + compIndex); // Expect 2
    }
}