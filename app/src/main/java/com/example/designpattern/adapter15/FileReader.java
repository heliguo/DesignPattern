package com.example.designpattern.adapter15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * author:lgh on 2020/6/6 16:58
 */
class FileReader {

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("");//文件
        InputStreamReader isr = new InputStreamReader(fis);//转换器
        BufferedReader br = new BufferedReader(isr);//字节流
        String lin = br.readLine();
        while (lin != null && !lin.equals("")) {
            System.out.println(lin);
        }
    }

}
