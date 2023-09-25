import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
//        System.out.println("Enter your age");
//        int age=s.nextInt();
//
//        if(age<=18){
//
//            System.out.println("minor");
//        }else {
//            System.out.println("major");
//        }
//        System.out.println("Enter your score");
//        int score=s.nextInt();
//        if(score>=70){
//            System.out.println("Grade A");
//        } else if (score>=60 && score<70) {
//            System.out.println("Grade B");
//        } else if (score>=50 && score<60) {
//            System.out.println("Grade C");
//        }else {
//            System.out.println("Grade D");
//        }
        System.out.println("Enter first number");
        int num1=s.nextInt();
        System.out.println("Enter second number");
        int num2=s.nextInt();
        System.out.println("Enter third number");
        int num3=s.nextInt();
            if (num1>num2){
                System.out.println("The greatest number is :"+num1);
            }else if(num1>num3) {
                System.out.println("The greatest number is :"+num3);
            }
            if (num2>num3){
                System.out.println("The greatest number is : "+num2);
            }else {
                System.out.println("The greatest number is :"+num3);
            }
        }
    }

