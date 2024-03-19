package com.fastcampus.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @DisplayName("버블소트 - 오름차순으로 정렬된 결과가 리턴된다.")
    @Test
    void given_List_WhenExecuting_ThenReturnSortedList() {
        //given
        BubbleSort<Integer> bubbleSort = new BubbleSort<Integer>();

        //when
        List<Integer> actual = bubbleSort.sort(List.of(1, 5, 3, 6, 2, 67, 1, 33, 442, 66));

        //then
        assertEquals(List.of(1, 1, 2, 3, 5, 6, 33, 66, 67, 442), actual);
    }
}