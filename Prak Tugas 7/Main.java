package PraktikumTugas7;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nama    : Amelia Intan Permatasari");
        System.out.println("NIM     : 215150601111009");
        Pegawai pgt1 = new PegawaiTetap("Niza Dian", "3519035106020001", 5000000);
        Pegawai pgt2 = new PegawaiTetap("Triana Risnawati", "3519035107020003", 7000000);
        Pegawai pgt3 = new PegawaiTetap("Feisal Hafidz", "3519038025100009", 8500000);
        System.out.println("=================== DATA PEGAWAI TETAP ===================");
        pgt1.tampilData();
        pgt2.tampilData();
        pgt3.tampilData();

        Pegawai pgh1 = new PegawaiHarian("Rafa Malika", "3508035209030001", 200000, 20);
        Pegawai pgh2 = new PegawaiHarian("Munirin ", "3508035209030002", 150000, 15);
        Pegawai pgh3 = new PegawaiHarian("Dian Waluyo", "3508035209030003", 80000, 12);
        System.out.println("=================== DATA PEGAWAI HARIAN ===================");
        pgh1.tampilData();
        pgh2.tampilData();
        pgh3.tampilData();

        Sales sls1 = new Sales("May Cendy", "3524035107030020", 120, 150000);
        Sales sls2 = new Sales("Maiza Alika", "3524035107030021", 85, 120000);
        Sales sls3 = new Sales("Raynar Zidan", "3524035107030022", 50, 100000);
        System.out.println("=================== DATA SALES ===================");
        sls1.tampilData();
        sls2.tampilData();
        sls3.tampilData();

    }
}
