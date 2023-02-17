package MergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    private final List<Integer> arrayToSort;
    private final ExecutorService executorService;
    public Sorter(List<Integer> arrayToSort, ExecutorService executorService) {
        this.arrayToSort = arrayToSort;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        if (arrayToSort.size() <= 1) {
            return arrayToSort;
        }
        int mid = arrayToSort.size()/2 ;
        List<Integer> leftArrayToSort = arrayToSort.subList(0,mid);
        List<Integer> rightArrayToSort = arrayToSort.subList(mid,arrayToSort.size());

        Future<List<Integer>> futureSortedLeftArray = executorService.submit(new Sorter(leftArrayToSort,executorService));
        Future<List<Integer>> futureSortedRightArray = executorService.submit(new Sorter(rightArrayToSort,executorService));

        List<Integer> sortedLeftArray = futureSortedLeftArray.get();
        List<Integer> sortedRightArray = futureSortedRightArray.get();
        List<Integer> mergedSortedArray = new ArrayList<>();
        int i = 0, j = 0 ;
        while (i<sortedLeftArray.size() && j<sortedRightArray.size()){
            if(sortedLeftArray.get(i) < sortedRightArray.get(j)){
                mergedSortedArray.add(sortedLeftArray.get(i++));
            }
            else mergedSortedArray.add(sortedRightArray.get(j++));
        }
        while (i< sortedLeftArray.size()){
            mergedSortedArray.add(sortedLeftArray.get(i++));
        }
        while (j< sortedRightArray.size()){
            mergedSortedArray.add(sortedRightArray.get(j++));
        }
        return mergedSortedArray;
    }
}
