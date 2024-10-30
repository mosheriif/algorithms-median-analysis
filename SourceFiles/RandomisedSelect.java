package SourceFiles;
import java.util.*;

public class RandomisedSelect {
    private int partition(int[] array, int start, int end)
    {
        int lastElement = array[end];
        int index = start - 1;
        int temp;
        for (int i = start; i < end; i++)
        {
            if (array[i] <= lastElement)
            {
                index++;
                temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }
        }
        temp = array[index + 1];
        array[index + 1] = lastElement;
        array[end] = temp;

        return (index + 1);
    }
    
    private int randomisedPartition(int[] array, int start, int end)
    {
        Random random = new Random();
        int randomIndex = random.nextInt(end - start + 1) + start;
        int temp = array[end];
        array[end] = array[randomIndex];
        array[randomIndex] = temp;
        return partition(array, start, end);
    }

    public int randomisedSelection(int[] array, int start, int end, int ismallest)
    {
        if (start == end)
        {
            return array[start];
        }
        int pivot = randomisedPartition(array, start, end);
        int divider = pivot - start + 1;
        if (ismallest == divider)
        {
            return array[pivot];
        }
        else if (ismallest < divider)
        {
            return randomisedSelection(array, start, pivot - 1, ismallest);
        }
        else
        {
            return randomisedSelection(array, pivot + 1, end, ismallest - divider);
        }
    }
}
