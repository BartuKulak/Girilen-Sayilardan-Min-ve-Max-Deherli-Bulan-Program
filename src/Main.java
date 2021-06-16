import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        int n = input.nextInt();
        int max=0,min=0,temp=0;
        System.out.print("1. Sayıyı Giriniz: ");
        max=input.nextInt();
        min=max;
        for(int i=1; i<n; i++){
            System.out.print((i+1));
            System.out.print(". Sayıyı Giriniz: ");
            temp=input.nextInt();
            if(temp>max)
                max=temp;
            else if(temp<min)
                min=temp;
        }
        System.out.println("En büyük sayı: "+max);
        System.out.println("En küçük sayı: "+min);
    }
}
