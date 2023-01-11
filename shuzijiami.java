package leetcode;

public class shuzijiami {
    public static void main(String[] args) {
        /*
        需求:某系统的数字密码（大于0），比如1983，采用加密方式进行传输
        规则如下:先得到每位数，然后每位数都加上5，再对10求余，最后将所有数字反转得到一串新数
         */

        //分析:
        //1.把整数里面的每一位放到数组当中
        int[] arr = {1,9,8,3};
        //2.加密
        //每位数加5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
        for (int i = 0,j=arr.length-1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //3.把数组里面的每一个数字拼接变成加密后的结果
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        System.out.println(number);

    }
}
