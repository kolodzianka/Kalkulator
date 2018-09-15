import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CountingMethods count = new CountingMethods();

        Scanner sc = new Scanner(System.in);

        char method;
        double number1;
        double number2;
        while (true) {


            System.out.println("Choose an operation: +, -, *, / or q(for quit): ");
            String chosenMethod = sc.next();
            method = chosenMethod.charAt(0);
            if (method == 'q') return;

            System.out.println("Please, enter your first number: ");
            number1 = sc.nextDouble();


            System.out.println("Please, enter your second number: ");
            number2 = sc.nextDouble();


            switch (method) {
                case '+':
                    System.out.println("NR1: "+ number1);
                    System.out.println("NR2: "+ number2);
                    System.out.println(count.addition(number1, number2));
                    break;
                case '-':
                    System.out.println(count.subtraction(number1, number2));
                    break;
                case '*':
                    System.out.println(count.multiplication(number1, number2));
                    break;
                case '/':
                    System.out.println(count.division(number1, number2));
                    break;


            }
        }
    }
}
