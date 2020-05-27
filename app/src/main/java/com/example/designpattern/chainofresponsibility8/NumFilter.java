package com.example.designpattern.chainofresponsibility8;

/**
 * @author lgh on 2020/5/27 21:01
 * @description
 */
public class NumFilter implements IFilter {
    @Override
    public boolean doFilter(String s) {
        s.replace("9", "r");
        return true;
    }
}
