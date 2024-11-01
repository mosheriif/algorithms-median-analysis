public class MedianAnalysisTest {

    private long startTime;
    private long endTime;

    public void testPerformance()
    {
        System.out.println("--------------------------------------[Arrays of size 10]--------------------------------------");
        tester(10);
        System.out.println("--------------------------------------[Arrays of size 20]--------------------------------------");
        tester(20);
        System.out.println("--------------------------------------[Arrays of size 50]--------------------------------------");
        tester(50);
        System.out.println("--------------------------------------[Arrays of size 100]--------------------------------------");
        tester(100);
        System.out.println("--------------------------------------[Arrays of size 250]--------------------------------------");
        tester(250);
        System.out.println("--------------------------------------[Arrays of size 500]--------------------------------------");
        tester(500);
        System.out.println("--------------------------------------[Arrays of size 750]--------------------------------------");
        tester(750);
        System.out.println("--------------------------------------[Arrays of size 1000]--------------------------------------");
        tester(1000);
        System.out.println("--------------------------------------[Arrays of size 2500]--------------------------------------");
        tester(2500);
        System.out.println("--------------------------------------[Arrays of size 5000]--------------------------------------");
        tester(5000);
        System.out.println("--------------------------------------[Arrays of size 7500]--------------------------------------");
        tester(7500);
        System.out.println("--------------------------------------[Arrays of size 10000]--------------------------------------");
        tester(10000);
        System.out.println("--------------------------------------[Arrays of size 50000]--------------------------------------");
        tester(50000);
        System.out.println("--------------------------------------[Arrays of size 100000]--------------------------------------");
        tester(100000);
        System.out.println("--------------------------------------[Arrays of size 500000]--------------------------------------");
        tester(500000);
        System.out.println("--------------------------------------[Arrays of size 1000000]--------------------------------------");
        tester(1000000);
        System.out.println("--------------------------------------[Arrays of size 5000000]--------------------------------------");
        tester(5000000);
        System.out.println("--------------------------------------[Arrays of size 10000000]--------------------------------------");
        tester(10000000);
    }

    private void tester(int size)
    {
        RandomArrayGenerator generator = new RandomArrayGenerator();
        NaiveMedianFinder naive = new NaiveMedianFinder();
        MedianOfMedians quickselect = new MedianOfMedians();
        RandomisedSelect randommedian = new RandomisedSelect();
        for (int i = 0; i < 10; i++)
        {
            int[] array = generator.generateArray(size);
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            startTime = System.nanoTime();
            int naiveMedian = naive.naiveMedian(array);
            endTime = System.nanoTime();
            System.out.println("[Naive Median Finder] - Median: " + naiveMedian + ", time taken: " + ((endTime - startTime)/1000) + " microseconds");
            startTime = System.nanoTime();
            int randomisedMedian = randommedian.randomisedSelection(array, 0, array.length - 1, array.length / 2);
            endTime = System.nanoTime();
            System.out.println("[Randmoised Selection] - Median: " + randomisedMedian + ", time taken: " + ((endTime - startTime)/1000) + " microseconds");
            startTime = System.nanoTime();
            int medianOfMedians = quickselect.selection(array, 0, array.length - 1, (array.length + 2) / 2);
            endTime = System.nanoTime();
            System.out.println("[Median of Medians] - Median: " + medianOfMedians + ", time taken: " + ((endTime - startTime)/1000) + " microseconds");
        }
    }
}
