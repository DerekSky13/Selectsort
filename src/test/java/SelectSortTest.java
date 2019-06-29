import com.sda.exercises.SelectSort;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectSortTest {

    @Test
    public void sort() {
        SelectSort selectSort = new SelectSort();
        List<Integer> unsortedList =
                new ArrayList<Integer>(Arrays.asList(9, 7, 5, 8, 6, 2, 4, 3, 1));

        List<Integer> returned = selectSort.sort(unsortedList);
        List<Integer> expected =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        Assert.assertEquals(returned, expected);


    }

    @Test
    public void sortEmptyListTest() {
        SelectSort selectSort = new SelectSort();
        List<Integer> unsortedList = new ArrayList<>();

        List<Integer> returned = selectSort.sort(unsortedList);
        List<Integer> expected = new ArrayList<Integer>();

        Assert.assertEquals(returned, expected);
    }
}