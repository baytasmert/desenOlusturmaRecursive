import java.util.Scanner;

public class Main {
static int sayac=0;
    static int desen(int n){
       sayac++;
        if (n>0){
            System.out.println(n);
            return n+desen(n-5);
        } else{
            int ilkSayi=n+sayac*5;
        return desen2(n,ilkSayi);}
    }

    static int desen2(int n ,int ilk){

        if(n<ilk){
            System.out.println(n);
            return n+ desen2(n+5,ilk);
        }
        else {
            return ilk;
        }
    }

    public static void main(String[] args) {
            int n;
        Scanner oku=new Scanner(System.in);

        System.out.println("Sayi giriniz: ");
        n=oku.nextInt();
        desen(n);
    }
}