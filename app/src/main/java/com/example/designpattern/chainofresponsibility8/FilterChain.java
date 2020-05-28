package com.example.designpattern.chainofresponsibility8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lgh on 2020/5/27 21:11
 * @description
 */
public class FilterChain implements IFilter {

    private List<IFilter> mFilters = new ArrayList<>();

    public FilterChain add(IFilter filter) {
        mFilters.add(filter);
        return this;
    }

    public boolean doFilter(String msg) {
        for (IFilter filter : mFilters) {
            if (!filter.doFilter(msg)) {
                return false;//跳出循环，不在执行
            }
        }
        return true;
    }

}
