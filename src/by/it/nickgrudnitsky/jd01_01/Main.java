package by.it.nickgrudnitsky.jd01_01;


public class Main {

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.printSlogan();
        hello.setSlogan("Hi!");
        hello.printSlogan();

        Args argObject = new Args(args);
        argObject.printArgs();
    }
}
