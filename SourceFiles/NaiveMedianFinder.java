package SourceFiles;
import java.util.*;

public class NaiveMedianFinder {
    public int naiveMedian(int[] array)
    {
        Arrays.sort(array);
        return array[array.length/2];
    }
}
