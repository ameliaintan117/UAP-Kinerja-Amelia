package PraktikumTugas6;

public class Pekerja extends Manusia{
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;
    static int jumlah2 = 0;

    public Pekerja(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah){
        super(nama, NIK, jenisKelamin, menikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.NIP = NIP;
    }

    public double getGaji() {
        gaji = this.hariKerja*this.jamKerja*15;
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getBonus() {
        int libur = 0;
        int minggu = 0;
        for (int i = 1; i < getHariKerja(); i++) {
            if((i-minggu) % 6 == 0){
                libur++;
            }
            if(i % 7 == 0){
                libur++;
                minggu++;
            }
        }
        double jamLembur = (getJamKerja()-7)<0?0:getJamKerja()-7;
        double bonusLembur = (getHariKerja()-libur)*jamLembur*7;
        double bonusLibur = libur*getJamKerja()*20;
        bonus = bonusLembur + bonusLibur;
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }
    public String getStatus(){
        String kantorCabang = "";
        String Departemen = "";
        switch(getNIP().charAt(0)){
            case '1':
                kantorCabang = "Mondstadt";
                break;
            case '2':
                kantorCabang = "Liyue";
                break;
            case '3':
                kantorCabang = "Inazuma";
                break;
            case '4':
                kantorCabang = "Sumeru";
                break;
            case '5':
                kantorCabang = "Fontaine";
                break;
            case '6':
                kantorCabang = "Natlan";
                break;
            case '7':
                kantorCabang = "Snezhnaya";
                break;
        }switch (getNIP().charAt(6)){
            case '1':
                Departemen = "Pemasaran";
                break;
            case '2':
                Departemen = "Humas";
                break;
            case '3':
                Departemen = "Riset";
                break;
            case '4':
                Departemen = "Teknologi";
                break;
            case '5':
                Departemen = "Personalia";
                break;
            case '6':
                Departemen = "Akademik";
                break;
            case '7':
                Departemen = "Administrasi";
                break;
            case '8':
                Departemen = "Operasional";
                break;
        }
        char status;
        status = getNIP().charAt(2);
        
        return (Departemen+", "+kantorCabang+" cabang ke-"+status);
    }
    public void totalPekerja(){
        System.out.println(jumlah2);
    }

    public String toString() {
        jumlah2++;
        double bonusLembur = 0;
        double bonusLibur = 0;
        gaji = (getJamKerja()*getHariKerja()*15);
        bonusLibur = ((((getHariKerja()/7)*2)*getJamKerja()*20));
        if(getJamKerja()>7){
            double hasil = ((getHariKerja()/7)*2)-getHariKerja();
            bonusLembur = ((7-getJamKerja()*7));
        }
        bonus = bonusLembur + bonusLibur;
        double pendapatan = (getPendapatan()+gaji+bonus);
        return "Nama            : "+getNama()+
                "\nNIK             : "+getNIK()+
                "\nNIP             : "+getNIP()+
                "\nJenis Kelamin   : "+getJenisKelamin()+
                "\nPendapatan      : "+pendapatan+"$"+
                "\nBonus           : "+bonus+"$"+
                "\nGaji            : "+gaji+"$"+
                "\nStatus          : "+getStatus()+"\n";
    }
}
