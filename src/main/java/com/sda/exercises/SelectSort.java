package com.sda.exercises;

import java.util.List;

public class SelectSort {

    public List<Integer> sort(List<Integer> unsortedList) {
        for (int i = 0; i < unsortedList.size() - 1; i++) {
            int minimumIndex = i;
            for (int j = i + 1; j < unsortedList.size(); j++)
                if (unsortedList.get(j) < unsortedList.get(minimumIndex))
                    minimumIndex = j;

                Integer temp = unsortedList.get(minimumIndex);
                unsortedList.set(minimumIndex, unsortedList.get(i));
                unsortedList.set(i, temp);
        }
        return unsortedList;
    }
}
