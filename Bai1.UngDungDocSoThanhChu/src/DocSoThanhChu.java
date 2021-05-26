import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        System.out.println("Enter the Number: " );
        Scanner number= new Scanner(System.in);
        int a= number.nextInt();
        String[] word= {"không","một","hai","ba","bốn","năm","sáu","bảy","tám","chín","mười"};
        String[] word2={"","một","hai","ba","bốn","năm","sáu","bảy","tám","chín","mười"};
        if(a<0){
            System.out.println("Out of ability");
        }
        if(a>=0&&a<=10){
            System.out.println(word[a]);
        }else if(a>=11&&a<=19){
            System.out.println("mười"+word[a%10]);
        }else if(a%10==0){
            System.out.println(word[a/10]+"mươi");
        }else if(a>20&&a<99){
            if(a%10==1){
                System.out.println(word[a/10]+"mươi mốt");
            }else{
                System.out.println(word[a/10]+"mươi"+word[a%10]);
            }
        }else if(a>=100&&a<=999){
            if(a%100<10){
                System.out.println(word[a/100]+"trăm linh"+word[a%100]);
            }else if(a%100==10){
                System.out.println(word[a/100]+"trăm mười");
            }else if(a%100>=11&&a%100<20){
                System.out.println(word[a/100]+"trăm mười"+word[(a%100)%10]);
            }else if(a%100>20){
                System.out.println(word2[a/100]+"trăm"+word2[(a%100)/10]+"mươi"+word2[(a%100)%10]);
            }else if(a>100&&(a%100)%10==1){
                System.out.println(word[a/100]+"trăm"+word[(a%100)/10]+"mươi mốt");
            }
        }

    }
}
