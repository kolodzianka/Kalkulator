import java.io.BufferedReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
CountingMethods count = new CountingMethods();

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter your first number: ");
        double nb1 = sc.nextDouble();


        System.out.println("Please, enter your second number: ");
        double nb2 = sc.nextDouble();

        System.out.println("Choose an operation: +, -, * or / : ");
        String chosenMetod = sc.next();




        switch (chosenMetod.charAt(0)) {
            case '+':
                System.out.println(count.addition(nb1,nb2));
            break;
            case '-':
                System.out.println(count.subtraction(nb1,nb2));
                break;
            case '*':
                System.out.println(count.multiplication(nb1,nb2));
                break;
            case '/':
                System.out.println(count.division(nb1,nb2));
                break;
            }
        }
    }
