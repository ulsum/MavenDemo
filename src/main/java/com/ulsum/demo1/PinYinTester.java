package com.ulsum.demo1;

import net.sourceforge.pinyin4j.PinyinHelper;

import java.util.Scanner;

public class PinYinTester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] pinyin = PinyinHelper.toHanyuPinyinStringArray(str.charAt(0));
        for (String py : pinyin) {
            System.out.println(py);
        }
    }

}
