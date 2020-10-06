package demo02;

import java.util.Scanner;

public class IfTestDemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();

        if(a1+a2 >=50){
            System.out.println("HelloWorld!");
        }
    }
}
