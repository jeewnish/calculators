import java.util.ArrayList;
import java.util.Scanner;

public class advcalc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Advanced Calculator... ");
        
        System.out.print("Enter your calculation like '2 + 43 * 6': ");
        String take = input.nextLine();
        // Remove spacing and letters
        String use1 = take.replaceAll("[^0-9+\\-*/.]", "");
        
        
        
    }
}
// public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);

//     System.out.println("--- Advanced String Calculator ---");
//     System.out.println("Enter calculation (e.g., 10 + 2 * 5 - 3):");
//     String input = scanner.nextLine();

//     // 1. Clean the input (Your step 2)
//     // This removes everything that isn't a number or an operator
//     input = input.replaceAll("[^0-9+\\-*/.]", "");

//     // 2. Parse into an ArrayList (Your step 3)
//     ArrayList<String> tokens = parseToArrayList(input);

//     // 3. Do Multiplication and Division first (Your step 5)
//     performOperations(tokens, '*', '/');

//     // 4. Do Addition and Subtraction next (Your step 6)
//     performOperations(tokens, '+', '-');

//     // 5. Final Result
//     System.out.println("Result: " + tokens.get(0));
// }

// // Helper: Breaks string "10+20" into ["10", "+", "20"]
// public static ArrayList<String> parseToArrayList(String equation) {
//     ArrayList<String> list = new ArrayList<>();
//     String currentNumber = "";

//     for (int i = 0; i < equation.length(); i++) {
//         char c = equation.charAt(i);

//         // If it's a digit or a dot, build the number
//         if (Character.isDigit(c) || c == '.') {
//             currentNumber += c;
//         } else {
//             // We found an operator, so push the number we built to list
//             if (!currentNumber.isEmpty()) {
//                 list.add(currentNumber);
//                 currentNumber = "";
//             }
//             // Add the operator to list
//             list.add(String.valueOf(c));
//         }
//     }
//     // Add the last number pending in the buffer
//     if (!currentNumber.isEmpty()) {
//         list.add(currentNumber);
//     }
//     return list;
// }

// // Helper: Scans list and solves specific operators
// public static void performOperations(ArrayList<String> list, char op1, char op2) {
//     // We use a counter loop because we are modifying the list size as we go
//     for (int i = 1; i < list.size() - 1; i += 2) {
//         String operator = list.get(i);

//         // Only process if it matches the operators we are looking for (e.g., * or /)
//         if (operator.charAt(0) == op1 || operator.charAt(0) == op2) {
//             double num1 = Double.parseDouble(list.get(i - 1));
//             double num2 = Double.parseDouble(list.get(i + 1));
//             double result = 0;

//             switch (operator.charAt(0)) {
//                 case '*':
//                     result = num1 * num2;
//                     break;
//                 case '/':
//                     result = num1 / num2;
//                     break;
//                 case '+':
//                     result = num1 + num2;
//                     break;
//                 case '-':
//                     result = num1 - num2;
//                     break;
//             }

//             // COLLAPSE: Remove num1, op, num2 and replace with result
//             // Example: [10, +, 5, *, 2] -> index i is at "*"
//             list.set(i, String.valueOf(result)); // Change "*" to "10"
//             list.remove(i + 1); // Remove "2"
//             list.remove(i - 1); // Remove "5"

//             // IMPORTANT: Move index back because the list shrank
//             i -= 2;
//         }
//     }
// }
