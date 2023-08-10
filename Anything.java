import java.util.Scanner;


public class Anything {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int largestNum = 0;

        System.out.println("\n\n Tell me my program is working!\n\n");




        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Please Enter the first number: ");
         num1 = scanner.nextInt();

        System.out.println("\n you entered: " + num1);

        System.out.println("\n Please Enter the second number: ");
         num2 = scanner.nextInt();

        System.out.println("\n you entered: " + num2);

        System.out.println("\n Please Enter the third number: ");
         num3 = scanner.nextInt();

        System.out.println("\n you entered: " + num3);

        System.out.println("\n The numbers: " + num1 + " and " + num2 + " and " + num3);

        largestNum = num1;

        if (num2 > largestNum) {
            largestNum = num2;
        }

        if (num3 > largestNum) {
            largestNum = num3;
        }

        System.out.println("\n The largest number is: " + largestNum);
    }

}