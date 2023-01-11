package leetcode;

public class shangheyushu {
    public static void main(String[] args) {
        /*需求：给定两个整数、被除数和除数（都是正数、且不超过int的范围）
        将两数相除，要求不是用乘法、除法和%运算符。
        得到商和余数。
        */
        int count = 0;
        //定义变量记录被除数
        int dividend = 100;
        //定义变量记录除数
        int divisor = 37;
        //循环while
        while (dividend>=divisor){
            dividend = dividend - divisor;
            count ++;
        }
        System.out.println("余数为:"+dividend);
        System.out.println("商为:"+count);
    }
}
