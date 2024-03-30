import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positiveNum = new ArrayList<>();
        for (Integer num : intList){
            if (num>0){
                positiveNum.add(num);
            }
        }
        List<Integer> evenNum = new ArrayList<>();
        for (Integer num : positiveNum){
            if (num % 2 == 0) {
                evenNum.add(num);
            }
        }
        evenNum.sort(Comparator.naturalOrder());
        System.out.println(evenNum);
    }
}