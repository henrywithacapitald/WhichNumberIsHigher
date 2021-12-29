import java.util.Scanner;
public class WhichNumberIsHigher {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Find the largest number out of 10!");
        System.out.println("\n Input 3 numbers from 1 to 10");
        System.out.println("\n input the first number");
        double number1 = scan.nextDouble();
        System.out.println("\n input the second number");
        double number2 = scan.nextDouble();
        System.out.println("\n input the third number");
        double number3 = scan.nextDouble();
        System.out.println(number1 + " "+  number2 +" "+number3); 
        if (number1 > number2 && number1 > number3) {
            System.out.println("\n"+number1 + ": is the highest the number 1 input");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("\n"+number2+": is the highest the number 2 input");
        } else {
            System.out.println("\n" + number3+": is the highest the number 3 input");
        }
        


        
    }
}
