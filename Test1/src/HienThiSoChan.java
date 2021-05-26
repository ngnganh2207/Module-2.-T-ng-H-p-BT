import java.sql.SQLOutput;
import java.util.Scanner;

public class HienThiSoChan {
    public static void main(String[] args) {
//        int[] arr={1,6,8,4,5,3};
//        boolean check= false;
//        for(int element: arr){
//            if(element%2==0){
//                System.out.println("Có số chẵn");
//                break;
//            }else {
//                System.out.println("Không có số chắn");
//            }
//        }
//  Nhập 1 số kiển tra số đó có trong mảng hay không? Hiển thị vị trí phần tử đó nếu có.
//        Scanner scanner= new Scanner(System.in);
//        int[] arr= {1 ,2, 3, 4, 5, 6};
//        System.out.println("Nhập số");
//        int number= scanner.nextInt();
//        for(int i=0;i<arr.length;i++){
//            if(number== arr[i])
//        }
        String[] array = {"Hello", "Hi", "School"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị");
        String input = scanner.nextLine();
        int i = 0;
        for (String element : array) {
            if (element.equals(input)) {
                System.out.println(element);
                System.out.println("Vị trí: " + i);
            }
            i++;
        }
    }
}

