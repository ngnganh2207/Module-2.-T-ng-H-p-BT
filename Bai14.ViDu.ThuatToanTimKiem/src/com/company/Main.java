package com.company;

public class Main {

    public static void main(String[] args) {
        //int[] arr1= {1,9,6,-8,4,65,6,2,0};
        int[] arr1= { 4, 3, 2,1, -3};
        //sout(arr1) -> sẽ chỉ hiện thị địa chỉ ô nhớ lưu biến mảng arr1.
        System.out.println(arr1);
        System.out.println("Mảng trước khi sắp xếp");
        showArray(arr1);
//        System.out.println("Mảng sau khi sắp xếp nổi bọt:");
//        bubbleSort(arr1);
//        showArray(arr1);
//        System.out.println("Mảng sau khi sắp xếp chọn:");
//        selectionSort(arr1);
//        showArray(arr1);
        System.out.println("Mảng sau khi sắp xếp chèn:");
        insertionSort(arr1);
        showArray(arr1);
    }
    public static void showArray(int[] arr1){
        for(int i=0;i< arr1.length;i++){
            System.out.print(arr1[i]+ ";");
        }
        System.out.println();
    }
//    //sắp xếp Nổi Bọt
//    public static void bubbleSort(int arr1[]){
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = arr1.length - 1; j > i; j--) {
//                if (arr1[j] > arr1[j - 1]) {
//                    int temp = arr1[j];
//                    arr1[j] = arr1[j - 1];
//                    arr1[j - 1] = temp;
//                }
//            }
//        }
//    }
//    //sắp xếp chọn(nhanh hơn nổi bọt)
//    public static void selectionSort(int[] arr1){
//        for (int i = 0; i < arr1.length-1; i++) {
//            int max = i;
//            for (int j = i + 1; j < arr1.length; j++) {
//                if (arr1[j] > arr1[max]) {
//                    max = j;
//                }
//            }
//            if (max != i) {
//                int temp = arr1[max];
//                arr1[max] = arr1[i];
//                arr1[i] = temp;
//            }
//        }
//    }
// sắp xếp chèn
     public static void insertionSort(int arr1[]) {
          for (int i = 1; i < arr1.length; i++) {
              int position = i;
              int temp = arr1[position];
              while (position > 0 && arr1[position - 1] > temp) {
                  arr1[position] = arr1[position - 1];
                  position--;
              }
              arr1[position] = temp;
    }
}
}
