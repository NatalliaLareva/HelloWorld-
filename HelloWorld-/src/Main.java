import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Задание 1

        System.out.print("Пожалуйста, введите свое число: ");
        int userScore = new Scanner(System.in).nextInt();

        if (userScore >= 101) {
            System.out.println("Введено некоректное значение. Повторите ввод.");
        } else if (userScore <= -1) {
            System.out.println("Введено некоректное значение. Повторите ввод.");
        } else if (userScore >= 100) {
            System.out.println("Операция прошла успешно!");
        } else {
            System.out.println("Операция прошла успешно");
        }

        System.out.println("End of Program");

        //Задание 2

        String userInput = "";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Пожалуйста, введите команду: ");
            userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("Exit"))
                break;
        }
        System.out.println("Программа завершена");

        //Задание 3

        System.out.println("Введите целое число:");
int x = scanner.nextInt();
int sum = 0;
if (x < 0) {
    for (int i = 0; i>= x; i--) {
        sum += i;
    }
}
else if (x > 0) {
    for (int i = 0; i <=x; i++) {
        sum += i;
    }
}
else
    System.out.println("Введите корректный номер");
    System.out.printf(" Сумма чисел от 0 до %d равна %d ", x, sum);


    //Задание 4
        String[] channels = {"MTV", "RTR", "ONT","NTV"};
        System.out.println("Меню выбора\nВведите номер канала: \n 0 - Exit," +
                "1 - MTV, 2 - RTR, 3 - ONT, 4 - NTV ");
        int numberOfChannels = scanner.nextInt();
        String channel = switch (numberOfChannels) {
            case 1 -> " Вы выключили программу ";
            case 2 -> " Вы перешли на " + channels[0];
            case 3 ->  " Вы перешли на " + channels[1];
            case 4 ->  " Вы перешли на " + channels[2];
            case 5 ->  " Вы перешли на " + channels[3];
            default -> " Неверный канал. Введите заново от 0 до 4";
        };
        System.out.println(channel);
    }
}
