package com.fastcampus;

import com.fastcampus.logic.BubbleSort;
import com.fastcampus.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new BubbleSort<String>();

        System.out.println(sort.sort(Arrays.asList(args)));
    }
}