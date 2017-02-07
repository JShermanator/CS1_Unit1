import java.util.Scanner;
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
         System.out.print("Square Root: "); System.out.printf("%5.2f", Math.sqrt(num1));
         System.out.println();
         System.out.print("Random:      "); System.out.printf("%5.2f", Math.random()* num2);
         System.out.println();

         //If/Else Statement
         if (num1 > num2){
             System.out.print("Minimum:     "); System.out.printf("%5.2f", num2);
             System.out.println();
             System.out.print("Maximum:     "); System.out.printf("%5.2f", num1);
         }
         if (num2 > num1){
             System.out.print("Minimum:     "); System.out.printf("%5.2f", num1);
             System.out.println();
             System.out.print("Maximum:     "); System.out.printf("%5.2f", num2);
         }
         System.out.println();

         //Continue output
         System.out.print("Abs Value:   "); System.out.printf("%5.2f", Math.abs(num1));

     }
}

class Lab6{
    public static void main(String args[]){
        //declaring
        int q1;
        int q2;
        int q3;
        int q4;
        Scanner in = new Scanner(System.in);

        //q1 in and out
        System.out.println("You are stuck in a mysterious room. There is a bookshelf, a big switch, and a door. Do you...");
        System.out.println("1: Take out a Book");
        System.out.println("2: Pull down the switch");
        System.out.println("3: Open the door");

        q1 = in.nextInt();

        if (q1 == 1) {
            //q2 input and output
            System.out.println("The floor falls between your feet, you hear a heavy panting behind you, do you... ");
            System.out.println("1: Run");
            System.out.println("2: Fight");
            System.out.println("3: Hide");

            q2 = in.nextInt();

            if (q2 == 2) {
                //q3 input and output
                System.out.println("You turn around, face the beast, and prep yourself for a hell of a fight, do you...");
                System.out.println("1: Use the Wushi Finger Hold");
                System.out.println("2: DropKick his ass");

                q3 = in.nextInt();

                if (q3 == 1) {
                    //q4 input and output
                    System.out.println("SKADOOSH!!!");
                    System.out.println("The beast is down, and a genie or something appears, he asks you a riddle.");
                    System.out.println("What has four fingers, and a thumb, but is not living?");
                    System.out.println("1: A Cat");
                    System.out.println("2: A Chicken");
                    System.out.println("3: Run up and punch him in the face for trying to make you riddle.");

                    q4 = in.nextInt();

                    if (q4 == 3) {
                        System.out.println("That magical thing is knocked out by your sheer awesomeness as you strike him");
                        System.out.println("across the face screaming 'My Fist!!!'. He falls to the ground and the ");
                        System.out.println("room dissolves around you. You hop in your new prize1 Lambo and get home.");
                        System.out.println();
                        System.out.println("YOU WIN!!!");

                    } else {
                        System.out.println("That magic guy screams 'WRONG ANSWER' and zaps you with lightning.");
                        System.out.println("You are Dead.");
                    }

                } else {
                    System.out.println("Even though your DropKick was amazing, withstood the blow and hits you");
                    System.out.println("with one clean blow.");
                    System.out.println("You are Dead.");
                }

            } else {
                System.out.println("The Mysterious Beast Caught you.");
                System.out.println("You are Dead.");
            }
        }
        if (q1 == 2){
            System.out.println("You hear the click of the switch, and the rooms explodes into a thousand pieces.");
            System.out.println("You are Dead.");
           }
        if (q1 == 3){
            System.out.println("As you twist the doorknob, you hear a click, and the rooms explodes into a thousand pieces.");
            System.out.println("You are Dead.");

        }
    }
}