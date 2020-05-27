package com.example.designpattern.chainofresponsibility8.severltfilter;

/**
 * @author lgh on 2020/5/27 21:41
 * @description
 */
public interface SeverltFilter2 {

    boolean doFilter(Request request, Response response, SeverltFilterChain2 chain);

}
