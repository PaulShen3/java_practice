package leetcode;

public class fengqiguo {
    public static void main(String[] args) {
        //从任意一个数字开始报数，当你要报的数字包含7或者是7的倍数的时候要说过
        //需求：实用程序在控制台打印出1-100之间满足条件的数据

        //分析:
        //个位:7 十位：7  7倍数
        //1 2 3 4 5 6 过 8 9 10 11 12 13 过 15 16 过 18 19 20 过...

        //得到1-100的所有数字
        for (int i = 1; i <= 100; i++) {
            if(i % 10 == 7|| i / 10 % 10 ==7||i % 7 == 0){
                System.out.println("过");
                continue;
            }
            System.out.println(i);

        }
    }
}
