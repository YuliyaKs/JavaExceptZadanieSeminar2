/*1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
  и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
  приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
*/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        getNumber();
    }

    static Scanner scanner = new Scanner(System.in);

    static void getNumber (){
            System.out.println("Введите число с десятичной дробью (с точкой) : ");
            while (true){
                try {
                    float number = Float.valueOf(scanner.nextLine());
                    if (number == Math.round(number)){
                        throw new RuntimeException();
                    }
                    System.out.printf("Введено значение: %.3f", number);
                    break;
                }
                catch(NumberFormatException e){ //если будет введена строка вместо числа
                    System.out.println("Введено некорректное значение. Введите число с десятичной дробью (с точкой): ");
                }
                catch(RuntimeException e) { //если будет введено целое число вместо числа с десятичной дробью
                    System.out.println("Введено некорректное значение. Введите число с десятичной дробью (с точкой): ");
                }
            }
    }
}
