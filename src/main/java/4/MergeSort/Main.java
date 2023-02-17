package MergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arrayToSort = List.of(4,2,6,1,9,3,4,2);

        ExecutorService executorService = Executors.newCachedThreadPool();
        Sorter sorter = new Sorter(arrayToSort,executorService);

        List<Integer> sortedArray = executorService.submit(sorter).get();

        System.out.println(sortedArray);
        executorService.shutdown();
    }
}
