package com.fastcampus.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {

    @DisplayName("자바소트 - 오름차순으로 정렬된 결과가 리턴된다. 내부적으로 TimSort가 사용된다.")
    @Test
    void given_List_WhenExecuting_ThenReturnSortedList() {
        //given
        BubbleSort<Integer> javaTimSort = new BubbleSort<Integer>();

        //when
        List<Integer> actual = javaTimSort.sort(List.of(1, 5, 3, 6, 2, 67, 1, 33, 442, 66));

        //then
        assertEquals(List.of(1, 1, 2, 3, 5, 6, 33, 66, 67, 442), actual);
    }
}