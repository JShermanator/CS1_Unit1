import java.util.Scanner;
import static java.lang.Math.sqrt;
/*
Code Written and Compiled by Justin Sherman
 */

class Lab1 {

    public static void main(String args[]){

        //Declaring and assigning
        int chem = 4;
        int physics = 8;
        int music = 2;
        int math_lab = 12;
        double total;
        double avg;

        //Assigning complex
        total = chem + physics + music + math_lab;
        avg = total / 4;

        System.out.println("Chemistry: " + chem);
        System.out.println("Physics: " + physics);
        System.out.println("Music: " + music);
        System.out.println("Math Lab: " + math_lab);
        System.out.println();
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);

    }


}

class Lab2{

    public static void main(String[] args){

        //Declaring Variables
        String name;
        int age;
        String color;
        double height;
        String adj;
        
        Scanner scan = new Scanner(System.in);
      
        //Input from user
        System.out.println("Enter a Name...");
        name = scan.nextLine();
        
        System.out.println("Enter an age...");
        age = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter a color...");
        color = scan.nextLine();
      
        System.out.println("Enter a height in meters...");
        height = scan.nextDouble();
        scan.nextLine();
      
        System.out.println("Enter an adjective...");
        adj = scan.next();
      
      
        //Print final output
        System.out.println(name + " is a "+ adj + " " + color + " " + age + " year old who is " + height + " meters tall." );


    }
}

class Lab3{
        
    public static void main(String args[]){
        
        //Decalring
        String name;
        int age;
        int grade;
        String dob;
        double gpa;
        boolean ic;


        //Construct Scanners
        Scanner scan = new Scanner(System.in);


        //Input
        System.out.println("Enter a Name...");
        name = scan.nextLine();
        
        System.out.println("Enter an age...");
        age = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Enter a grade level...");
        grade = scan.nextInt();
        scan.nextLine();
      
        System.out.println("Enter a date of birth...");
        dob = scan.nextLine();
      
        System.out.println("Enter a GPA...");
        gpa = scan.nextDouble();
        scan.nextLine();
        
        System.out.println("True or false, do you like ice cream?");
        ic = scan.nextBoolean();

        //Output
        System.out.println("/--------------------\\");
        System.out.print("| Name:   "); System.out.printf("%-10s", name); System.out.print(" |");
        System.out.println();
        System.out.print("| Age:    "); System.out.printf("%-10s", age); System.out.print(" |");
        System.out.println();
        System.out.print("| Grade:  "); System.out.printf("%-10s", grade); System.out.print(" |");
        System.out.println();
        System.out.print("| DoB:    "); System.out.printf("%-10s", dob); System.out.print(" |");
        System.out.println();
        System.out.print("| GPA:    "); System.out.printf("%-10s", gpa); System.out.print(" |");
        System.out.println();
        System.out.print("| Likes Ice Cream? " + "  |");
        System.out.println();
        System.out.print("|         "); System.out.printf("%-10s", ic); System.out.print(" |");
        System.out.println();
        System.out.println("\\--------------------/");


    }
}


class Lab4{
     public static void main(String args[]){

         //declaring
         float num1;
         float num2;
         Scanner in = new Scanner(System.in);

         //input
         System.out.println("Enter Number 1...");
         num1 = in.nextFloat();

         System.out.println("Enter Number 2...");
         num2 = in.nextFloat();

         //output
         System.out.print("Sum:        "); System.out.printf("%5.2f",num1 + num2);
         System.out.println();
         System.out.print("Difference: "); System.out.printf("%5.2f",num1 - num2);
         System.out.println();
         System.out.print("Product:    "); System.out.printf("%5.2f",num1 * num2);
         System.out.println();
         System.out.print("Quotient:   "); System.out.printf("%5.2f",num1 / num2);
         System.out.println();
         System.out.print("Modulo:     "); System.out.printf("%5.2f",num1 % num2);

     }
}

class Lab5{
     public static void main(String args[]){

         //declaring
         float num1;
         float num2;
         Scanner in = new Scanner(System.in);

         //input
         System.out.println("Enter Number 1...");
         num1 = in.nextFloat();

         System.out.println("Enter Number 2...");
         num2 = in.nextFloat();

         //output
         System.out.print("Sum:         "); System.out.printf("%5.2f",num1 + num2);
         System.out.println();
         System.out.print("Difference:  "); System.out.printf("%5.2f",num1 - num2);
         System.out.println();
         System.out.print("Product:     "); System.out.printf("%5.2f",num1 * num2);
         System.out.println();
         System.out.print("Quotient:    "); System.out.printf("%5.2f",num1 / num2);
         System.out.println();
         System.out.print("Modulo:      "); System.out.printf("%5.2f",num1 % num2);
         System.out.println();
         System.out.print("Square:      "); System.out.printf("%5.2f", num1 * num1);
         System.out.println();
         System.out.print("Square Root: "); System.out.printf("%5.2f", sqrt(num1));


     }
}