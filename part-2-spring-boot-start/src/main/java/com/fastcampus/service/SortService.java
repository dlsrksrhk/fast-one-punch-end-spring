package com.fastcampus.service;

import com.fastcampus.logic.JavaSort;
import com.fastcampus.logic.Sort;

import java.util.List;

public class SortService {

    private Sort<String> sort;

    public SortService(Sort<String> sort) {
        this.sort = sort;
    }

    public List<String> doSort(List<String> list) {
        Sort<String> sort = new JavaSort<>();
        return sort.sort(list);
    }
}
