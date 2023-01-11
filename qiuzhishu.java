package leetcode;

import java.util.Scanner;

public class qiuzhishu {
    public static void main(String[] args) {
        //需求:键盘录入一个正整数x，判断该整数是否为一个质数
        Scanner sc = new Scanner(System.in);
        System.out.println("please input a number:");
        int number = sc.nextInt();

        //定义一个变量表示标记
        //标记着number是否为质数
        //true:是
        boolean flag = true;

        for (int i = 2; i <= number-1; i++) {
            //i依次表示这个范围之内的每一个数字。
            //看number能否被i整除就可以了
            if(number % i == 0){
                flag = false;
//                System.out.println(number+"不是一个质数");
                break;
            }

        }
        //只有当这个循环结束了，表示这个范围内所有数字都判断完毕了
        //此时才能判定number是一个质数
        if (flag){
            System.out.println(number + "是一个质数");
        }else {
            System.out.println(number+"不是一个质数");
        }
    }
}
