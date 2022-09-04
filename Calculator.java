package simple_calculator;

import java.util.Scanner;

public class Calculator{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Calculator!");

        boolean valid = false;
        int user =0;
        while(!valid){
            System.out.println("You can select from 4 operations: ");
            System.out.println("1. Addition\n2. Substraction\n3. Multiplication\n4. Division");
            user = scan.nextInt();
            if(user>4 || user<1){
                System.out.println("Invalid input. Try Again!");
                valid = false;
            }
            else{
                valid = true;
            }
        }
           
         
        System.out.println("Enter first number: ");
        double n1 = scan.nextDouble();

        System.out.println("Enter second number: ");
        double n2 = scan.nextDouble();
        System.out.println();
        runOperation(user, n1, n2);
        scan.close();

        

    }

    public static void runOperation(int user, double n1, double n2){

      switch(user){
        case 1:
            System.out.printf(n1 + " + " + n2 + " = %.2f", n1+n2);
            break;
        case 2:
        System.out.printf(n1 + " - " + n2 + " = %.2f", n1 -n2);
            
            break;
        case 3: 
            System.out.printf(n1 + " * " + n2 + " = %.2f", n1*n2);
            break;
        case 4:
            if(n2!=0){
                System.out.printf(n1 + " / " + n2 + " = %.2f", n1/n2);
                
            }
            else{
                System.out.println("Error: cannot divide by 0!");
            }
            break;

      }
       

    }

  
    


}