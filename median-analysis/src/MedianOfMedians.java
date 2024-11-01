import java.util.Arrays;

public class MedianOfMedians {
    private int[] partitionSorter(int[] array, int start)
    {
        int[] temp = new int[5];
        for (int i = 0; i < 5; i++)
        {
            temp[i] = array[start + i];
        }
        Arrays.sort(temp);
        System.arraycopy(temp, 0, array, start, 5);
        return array;
    }

    public int selection(int[] array, int start, int end, int ismallest) {
        while ((end - start + 1) % 5 != 0) {
            for (int i = start + 1; i <= end; i++) {
                if (array[start] > array[i]) {
                    int temp = array[start];
                    array[start] = array[i];
                    array[i] = temp;
                }
            }
            if (ismallest == 1) {
                return array[start];
            }
            start++;
            ismallest--;
        }

        int numberOfGroups = (end - start + 1) / 5;
        for (int i = start; i <= end; i += 5) {
            array = partitionSorter(array, i);
        }

        int pivot = selection(array, start + (2 * numberOfGroups), start + (3 * numberOfGroups) - 1, (numberOfGroups + 1) / 2);
        Partitioners partitioner = new Partitioners();
        int pivotIndex = partitioner.partitionAround(array, start, end, pivot);

        int k = pivotIndex - start + 1;

        if (ismallest == k) {
            return array[pivotIndex];
        } else if (ismallest < k) {
            return selection(array, start, pivotIndex - 1, ismallest);
        } else {
            return selection(array, pivotIndex + 1, end, ismallest - k);
        }
    }
}
