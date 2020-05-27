package com.example.designpattern.chainofresponsibility8.severltfilter;

import com.example.designpattern.chainofresponsibility8.FilterChain;

/**
 * @author lgh on 2020/5/27 21:41
 * @description
 */
public interface SeverltFilter {

    boolean doFilter(Request request, Response response, SeverltFilterChain chain);

}
