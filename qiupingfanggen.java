package leetcode;

import java.util.Scanner;

public class qiupingfanggen {
    public static void main(String[] args) {
        //键盘录入一个大于等于2的整数x，计算并返回x的平方根
        //结果只保留整数部分，小数部分舍去

//        Scanner sc = new Scanner(System.in);
//        System.out.println("输入一个数number:");
//        int number = sc.nextInt();
//        for (int i = 0; i < number; i++) {
//            if (i*i == number){
//                System.out.println(i+"就是"+number+"的平方根");
//            }else if (i*i>number){
//                System.out.println((i-1)+"就是"+number +"的平方根的整数部分");
//                break;
//            }
//
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数number:");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            if(i*i == number){
                System.out.println(i+"就是"+number+"的平方根。");
            } else if (i*i>number) {
                System.out.println((i-1)+"就是"+number+"的平方根的整数部分");
                break;
            }

        }
    }
}
