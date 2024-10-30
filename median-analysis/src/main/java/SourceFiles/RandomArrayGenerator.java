package SourceFiles;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomArrayGenerator {
    private int length;

    private void setRandomArrayLength() {
        Random random = new Random();
        length = 1 + random.nextInt(10000000);
    }

    public int[] generateArray() {
        setRandomArrayLength();
        int[] randomArray = new int[length];

        Set<Integer> distinctNumbers = new HashSet<>();
        Random random = new Random();

        while (distinctNumbers.size() < length) {
            int randomNumber = 1 + random.nextInt(1000000000);
            distinctNumbers.add(randomNumber);
        }

        Integer[] temp = distinctNumbers.toArray(new Integer[0]);

        for (int i = 0; i < length; i++){
            randomArray[i] = temp[i];
        }

        return randomArray;
    }

    public int[] generateArray(int inputLength) {
        length = inputLength;
        int[] randomArray = new int[length];

        Set<Integer> distinctNumbers = new HashSet<>();
        Random random = new Random();

        while (distinctNumbers.size() < length) {
            int randomNumber = 1 + random.nextInt(1000000000);
            distinctNumbers.add(randomNumber);
        }

        Integer[] temp = distinctNumbers.toArray(new Integer[0]);

        for (int i = 0; i < length; i++){
            randomArray[i] = temp[i];
        }

        return randomArray;
    }
}