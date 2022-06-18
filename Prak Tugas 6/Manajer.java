package PraktikumTugas6;

public class Manajer extends Pekerja{
    private int lamaKerja;
    static int jumlah3 = 0;

    Manajer(int jamKerja, int hariKerja, String NIP, String Nama,  String NIK, Boolean JenisKelamin, Boolean Menikah, int lamaKerja){
        super(jamKerja, hariKerja, NIP, Nama, NIK, JenisKelamin, Menikah);
        this.lamaKerja = lamaKerja;
    }

    void setlamaKerja(int lamaKerja){
        this.lamaKerja = lamaKerja;
    }
    int getlamaKerja(){
        return lamaKerja;
    }
    public void totalManajer(){
        System.out.println(jumlah3);
    }

    public String toString(){
        jumlah3++;
        double bonusLembur = 0;
        double hasil = 0;
        double bonusLibur = 0;
        double gaji = (getJamKerja()*getHariKerja()*15);
        if(getJamKerja() > 7){
            hasil = getHariKerja()-((double)(getHariKerja()/7)*2);
            bonusLembur = (hasil*(getJamKerja()-7)*7);
        }
        bonusLibur = ((((getHariKerja()/7)*2)*getJamKerja()*20));
        double bonus = (bonusLembur + bonusLibur) + ((bonusLembur + bonusLibur)*0.3);
        double pendapatan = (getPendapatan()+gaji+bonus+15);
        return ("Nama            : "+getNama()+
                "\nNIK             : "+getNIK()+
                "\nJenis Kelamin   : "+getJenisKelamin()+
                "\nPendapatan      : "+pendapatan+"$"+
                "\nBonus           : "+bonus+"$"+
                "\nGaji            : "+gaji+"$"+
                "\nStatus          : "+getStatus()+
                "\nLama Kerja      : "+getlamaKerja()+" hari"+"\n");
    }
}
