package com.example.designpattern.chainofresponsibility8.severltfilter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lgh on 2020/5/27 21:43
 * @description
 */
public class SeverltFilterChain implements SeverltFilter {

    private List<SeverltFilter> mSeverltFilters = new ArrayList<>();
    int index = 0;

    public SeverltFilterChain add(SeverltFilter severltFilter) {
        mSeverltFilters.add(severltFilter);
        return this;
    }

    @Override
    public boolean doFilter(Request request, Response response, SeverltFilterChain chain) {
        if (index == mSeverltFilters.size())
            return false;
        SeverltFilter severltFilter = mSeverltFilters.get(index);
        index++;
        return severltFilter.doFilter(request, response, chain);
    }
}
