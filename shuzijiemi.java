package leetcode;

public class shuzijiemi {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {8,3,4,6};
        //2.反转
        for (int i = 0,j = arr.length - 1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //3.解密
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4){
                arr[i] = arr[i] + 10;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
        }
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        System.out.println(number);
    }
}
