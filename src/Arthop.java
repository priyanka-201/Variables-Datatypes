import java.util.Scanner;

public class Arthop {
    public static void main(String[] args) {

     /*   int a=10;
        int b=20;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b); */

        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1");
        int number1= sc.nextInt();
        System.out.println("Enter number2");
        int number2=sc.nextInt();
        int sum=number1+number2;
        System.out.println("The sum of "+number1+" and "+number2+" is "+sum);*/
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter radius");

        int radius=sc.nextInt();

        double pi=3.14;

        double area=pi*radius*radius;

        System.out.println("Area of circle " +area);
    }

}

