package com.example.designpattern.chainofresponsibility8.severltfilter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lgh on 2020/5/27 21:43
 * @description
 */
public class SeverltFilterChain2 {

    private List<SeverltFilter2> mSeverltFilters = new ArrayList<>();
    int index = 0;

    public SeverltFilterChain2 add(SeverltFilter2 severltFilter) {
        mSeverltFilters.add(severltFilter);
        return this;
    }

    public boolean doFilter(Request request, Response response) {
        if (index == mSeverltFilters.size())
            return false;
        SeverltFilter2 severltFilter = mSeverltFilters.get(index);
        index++;
        return severltFilter.doFilter(request, response, this);
    }
}
