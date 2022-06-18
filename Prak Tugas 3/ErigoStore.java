import java.io.*;
import java.util.*;

class Baju {
    String jenis;
    int harga;
    int jumlah;
    public Baju(String jenis, int jumlah){
        this.jenis  = jenis;
        this.jumlah = jumlah;
    }
    final int bajua = 100000;
    final int bajub = 125000;
    final int bajuc = 175000;

    public Baju(){

    }
    void hargaa(){
        if(jumlah > 100){
            harga = 95000;
        } else{
            harga = bajua;
        }
    }
    void hargab(){
        if(jumlah > 100){
            harga = 120000;
        } else{
            harga = bajub;
        }
    }
    void hargac(){
        if(jumlah > 100){
            harga = 160000;
        } else{
            harga = bajuc;
        }
    }
    void display(){
        if(jenis.equalsIgnoreCase("a"))
            hargaa();
        else if(jenis.equalsIgnoreCase("b"))
            hargab();
        else if(jenis.equalsIgnoreCase("c"))
            hargac();
        System.out.println("Jenis yang anda beli    : " +jenis);
        System.out.println("Harga per buah          : " +harga);
        System.out.println("Total harga             : " +harga*jumlah);
    }
}
public class ErigoStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Baju yang tersedia :");
        System.out.println("Baju A dengan harga 100000");
        System.out.println("Baju B dengan harga 125000");
        System.out.println("Baju C dengan harga 175000");
        System.out.print("Baju yang akan anda beli bertipe : ");
        String jenis = input.nextLine();
        System.out.print("Jumlah Baju yang akan anda beli adalah : ");
        int jumlah = input.nextInt();
        Baju baju = new Baju(jenis,jumlah);
        baju.display();

    }
}
