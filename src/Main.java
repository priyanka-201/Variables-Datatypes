/*Print Hello world*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //   System.out.println("Welcome to I.T. Mastar!");
        //}

//Declare a variable

 //       String name;
//Initialize the variable

   //     name = "priyanka";
     //   System.out.println("Hi " + name + " welcome to I.T Mastar");

       /* Scanner scan=new Scanner(System.in);
        String name;
        System.out.println("Enter your name");
        name= scan.next();
        System.out.println("name : " +name);
        System.out.println("Hi " + name + " welcome to I.T Mastar");

    }*/
        Scanner scan=new Scanner(System.in);       //we have import the scanner package//

        System.out.println("Enter your name");

        String name=scan.next();

        System.out.println("Enter your age");

        int age=scan.nextInt();

        System.out.println("Enter your cgpa");

        double cgpa=scan.nextDouble();

        System.out.println("Are you working anywhere , Answer 'y' or 'n' p");

        char workingSomeWhere=scan.next().charAt(0);

       // System.out.println("Describe your goal in one line");

        //String description = scan.nextLine();

        System.out.println("Please verify and confirm your details ! !");

        System.out.println("name:"+name);

        System.out.println("age:"+age);

        System.out.println("cgpa:"+cgpa);

        System.out.println("workingSomeWhere:"+workingSomeWhere);

       // System.out.println("your goal:"+description);

        System.out.println("Please confirm your details!! Enter correct or wrong");

                String confirmation =scan.next();

        if(confirmation.equalsIgnoreCase("CORRECT"))
        {
            System.out.println("Hi"+name+"welcome to I.T Mastar");

        }else
        {
            System.out.println("Please apply later!!");

        }

    }
}