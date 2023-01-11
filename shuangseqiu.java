package leetcode;

import java.util.Random;
import java.util.Scanner;

public class shuangseqiu {
    public static void main(String[] args) {
        //1.生成中奖号码
        int[] arr = createNumber();
        //2.用户输入彩票号码(红球+蓝球)
        int[] userInputArr = userInputNumber();
        //3.判断用户的中奖情况
        //红球 蓝球
        int redCount = 0;
        int blueCount = 0;
        //判断红球
        for (int i = 0; i < userInputArr.length - 1; i++) {
            int redNumber = userInputArr[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if (redNumber == arr[j]) {
                    redCount++;
                    //如果找到了跳出内循环，继续判断下一个红球号码是否中奖
                    break;
                }
            }
        }
        //判断蓝球
        int blueNumber = userInputArr[userInputArr.length - 1];
        if (blueNumber == arr[arr.length - 1]) {
            blueCount++;
        }

        //根据红球的个数和蓝球的个数来判断中奖情况
        if (redCount == 6 && blueCount == 1) {
            System.out.println("一等奖！奖金为1000万元！");
        }
        else if (redCount == 6 && blueCount == 0) {
            System.out.println("二等奖！奖金为500万元！");
        }
        else if (redCount == 5 && blueCount == 1) {
            System.out.println("三等奖！奖金为3000元！");
        }
        else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("四等奖！奖金为200元！");
        }
        else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)) {
            System.out.println("五等奖！奖金为10元");
        }
        else if ((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)) {
            System.out.println("六等奖！奖金为5元");
        }
        else {
            System.out.println("谢谢参与！你钱没了！");
        }
        System.out.println("=====================================");
        System.out.println("你购买的双色球号码为:");
        for (int i = 0; i < 7; i++) {
            System.out.print(+userInputArr[i] + " ");
        }
        System.out.println(" ");
        System.out.println("=====================================");
        System.out.println("中奖的双色球号码为:");
        for (int i = 0; i < 7; i++) {
            System.out.print(+arr[i] + " ");
        }
    }
        public static int[] userInputNumber () {
            //1.创建数组用于添加用户购买的彩票号码
            int[] arr = new int[7];
            //2.键盘录入
            Scanner sc = new Scanner(System.in);
            //1.让用户输入红球号码
            for (int i = 0; i < 6; ) {
                System.out.println("请输入第" + (i + 1) + "红球号码:");
                int redNumber = sc.nextInt();
                //redNumber 要在1~33内，而且唯一不充分
                if (redNumber >= 1 && redNumber <= 33) {
                    boolean flag = contains(arr, redNumber);
                    if (!flag) {
                        //不存在
                        //有效的可以添加到数组中
                        arr[i] = redNumber;
                        i++;
                    } else {
                        //存在
                        System.out.println("当前红球号码已经存在，请重新输入:");
                    }
                } else {
                    System.out.println("当前红球号码超出范围");
                }

            }
            //让用户输入蓝球号码
            System.out.println("请输入蓝球号码:");
            //1~16
            while (true) {
                int blueNumber = sc.nextInt();
                if (blueNumber >= 1 && blueNumber <= 16) {
                    arr[arr.length - 1] = blueNumber;
                    break;
                } else {
                    System.out.println("当前蓝球号码超出范围");
                }
            }
            return arr;
        }


        public static int[] createNumber () {
            //1.创建数组用于添加中奖号码
            //6个红球+1个蓝球，长度为7
            int[] arr = new int[7];
            //2.随机生成号码并添加到数组当中
            //红球:不能重复的 123456
            //蓝球:可以和红球号码重复 5
            //生成红球号码并添加到数组当中
            Random r = new Random();
            for (int i = 0; i < 6; ) {
                //获取红球号码
                int redNumber = r.nextInt(33) + 1; //33是0到32，加一就变成1到33
                boolean flag = contains(arr, redNumber);
                if (!flag) {
                    //把红球号码添加到数组中
                    arr[i] = redNumber;
                    i++;
                }
            }
            //生成蓝球号码并添加到数组当中
            int blueNumber = r.nextInt(16) + 1;
            arr[arr.length - 1] = blueNumber;
            return arr;
        }
        //用于判断数字在数组中是否存在
        public static boolean contains ( int[] arr, int number){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == number) {
                    return true;
                }
            }
            return false;
        }

}