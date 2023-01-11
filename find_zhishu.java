package leetcode;

public class find_zhishu {
    public static void main(String[] args) {
        //判断101-200直接按有多少个素数，并输出所有素数
        //思路：循环判断2~9
        //思路2：2~平方根
        //定义变量i，赋值100
        //判断i是否为质数

        for (int i = 101; i < 200; i++) {
            //i 依次表示循环中的每一个数字
            //继续判断i是否为质数
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                //j 表示2~99之间的每一个数字
                if (i % j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println("当前数字"+i+"是质数");
            }else {
                System.out.println("当前数字"+i+"不是质数");
            }
        }

    }
}
