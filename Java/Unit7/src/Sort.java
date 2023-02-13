import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Sort {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> sort = new ArrayList<Integer>();
        sort.add(5);
        sort.add(3);
        sort.add(4);
        sort.add(1);
        sort.add(6);
        sort.add(2);
        int minIndex= 0;
        for(int i=0; i<sort.size()-1; i++){
            minIndex=i;
            for(int j= i+1; j< sort.size(); j++){
                if(sort.get(j)< sort.get(minIndex)){
                    minIndex= j;
                }
                int temp= sort.get(minIndex);
                sort.set(minIndex, sort.get(i));
                sort.set(i, temp);
            }
        }
        System.out.print(sort);
    }
}