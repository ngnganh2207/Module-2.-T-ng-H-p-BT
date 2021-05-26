import java.util.Arrays;
import java.util.Scanner;

public class NhapSo {
    public static void main(String[] args) {
        Scanner number= new Scanner(System.in);
//        Bài tập 5:
//        Viết chương trình cho phép nhập vào một số nguyên
//        Nếu số đó chia hết cho 3 thì hiển thị FIZZ
//        Nếu số đó chia hết cho 5 hiển thị BUZZ
//        Nếu số đó chia hết cả 3 và 5 thì hiển thị FIZZBUZZ
/*        System.out.println("Bài Tập 5: Enter The Int Number: ");
        int num= number.nextInt();
        boolean isDivisibleBy3= num%3==0;
        boolean isDivisibleBy5= num%5==0;
        if(isDivisibleBy3&&isDivisibleBy5){
            System.out.print("FIZZBUZZ");
        }else if(isDivisibleBy3){
            System.out.print("FIZZ");
        }else if(isDivisibleBy5){
            System.out.print("BUZZ");
        }

 */
//        Bài tập 4:
//        Viết chương trình cho phép nhập vào 3 số
//        Chương trình sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác vuông hay không.
/*        System.out.println("Nhập cạnh a: ");
        int a= number.nextInt();
        System.out.println("Nhập cạnh b: ");
        int b= number.nextInt();
        System.out.println("Nhập cạnh huyền c: ");
        int c= number.nextInt();
        boolean sumab= (a+b)>c;
        boolean sumac= (a+c)>b;
        boolean sumbc=(b+c)>a;
        boolean pitago= (a*a+b*b)== c*c;
        if (sumab&&sumac&&sumbc&&pitago){
            System.out.print("a,b,c là 3 cạnh của tam giác vuông!");
        }else{
            System.out.print("a,b,c không là 3 canh của tam giác vuông!");
       }
*/
//        Bài tập 4:(cách 2)
//        Viết chương trình cho phép nhập vào 3 số
//        Chương trình sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác vuông hay không.
/*        double[] sides2 = new double[3];
        System.out.println("Nhập cạnh a");
        sides2[0] = number.nextDouble();
        System.out.println("Nhập cạnh b");
        sides2[1] = number.nextDouble();
        System.out.println("Nhập cạnh c");
        sides2[2] = number.nextDouble();
        Arrays.sort(sides2);
        if (Math.hypot(sides2[0],sides2[1]) == sides2[2] && (sides2[0] > 0)) {
            System.out.println("3 cạnh của một tam giác vuông");
        } else {
            System.out.println("Không phải 3 cạnh của một tam giác vuông");
        }
 */
//        Bài tập 3:
//        Viết chương trình cho phép nhập vào 3 số thực
//        Chương trình này sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác hay không.
        double[] sides1 = new double[3];
        System.out.println("Nhập cạnh a");
        sides1[0] = number.nextDouble();
        System.out.println("Nhập cạnh b");
        sides1[1] = number.nextDouble();
        System.out.println("Nhập cạnh c");
        sides1[2] = number.nextDouble();
        //Tìm hiểu phương thức Arrays.sort
        Arrays.sort(sides1);
        //Tại sao chỉ cần 1 tổng 2 cạnh> cạnh kia
        if (sides1[0]+sides1[1]> sides1[2]) {
            System.out.println("3 cạnh của một tam giác");
        } else {
            System.out.println("Không phải 3 cạnh của một tam giác");
        }


//        Bài tập 2:
//        Viết chương trình cho phép nhập vào một số nguyên dạng số, sau khi chạy thì chương trình sẽ ghi số đó ra dưới dạng chữ.
//                VD: 1 -> Một, 2 -> Hai, …
        String[] word={"không","Một","Hai","Ba","Bốn","Năm","Sáu","Bảy","Tám","Chín","Mười"};
        //Nếu khai báo int num2 trong scope 'do' thì num2 trong (while) báo đỏ.
        //Nếu num2 trong scope thì là biến cục bộ, phải khai báo ngoài mới là biến toàn cục. Trong điều kiện while mới hiểu được.
        int num2;
        do{
            System.out.println("Bài Tập 2. Nhập số nguyên(0-10): ");
           num2= number.nextInt();
        }while(num2<0||num2>10);
        System.out.println(word[num2]);
//        Bài tập 1:
//        Viết chương trình Java mà khi chạy, màn hình console sẽ cho phép ta nhập vào một số nguyên, in ra màn hình “Đây là số nguyên dương”
//        Nếu số vừa nhập vào là một số lớn hơn hoặc bằng 0, ngược lại in ra “Đây là số nguyên âm”.
/*        System.out.println("Bài tập 1: Nhập vào một số nguyên");
        int num1 = number.nextInt();
        if (num1 >= 0) {
            System.out.println("Đây là số nguyên dương");
        } else {
            System.out.println("Đây là số nguyên âm");
        }

*/

    }
}
