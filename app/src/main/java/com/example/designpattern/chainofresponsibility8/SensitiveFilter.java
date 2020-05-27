package com.example.designpattern.chainofresponsibility8;

/**
 * @author lgh on 2020/5/27 21:03
 * @description
 */
public class SensitiveFilter implements IFilter {
    @Override
    public boolean doFilter(String s) {
        s = s.replace("敏感词汇", "***");
        return false;
    }
}
