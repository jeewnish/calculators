import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, result;
        char operator;

        System.out.println("---Simple Calculator---");
        System.out.println("");

        System.out.print("Enter first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter the operator: ");
        operator = input.next().charAt(0);

        while (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            System.out.println("Choose one of these Operators: + - * /");
            System.out.print("Enter the Operator: ");
            operator = input.next().charAt(0);
            break;
        }

        System.out.print("Enter second number: ");
        num2 = input.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Operator not supported");
                break;
        }
        input.close();
    }
}
