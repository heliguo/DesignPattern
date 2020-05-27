package com.example.designpattern.chainofresponsibility8.severltfilter;

/**
 * @author lgh on 2020/5/27 21:45
 * @description 具体的Filter处理逻辑
 * 如果在HtmlFilter的doFilter中不调用SeverltFilterChain的doFilter方法，则链的调用不会继续
 */
public class HtmlFilter implements SeverltFilter {

    @Override
    public boolean doFilter(Request request, Response response, SeverltFilterChain chain) {
        request.msg = "1.request do";
        chain.doFilter(request, response, chain);//如果不调用，则SeverltFilterChain不会继续执行
        response.msg = "1.response do";
        return true;
    }
}
