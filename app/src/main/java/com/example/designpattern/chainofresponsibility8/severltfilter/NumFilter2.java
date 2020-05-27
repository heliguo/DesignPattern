package com.example.designpattern.chainofresponsibility8.severltfilter;

/**
 * @author lgh on 2020/5/27 21:45
 * @description
 */
public class NumFilter2 implements SeverltFilter2 {

    @Override
    public boolean doFilter(Request request, Response response, SeverltFilterChain2 chain) {
        request.msg = "2.requst do";
        chain.doFilter(request, response);
        response.msg = "2.response do";
        return true;
    }
}
