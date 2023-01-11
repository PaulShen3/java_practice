package leetcode;

import java.util.Random;

public class qianghongbao {
    public static void main(String[] args) {
        /*
        需求：{2,588,888,1000,10000}五个奖金，模拟抽奖打印每个奖项，奖项的出现顺序要随机不能重复
         */

        //定义数组
        int[] arr = {2,588,888,1000,10000};
        //定义新数组用于存储抽奖结果
        int[] newArr = new int[arr.length];
        //抽奖
        Random r = new Random();
        for (int i = 0; i < 5; ) {
            int randomIndex = r.nextInt(arr.length);
            int prize = arr[randomIndex];
            //判断当前奖项是否存在，如果存在重新抽取
            boolean flag = contains(newArr,prize);
            if (!flag){
                //把当前抽取到的奖项添加到newArr中
                newArr[i] = prize;
                i++;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]+"元的奖金被抽出");
        }

    }
    public static boolean contains(int[] arr, int prize){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == prize){
                return true;
            }
        }
        return false;
    }
}
