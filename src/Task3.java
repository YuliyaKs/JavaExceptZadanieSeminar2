//Задание 3

import java.io.*;
import java.io.File;

public class Task3 {
    public static void main(String[] args) throws Exception {
        File file1 = null;
        File file2 = new File("");
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
//            printSum(23, 234, file1); //выброс исключения NullPointerException
            printSum(23, 234, file2); //выброс исключения FileNotFoundException
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b, File file) throws FileNotFoundException {
        System.out.println(a + b);
        FileReader reader = new FileReader(file);
    }
}
