package PraktikumTugas6;

public class MahasiswaFilkom extends Manusia{
    private String NIM;
    private double IPK;
    static int jumlah1 = 0;

    public MahasiswaFilkom(String nama, String NIK, boolean jenisKelamin, boolean menikah, String NIM, double IPK){
        super(nama, NIK, jenisKelamin, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }
    public String getStatus(){
        String Angkatan = "";
        String Prodi = "";
        //Angkatan
        if(getNIM().startsWith("20")){
            Angkatan = "2020";
        }else if(NIM.startsWith("21")){
            Angkatan = "2021";
        }else if(getNIM().startsWith("22")){
            Angkatan = "2022";
        }
        //Prodi
        switch (getNIM().charAt(6)){
            case '2':
                Prodi = "Teknik Meniup Gelembung";
                break;
            case '3':
                Prodi = "Teknik Berburu Ubur Ubur";
                break;
            case '4':
                Prodi = "Sistem Perhamburgeran";
                break;
            case '6':
                Prodi = "Pendidikan Chum Bucket";
                break;
            case '7':
                Prodi = "Teknologi Telepon Kerang";
                break;
        }
        return Prodi + "," + Angkatan;
    }
    public double getBeasiswa(){
        double beasiswa;
        if(IPK >= 3.0 && IPK <= 3.5){
            beasiswa = 50;
        }else if(IPK > 3.5 && IPK <= 4){
            beasiswa = 75;
        }else{
            beasiswa = 0;
    }
        return beasiswa;
}
    public void totalMahasiswa(){
        System.out.println(jumlah1);
    }

    public String toString(){
        jumlah1++;
    return "Nama            : "+super.getNama()+
            "\nNIK             : "+super.getNIK()+
            "\nJenis Kelamin   : "+super.getJenisKelamin()+
            "\nPendapatan      : "+(super.getPendapatan()+this.getBeasiswa())+"$"+
            "\nNIM             : "+this.getNIM()+
            "\nIPK             : "+this.getIPK()+
            "\nStatus          : "+this.getStatus()+"\n";
    }
}
