import java.util.Scanner;

public class calculatorko {
    
    // Scanner Object
    static Scanner scan = new Scanner(System.in); 

    public static void main(String[] args) {

        // Method Call PRODUCT

         int product = multiply();
         System.out.println("The Product is " + product);


         Method CALL Divide
         int quotient = divide();
         System.out.println("The Quotient is " + quotient);

         Method Call My Crush
        String crushName = myCrush();
        System.out.println(crushName);

        scan.close();
    }

     static int divide() {
         System.out.println("Enter two numbers to divide");
         System.out.println("Enter first number: ");
         int number1 = scan.nextInt();

         System.out.println("Enter second number: ");
         int number2 = scan.nextInt();

         return number1 / number2;

     }

     static int multiply() {
         System.out.println("Enter two numbers to multiply");
         System.out.println("Enter first number: ");
         int number1 = scan.nextInt();

         System.out.println("Enter second number: ");
         int number2 = scan.nextInt();

         return number1 * number2;
     }

    static String myCrush() {
        System.out.println("This will reveal the name of your two crushes");

        System.out.println("Enter your name");

        String myName = scan.nextLine();

        System.out.println("Enter the name of your first crush");

        String pangalanNgUnangCrushko = scan.nextLine();

        System.out.println("Enter the name of your second crush");

        String pangalanNgPangalawangCrushko = scan.nextLine();

        return myName + " loves " + pangalanNgUnangCrushko + " and also " + pangalanNgPangalawangCrushko ;
    }


}
