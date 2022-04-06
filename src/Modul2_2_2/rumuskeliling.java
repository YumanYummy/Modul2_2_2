package Modul2_2_2;
import java.util.Scanner;

public class rumuskeliling {
    Scanner input  = new Scanner(System.in);

    private int diagonal1;
    private int diagonal2;
    private int sisi;
    private int keliling;
    private int luas;
    private int roar;

    public int getKeliling(){
        return keliling = sisi+sisi+sisi+sisi;
    }

    public int getluas(){
        return luas = (diagonal1*diagonal2) * 1/2 ;
    }

    public void menuluas(){
        kelilnginput dd = new kelilnginput();
        System.out.println("=====================================");
        System.out.print("Masukkan Sisi: ");
        sisi = input.nextInt();
        System.out.println("Hasil Keliling Belah Ketupat Adalah: " +getKeliling()+ " cm");
        System.out.println("=====================================");
        System.out.print("Tekan 1 Untuk Lanjut / Tekan 0 Untuk Exit: ");
        roar = input.nextInt();
        if(roar == 1){
            System.out.println("\n");
            dd.inputkeliling();
        }else{
            System.exit(292);
        }
    }

    public void menukeliling(){
        kelilnginput dd = new kelilnginput();
        System.out.println("=====================================");
        System.out.print("Masukkan Diagonal 1: ");
        diagonal1 = input.nextInt();
        System.out.print("Masukkan Diagonal 2: ");
        diagonal2 = input.nextInt();
        System.out.println("Hasil Luas Belah Ketupat Adalah: " +getluas() + " cm2");
        System.out.println("=====================================");
        System.out.print("Tekan 1 Untuk Lanjut / Tekan 0 Untuk Exit: ");
        roar = input.nextInt();
        if(roar == 1){
            System.out.println("\n");
            dd.inputkeliling();
        }else{
            System.exit(292);
        }
    }
}
