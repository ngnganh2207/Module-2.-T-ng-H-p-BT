import java.util.Scanner;

public class DocSoThanhChuCach2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int number;
        do{
            System.out.println("Nhập số cần đọc: ");
            number= scanner.nextInt();
            if(number>0&&number<10){
                switch (number){
                    case 1:{
                        System.out.println("Một");
                        break;
                    }case 2:{
                        System.out.println("Hai");
                        break;
                    }case 3:{
                        System.out.println("Ba");
                        break;
                    }case 4:{
                        System.out.println("Bốn");
                        break;
                    }case 5:{
                        System.out.println("Năm");
                        break;
                    }case 6:{
                        System.out.println("Sáu");
                        break;
                    }case 7:{
                        System.out.println("Bảy");
                        break;
                    }case 8:{
                        System.out.println("Tám");
                        break;
                    }case 9:{
                        System.out.println("Chín");
                        break;
                    }
                }
            }else {
                int hangChuc=number/10;
                int donVi=number%10;
                String numberToString="";
                switch (hangChuc){
                    case 1:{
                        numberToString+="Mười";
                        break;
                    }case 2:{
                        numberToString+="Hai mươi";
                        break;
                    }case 3:{
                        numberToString+="Ba mươi";
                        break;
                    }case 4:{
                        numberToString+="Bốn mươi";
                        break;
                    }case 5:{
                        numberToString+="Năm mươi";
                        break;
                    }case 6:{
                        numberToString+="Sáu mươi";
                        break;
                    }case 7:{
                        numberToString+="Bảy mươi";
                        break;
                    }case 8:{
                        numberToString+="Tám mươi";
                        break;
                    }case 9:{
                        numberToString+="Chín mươi";
                        break;
                    }
                }
                switch (donVi){
                    case 1:{
                        numberToString+="một";
                        break;
                    } case 2:{
                        numberToString+="hai";
                        break;
                    } case 3:{
                        numberToString+="ba";
                        break;
                    } case 4:{
                        numberToString+="bốn";
                        break;
                    } case 5:{
                        numberToString+="năm";
                        break;
                    } case 6:{
                        numberToString+="sáu";
                        break;
                    } case 7:{
                        numberToString+="bảy";
                        break;
                    }
                    case 8: {
                        numberToString += "tám";
                        break;
                    }
                    case 9: {
                        numberToString += " chín";
                        break;
                    }

                }
                System.out.println(numberToString);
            }
        }while(number>0&&number<100);
    }
}
