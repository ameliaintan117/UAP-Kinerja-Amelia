package PraktikumTugas6;
import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
        System.out.println("Nama    : Amelia Intan Permatasari");
        System.out.println("NIM     : 215150601111009");
        System.out.println("=================== DATA MANUSIA ===================");
       Manusia man = new Manusia("Aku", "3923842934",true, true);
       System.out.println(man.toString());
       Manusia man1 = new Manusia("Adik", "3923842935",true, false);
       System.out.println(man1.toString());
       Manusia man2 = new Manusia("Kakak", "3923842936",false, true);
       System.out.println(man2.toString());

       System.out.println();

       System.out.println("=============== DATA MAHASISWA FILKOM ===============");
       MahasiswaFilkom mhs = new MahasiswaFilkom("I Putu Yoga", "351923848239", false,false, "205150601111018",3.70);
       System.out.println(mhs.toString());
       MahasiswaFilkom mhs1 = new MahasiswaFilkom("Amelia Intan Permatasari", "351923848238", false,true, "215150601111009",4.00);
       System.out.println(mhs1.toString());
       MahasiswaFilkom mhs2 = new MahasiswaFilkom("Jaka Nusantara", "351923848237", true,false, "215150601111015",3.95);
       System.out.println(mhs2.toString());

       System.out.println();

       System.out.println("=================== DATA PEKERJA ===================");
       Pekerja pekerja = new Pekerja(7, 22,"195102439283", "Iqbal Biondy", "351717969", true,true);
       System.out.println(pekerja.toString());
       Pekerja pekerja1 = new Pekerja(9, 24,"596102339284", "Nauralaya Herista", "451717969", false,true);
       System.out.println(pekerja1.toString());
       Pekerja pekerja2 = new Pekerja(11, 26,"797102139285", "Rafa Malika", "551717969", true,false);
       System.out.println(pekerja2.toString());

       System.out.println();

       System.out.println("=================== DATA MANAJER ===================");
       Manajer manajer = new Manajer(9, 20,"204837583728", "Safana Herista", "3517073843920",false, false, 1500);
       System.out.println(manajer.toString());
       Manajer manajer1 = new Manajer(11, 22,"405837283729", "Endy Mada", "3517073843921",true, false, 1600);
       System.out.println(manajer1.toString());
       Manajer manajer2 = new Manajer(13, 24,"306837683727", "Fujianti Utami", "3517073843922",false, true, 1700);
       System.out.println(manajer2.toString());

       System.out.println("=================== TOTAL YANG TERDAFTAR ===================");
       System.out.print("\t1. Jumlah Manusia          : ");
       man.totalManusia();
       System.out.print("\t2. Jumlah Mahasiswa Filkom : ");
       mhs.totalMahasiswa();
       System.out.print("\t3. Jumlah Pekerja          : ");
       pekerja.totalPekerja();
       System.out.print("\t4. Jumlah Manajer          : ");
       manajer.totalManajer();
    }
}
