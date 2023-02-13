import java.io.FileNotFoundException;
import java.util.ArrayList;

public class insertionSort {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> insertionSort = new ArrayList<Integer>();
        insertionSort.add(5);
        insertionSort.add(3);
        insertionSort.add(4);
        insertionSort.add(1);
        insertionSort.add(6);
        insertionSort.add(2);
        for (int i = 1; i < insertionSort.size(); i++) {
            int temp = insertionSort.get(i);
            int index = i;
            while ((index > 0) && (insertionSort.get(index - 1) > temp)) {
                insertionSort.set(index, insertionSort.get(index - 1));
                index--;
            }
            insertionSort.set(index, temp);
        }
        System.out.print(insertionSort);
    }
}