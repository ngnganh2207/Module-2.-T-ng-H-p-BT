public class XoaPhanTuKhoiMangTraVeMangMoi {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        removeElementFromArray(arr,3);
        for(int element : arr){
            System.out.println(element+ " ");
        }
    }
    // Xóa phần tử khỏi mảng, trả về mảng mới
    static int[] removeElementFromArray(int[] arr, int index) {
        int[] newArray = new int[arr.length - 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = arr[i];
        }
        for (int i = index + 1; i < arr.length; i++) {
            newArray[i - 1] = arr[i];
        }
        return newArray;
    }
}
