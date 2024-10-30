package SourceFiles;

public class Main {
    public static void main(String[] args)
    {
        RandomArrayGenerator generator = new RandomArrayGenerator();
        RandomisedSelect selector = new RandomisedSelect();
        int[] randomisedArray = generator.generateArray();
        int randomlySelected = selector.randomisedSelection(randomisedArray, 0, randomisedArray.length - 1, (int)(randomisedArray.length / 2));
        System.out.println(randomlySelected);
    }
}
