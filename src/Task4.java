/*2. Разработайте программу, которая выбросит Exception, когда пользователь вводит
  пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
*/

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        getString();
    }
    static Scanner scanner = new Scanner(System.in);

    static void getString() {
        System.out.println("Введите что-нибудь : ");
        while (true) {
            try {
                String text = scanner.nextLine();
                if (text == "") {
                    throw new Exception();
                }
                break;
            } catch (Exception e) { //если будет введена пустая строка вместо числа
                System.out.println("Пустые строки вводить нельзя: ");
            }
        }
    }
}
