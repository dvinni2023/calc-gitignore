package ru.dvinni.calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){

            System.out.print("Введите первое число: ");
            double a = Double.parseDouble(bufferedReader.readLine());

            System.out.print("Введите второе число: ");
            double b = Double.parseDouble(bufferedReader.readLine());

            System.out.print("Введите символ действия над введенными числами: ");
            char s = bufferedReader.readLine().charAt(0);

            System.out.print("Результат: ");

            switch (s) {
                case '+': {
                    System.out.println(Calculator.addition(a, b));
                    break;
                }
                case '-': {
                    System.out.println(Calculator.subtraction(a, b));
                    break;
                }
                case '*': {
                    System.out.println(Calculator.multiplication(a, b));
                    break;
                }
                case '/': {
                    if (b == 0) {
                        System.out.println("На 0 делить не получится..");
                        break;
                    }
                    System.out.println(Calculator.division(a, b));
                    break;
                }
                default: {
                    System.out.println("Вы ввели неверную операцию!");
                }
            }


        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}