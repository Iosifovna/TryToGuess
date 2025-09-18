//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    // Игра "Угадай число", компьютер загадывает число от 1 до 100 включительно, юзер должен отдагать
    public static void main(String[] args) {
        System.out.println("Компьютер загадал число от 1 до 100 включительно. Угадай число!");
        int randomNumber = (int) (Math.random() * 100) + 1;
        // System.out.println(randomNumber); - для проверки
        int countOfTrying = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите свое число: ");
        if (scanner.hasNextInt()) {
            int inputNumber = scanner.nextInt();
            while (inputNumber != randomNumber) {
                if (inputNumber > randomNumber) {
                    System.out.println("Не ожидал от тебя такого. Загаданное число меньше, брат");
                    System.out.println("Твое количество попыток: " + countOfTrying);
                    System.out.print("Попробуй снова: ");
                    inputNumber = scanner.nextInt();
                    countOfTrying++;
                } else {
                    System.out.println("Я сам в шоке, но, загаданное число больше, брат");
                    System.out.println("Твое количество попыток: " + countOfTrying);
                    System.out.print("Попробуй снова: ");
                    inputNumber = scanner.nextInt();
                    countOfTrying++;
                }
            }
            if (inputNumber == randomNumber) {
                System.out.println("Поздравляю, брат! Ты угадал! загаданное число: " + randomNumber);
                System.out.println("Количество твоих попыток: " + countOfTrying);
            }
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
            System.out.println("Количество твоих попыток равно: " + countOfTrying);
            countOfTrying++;
        }
        scanner.close();
    }
}
