import java.io.*;
import java.util.*;

class Persegi {
    int sisi;
    public Persegi(int sisi){
        this.sisi = sisi;
    }
    public int luasPersegi(){
        int luas = sisi*sisi;
        System.out.println(luas);
        return luas;
    }
}
class Segitiga {
    int alas,tinggi;

    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public int luasSegitiga(){
        int luas = (alas*tinggi/2);
        System.out.println(luas);
        return luas;
    }
}
class Lingkaran {
    int jarijari;

    public Lingkaran(int jarijari){
        this.jarijari = jarijari;
    }
    public int LuasLingkaran1(){
        int luas = (int)(22/7*jarijari*jarijari);
        System.out.println((double) luas);
        return luas;
    }
    public int LuasLingkaran2(){
        int luas = (int)(3.14*jarijari*jarijari);
        System.out.println((double) luas);
        return luas;
    }
}
public class MenghitungLuas{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan = input.nextInt();

        switch (pilihan){
            case 1:
                Persegi persegi = new Persegi(input.nextInt());
                persegi.luasPersegi();
                break;

            case 2:
                Segitiga segitiga = new Segitiga(input.nextInt(),input.nextInt());
                segitiga.luasSegitiga();
                break;

            case 3:
                int jarijari = input.nextInt();
                Lingkaran lingkaran = new Lingkaran(jarijari);
                if(jarijari % 7 == 0){
                    lingkaran.LuasLingkaran1();
                }
                else{
                    lingkaran.LuasLingkaran2();
                }
                break;
            default: System.out.println("Input yang anda masukan tidak sesuai");
        }
    }

}
    