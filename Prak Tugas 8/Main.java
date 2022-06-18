package PraktikumTugas8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nama : Amelia Intan Permatasari");
        System.out.println("NIM  : 215150601111009");
        System.out.println("Selamat datang di game Defend FILKOM !");
        System.out.print("Silahkan masukkan nama player : ");
        String nama = input.nextLine();
        Character hero = inputPilihan();
        Titan titan = new Titan();
        System.out.println("Selamat datang, " + nama + " !");

        hero.info();
        System.out.println();
        String hasilGame = game(titan,hero,nama);

        System.out.println("================================================");
        if(hasilGame.equalsIgnoreCase("menang"))
            System.out.println(nama + " menang");
        else if(hasilGame.equalsIgnoreCase("kalah"))
            System.out.println(nama + " kalah");
        else if(hasilGame.equalsIgnoreCase("seri"))
            System.out.println("Pertandingan Berakhir dengan Seri");

        System.out.println("\n==================== PLAYER ====================");
        hero.info();
        System.out.println("\n==================== MUSUH =====================");
        titan.info();

    }
    static Character inputPilihan(){
        System.out.println("Silahkan pilih karakter yang Anda inginkan :" +
                "\n1. Magician" +
                "\n2. Healer" +
                "\n3. Warrior");
        try {
            int pilihan =
                    Integer.parseInt(input.nextLine());
            if (pilihan < 1 || pilihan > 3) throw new

                    InputMismatchException();
            switch (pilihan) {
                case 1:
                    return new Magician();
                case 2:
                    return new Healer();
                default:
                    return new Warrior();
            }
        } catch (Exception e) {
            if (e instanceof NumberFormatException)
                System.err.println("Tolong masukkan input berupa angka!");

            else if (e instanceof InputMismatchException) System.err.println("Tolong masukkan input antara 1-3!");
            return inputPilihan();
        }
    }

    static String game(Titan titan, Character hero,
                       String nama) {

        String hasil = "";
        for (int i = 1; ; i++) {
            System.out.print("==================== TURN " + i + " ");

            if (i < 10)

                System.out.println("====================");

            else

                System.out.println("====================");

            if (i % 2 == 0 && hero instanceof Healer) {
                System.out.println(nama + " menggunakan skill Heal!");
                ((Healer) hero).heal();
            }
            if (hero.attack()) {
                System.out.println(nama + " berhasil menyerang Titan!");
                titan.receiveDamage(hero.getAttack());}
            if(titan.attack()){
                System.out.println("Titan berhasil menyerang " + nama + "!");
                hero.receiveDamage(titan.getAttack());
            }
            System.out.println("Enemy's HP\t: "+
                    titan.getHP());
            System.out.println(nama + "'s HP\t: "+
                    hero.getHP());

            if (titan.getHP() == 0 && hero.getHP() == 0)
                return "seri";

            if (titan.getHP() == 0) return "menang";
            if (hero.getHP() == 0) return "kalah";
        }
    }
        }


