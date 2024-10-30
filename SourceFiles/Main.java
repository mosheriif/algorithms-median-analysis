package SourceFiles;

public class Main {
    public static void main(String[] args)
    {
        RandomArrayGenerator generator = new RandomArrayGenerator();
        RandomisedSelect selector = new RandomisedSelect();
        MedianOfMedians quickselect = new MedianOfMedians();
        NaiveMedianFinder naive = new NaiveMedianFinder();
        int[] randomisedArray = generator.generateArray();
        int randomlySelected = selector.randomisedSelection(randomisedArray, 0, randomisedArray.length - 1, randomisedArray.length / 2);
        int fastmedian = quickselect.selection(randomisedArray, 0, randomisedArray.length - 1, (randomisedArray.length + 2) / 2);
        int naivemedian = naive.naiveMedian(randomisedArray);
        System.out.println(naivemedian);
        System.out.println(randomlySelected);
        System.out.println(fastmedian);
    }
}
