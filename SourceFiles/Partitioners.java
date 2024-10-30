package SourceFiles;
import java.util.*;

public class Partitioners {
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
    
    public int randomisedPartition(int[] array, int start, int end)
    {
        Random random = new Random();
        int randomIndex = random.nextInt(end - start + 1) + start;
        int temp = array[end];
        array[end] = array[randomIndex];
        array[randomIndex] = temp;
        return partition(array, start, end);
    }

    public int partitionAround(int[] array, int start, int end, int pivot)
    {
        int index = start - 1;
        for (int i = start; i <= end; i++)
        {
            if (array[i] <= pivot)
            {
                index++;
                int temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }
        }
        return index;
    }
}
