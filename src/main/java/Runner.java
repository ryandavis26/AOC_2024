import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Runner {
    public static void main(String[] args) {
        int dayOneP1Result = Runner.initDay1P1();
        int dayOneP2Result = Runner.initDay1P2();
        System.out.println(dayOneP1Result);
        System.out.println(dayOneP2Result);
    }

    public static int initDay1P1(){
        try {
            BufferedReader in = new BufferedReader(new FileReader("src/main/resources/advent_2024_day1_input.txt"));
            String curline = "";
            ArrayList<Integer> l1 = new ArrayList<>();
            ArrayList<Integer> l2 = new ArrayList<>();
            while ((curline = in.readLine()) != null){
                String[] splitCurLine = curline.split("\\s+");
                l1.add(Integer.parseInt(splitCurLine[0]));
                l2.add(Integer.parseInt(splitCurLine[1]));
            }
            Collections.sort(l1);
            Collections.sort(l2);

            return Day1.listDifference(l1,l2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static int initDay1P2(){
        try {
            BufferedReader in = new BufferedReader(new FileReader("src/main/resources/advent_2024_day1_input.txt"));
            String curline = "";
            ArrayList<Integer> l1 = new ArrayList<>();
            ArrayList<Integer> l2 = new ArrayList<>();
            while ((curline = in.readLine()) != null){
                String[] splitCurLine = curline.split("\\s+");
                l1.add(Integer.parseInt(splitCurLine[0]));
                l2.add(Integer.parseInt(splitCurLine[1]));
            }
            Collections.sort(l1);
            Collections.sort(l2);

            return Day1.calculateSimilarity(l1,l2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}




