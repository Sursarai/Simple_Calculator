package simple_calculator;

import java.util.Scanner;


public class Calculator{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Calculator!");

        boolean valid = true;

        do{
            System.out.println("You can select from 4 operations: ");
            System.out.println("1. Addition\n2. Substraction\n3. Multiplication\n4. Division");
            int user = scan.nextInt();
            if(user>4 || user<1){
                System.out.println("Invalid input. Try Again!");
                valid = false;
            }
            else{
                valid = true;
            }
        } while(!valid);
       
        

        

    }


}