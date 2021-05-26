import java.util.Scanner;

public class MangNhieuChieu {
    public static void main(String[] args) {
        int[][] matrix =new int[10][10];
        Scanner input= new Scanner(System.in);
        System.out.println("Enter "+ matrix.length+ " rows and "+ matrix[0].length+ " columns: ");
        //Nhập dữ liệu vào mảng: tự nhập hoặc math.random
        for (int row=0; row< matrix.length;row++){
            for(int column=0;column<matrix[row].length;column++){
                //matrix[row][column]=input.nextInt();
                matrix[row][column]= (int) (Math.random()*100);
            }
        }
        //In mảng
        for(int row=0;row<matrix.length;row++){
            for(int column=0;column<matrix[row].length;column++){
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println("Hàng Mới");
        }
        //Tính tổng các phần tử trong mảng
//        int total=0;
//        for(int row=0; row<matrix.length;row++){
//            for(int column=0;column<matrix[row].length;column++){
//                total+= matrix[row][column];
//            }
//        }
//        System.out.println("tổng mảng là " +total);
        //Tính tổng từng cột(chỉ áp dụng cho ma trận hình chữ nhật hoặc vuông)
        for(int colums=0; colums<matrix[0].length;colums++){
            int total= 0;
            for(int row=0; row<matrix.length;row++){
                total+= matrix[row][colums];
            }
            System.out.println("Sum for column " + colums+ " is " +total);
        }
        //Tìm ra dòng có tổng các phần tử lớn nhất:
        int maxRow = 0;
        int indexOfMaxRow = 0;
        for (int column = 0; column < matrix[0].length; column++) {
            maxRow += matrix[0][column];
        }
        for (int row = 1; row < matrix.length; row++) {
            int totalOfThisRow = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                totalOfThisRow += matrix[row][column];
                if (totalOfThisRow > maxRow) {
                    maxRow = totalOfThisRow;
                    indexOfMaxRow = row;
                }
            }
        }
        System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);
        //Xáo trộn mảng
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                int i1 = (int) (Math.random() * matrix.length);
//                int j1 = (int) (Math.random() * matrix[i].length);
//
//                // Swap matrix[i][j] with matrix[i1][j1]
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[i1][j1];
//                matrix[i1][j1] = temp;
//            }
//        }



    }



}
