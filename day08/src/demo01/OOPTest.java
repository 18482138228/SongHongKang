package demo01;

public class OOPTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.eat();
        int age = person.age;

    }
}

class Person {
    String name;
    int age = 1;
    boolean isMale;

    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public void talk(String language) {
        System.out.println("说" + language);
    }
}
