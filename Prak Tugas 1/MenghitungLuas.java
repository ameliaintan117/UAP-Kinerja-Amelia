import java.io.*;
import java.util.*;

public class MenghitungLuas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan = input.nextInt();
        
        switch (pilihan){
            
            case 1:
                int sisi = input.nextInt();
                System.out.println(persegi(sisi));
                break;
                
            case 2:
                double alas = input.nextDouble();
                double tinggi = input.nextDouble();
                System.out.println(segitiga(alas,tinggi));
                break;
                
            case 3:
                double jarijari = input.nextDouble();
                if(jarijari%7 == 0){
                    System.out.println(lingkaran1(jarijari));
                }
                else{
                    System.out.println(lingkaran2(jarijari));
                }
                break;
            default: System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
    public static int persegi(int sisi){
        int hasil = (int)(sisi*sisi);
        return hasil;
    }
    public static int segitiga(Double alas, Double tinggi){
        int hasil = (int)(alas*tinggi/2);
        return hasil;
    }
    public static double lingkaran1(double jarijari){
        double hasil = 22/7*jarijari*jarijari;
        return hasil;
    }
    public static double lingkaran2(double jarijari){
        double hasil = 3.14*jarijari*jarijari;
        int result = (int)hasil; 
        return result;
    }
}