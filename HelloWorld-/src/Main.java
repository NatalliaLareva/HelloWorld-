import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int age = 31;
        int ageWork = 13;
        int a = 15;
        int b = 30;
        int f = 2;
        int c = a + b;
        int d = c * a;
        f += 10;
        byte x = 2;
        byte w = (byte)(x+50);
        double z = f + a;
        boolean aEqualsb = a==b;
        Scanner scanner = new Scanner(System.in);
        String myName = scanner.nextLine();

        String mySurname = "Vasilevna";
        System.out.println("Hello!");
        System.out.println("My name is Lareva Natallia.");
        System.out.println("I'm Software QA. Nice to meet you!");
        System.out.println("просто int");
        System.out.println(age);
        System.out.println(ageWork);
        System.out.println(mySurname);
        System.out.println("Арифметические");
        System.out.println(a+b);
        System.out.println(d);
        System.out.println(a/b);
        System.out.println("Сравнения");
        System.out.println(aEqualsb);
        System.out.println(a != b);
        System.out.println(a<b && b>c);
        System.out.println("Логические");
        System.out.println(a <b || b > c);
        System.out.println("Присваивания");
        System.out.println(f);
        System.out.println("Приведение типов");
        System.out.println(z);// неявное
        System.out.println(w);// явное
        System.out.println(myName);
    }
}