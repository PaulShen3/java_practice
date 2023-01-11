package leetcode;

import java.util.Scanner;

public class pingweidafen {
    public static void main(String[] args) {
        /*
        6个分数，0-100的整数，最后得分为去掉最高分和最低分后四个评委的平均分
         */

        //分析：
        //1.定义一个数组用来存储6名评委的打分(0-100)
        int[] scoreArr = getScores();
//        for (int i = 0; i < scoreArr.length; i++) {
//            System.out.print(scoreArr[i]+" ");
//        }
        //2.求出数组中的最大值
        int max = getMax(scoreArr);
        //3.求出数组中的最小值
        int min = getMin(scoreArr);
        //4.求出数组中6个分数的总和
        int sum = getSum(scoreArr);
        //5.（总和-最大值-最小值）/ 4
        int avg = (sum - max -min)/(scoreArr.length - 2);
        System.out.println("max:"+max);
        System.out.println("min:"+min);
        System.out.println("sum:"+sum);
        System.out.println("评委去掉最高分和最低分后的评分为:"+avg);
    }

    public static int getSum(int[] scoreArr){
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum = sum +scoreArr[i];
        }
        return sum;
    }

    public static int getMax(int[] scoreArr){
        int max = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if(scoreArr[i] > max){
                max = scoreArr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] scoreArr){
        int min = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if(scoreArr[i] < min){
                min = scoreArr[i];
            }
        }
        return min;
    }
    public static int[] getScores(){
        //定义数组
        int[] scores = new int[6];
        //键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6;) {
            System.out.println("请输入评委的打分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100){
                scores[i] = score;
                i++;
            }else {
                System.out.println("成绩超出范围，继续录入，当前的i为:"+i);
            }
        }
        return scores;
    }
}
