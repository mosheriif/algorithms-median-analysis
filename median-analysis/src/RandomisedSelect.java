public class RandomisedSelect {

    public int randomisedSelection(int[] array, int start, int end, int ismallest)
    {
        if (start == end)
        {
            return array[start];
        }
        Partitioners partitioner = new Partitioners();
        int pivotIndex = partitioner.randomisedPartition(array, start, end);
        if (ismallest == pivotIndex)
        {
            return array[pivotIndex];
        }
        else if (ismallest < pivotIndex)
        {
            return randomisedSelection(array, start, pivotIndex - 1, ismallest);
        }
        else
        {
            return randomisedSelection(array, pivotIndex + 1, end, ismallest);
        }
    }
}
