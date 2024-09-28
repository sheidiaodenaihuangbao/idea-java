public class WhatDay {
    public static void main(String[] args) {
        //星期二
        int tues = 2;
        //总天数
        int total = 100;
        int day = total % 7 + tues;
        System.out.println("100天后是周"+day);
    }
}
