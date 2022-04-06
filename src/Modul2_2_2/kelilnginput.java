package Modul2_2_2;
import java.util.Scanner;

public class kelilnginput {
    public static void main(String[] args) {
        kelilnginput we = new kelilnginput();
        we.inputkeliling();
    }

    public void inputkeliling(){
        rumuskeliling xy = new rumuskeliling();
        Scanner tr = new Scanner(System.in);
        System.out.println("Program Kalkulator Menghitung Luas atau Keliling Belah Ketupat");
        System.out.println("1. Luas Belah Ketupat");
        System.out.println("2. Keliling Belah Ketupat");
        System.out.print("Masukkan Pilihan Anda: ");
        int choose = tr.nextInt();
        if(choose == 1 ){
            xy.menuluas();
        }else if (choose == 2){
            xy.menukeliling();
        }else{
            System.out.println("Mohon Maaf Anda Salah Input");
            System.out.println("\n\n\n");
            inputkeliling();
        }
    }
}
