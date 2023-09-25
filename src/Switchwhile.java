import java.util.Scanner;

public class Switchwhile {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
//        System.out.println("Do you want to enroll in our course. Please enter 'y' or 'n'");
//        char choice=s.next().charAt(0);
//        switch (choice){
//            case 'y':
//            case 'Y':
//
//                System.out.println("Thanks for enrolling !!");
//                break;
//            case 'n':
//            case 'N':
//
//                System.out.println("It's ok.Reach out to you when you are interested");
//                break;
//            default:
//                System.out.println("Entered wrong choice..Please try again");
//        }
        System.out.println("Enter color : Red/Yellow/Green");
        String color=s.next();
        switch (color){
            case "Red":
                System.out.println("STOP");
                break;
            case "Yellow":
                System.out.println("GET READY");
                break;
            case "Green":
                System.out.println("GO");
                break;
            default:
                System.out.println("Please look at traffic color");
        }

    }
}
