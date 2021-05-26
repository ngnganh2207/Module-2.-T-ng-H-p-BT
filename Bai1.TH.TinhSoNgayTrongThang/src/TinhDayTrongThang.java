import java.util.Scanner;

public class TinhDayTrongThang {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Which month that you want to count day? ");
        int month= sc.nextInt();
        String daysInMonth;
        switch (month){
            case 2:
//                System.out.print("The month '2' has 28 or 29 days! ");
                daysInMonth="28 or 29";
                break;
            case 1:
//                System.out.print("The month " + month + " has 31 day!");
//                break;
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
//                System.out.print("The month '" + month + "' has 31 days!");
                daysInMonth="31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
//                System.out.print("The month '" + month + "' has 30 days!");
                daysInMonth="30";
                break;
            default:
//                System.out.print("Invalid input!");
                daysInMonth="";
                break;
        }
        if(daysInMonth!= ""){
            System.out.printf("The monte '%d' has %s days!", month, daysInMonth);
        }else {
            System.out.print("Invalid input!");
        }

    }
}
