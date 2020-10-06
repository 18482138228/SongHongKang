package demo01;

public class VariableTest {
    public static void main(String[] args) {
        int num1;
        num1 = 10;
        int num2 = 20;

        int num3 = num1 + num2;
        System.out.println("num3 = " + num3);

        int num4 = 50;
        int num5 = num4 - num3;
        System.out.println("num5 =" + num5);

        byte b = 12;

        byte b1 = (byte) (b + 1);

    }
}
