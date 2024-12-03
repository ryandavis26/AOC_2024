

import java.util.HashMap;
import java.util.List;

public class Day1 {


    /**
     * Takes in two sorted lists and calculates the sum of the difference at
     * an individual index
     * @return The sum of the differences in the list
     */
    public static int listDifference(List<Integer> l1, List<Integer> l2){
        int sumOfDiff = 0;
        for (int i = 0; i < l1.size(); i++) {
            sumOfDiff += Math.abs(l1.get(i) - l2.get(i));
        }
        return sumOfDiff;
    }

    /**
     * Goes through the second list and calculates the number of occurrences in the list
     * @return
     */
    public static HashMap<Integer, Integer> calculatePopularity(List<Integer> l2){
        HashMap<Integer, Integer> numberOfOccurrence = new HashMap<>();
        for (int element: l2){
            if (numberOfOccurrence.containsKey(element)){
                numberOfOccurrence.put(element, numberOfOccurrence.get(element) + 1);
            }else {
                numberOfOccurrence.put(element, 1);
            }
        }
        return numberOfOccurrence;
    }

    public static int calculateSimilarity(List<Integer> l1, List<Integer> l2){
       HashMap<Integer, Integer> popularity = Day1.calculatePopularity(l2);

       int similaritySum = 0;
       for (int element : l1){
           if (popularity.containsKey(element)){
               similaritySum += element * popularity.get(element);
           }
       }
       return similaritySum;
    }
}
