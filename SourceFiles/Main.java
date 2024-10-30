package SourceFiles;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        RandomArrayGenerator generator = new RandomArrayGenerator();
        RandomisedSelect selector = new RandomisedSelect();
        int[] randomisedArray = generator.generateArray();
        int randomlySelected = selector.randomisedSelection(randomisedArray, 0, randomisedArray.length - 1, randomisedArray.length / 2);
        Arrays.sort(randomisedArray);
        System.out.println(randomisedArray[randomisedArray.length/2]);
        System.out.println(randomlySelected);
    }
}
