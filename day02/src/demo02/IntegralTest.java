package demo02;

import java.util.Scanner;

public class IntegralTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int a = sc.nextInt();

        int hundred = (int) (a / 100);
        int ten = (int) ((a - hundred * 100)/10);
        int one = a - ten * 10 - hundred * 100;

        System.out.println(hundred);
        System.out.println(ten);
        System.out.println(one);

    }
}
