package PraktikumTugas6;

public class Manusia {
    private String nama;
    private String NIK;
    private boolean jenisKelamin;
    private boolean menikah;
    static int jumlah = 0;

    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah){
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public String getJenisKelamin(){
        return this.isJenisKelamin()?"Laki-laki":"Perempuan";
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public double getTunjangan(){
        double tunjangan;
        if(isJenisKelamin()==true){
            if(isJenisKelamin()==true){
                tunjangan = 25;
            }else{
                tunjangan = 20;
            }
        }else{
            tunjangan = 15;
        }
        return tunjangan;
    }
    public double getPendapatan(){
        double pendapatan = getTunjangan();
        return pendapatan;
    }
    public void totalManusia() {
        System.out.println(jumlah);
    }

    public String toString(){
        jumlah++;
        return "Nama            : "+this.getNama()+
                "\nNIK             : "+this.getNIK()+
                "\nJenis Kelamin   : "+this.getJenisKelamin()+
                "\nPendapatan      : "+this.getPendapatan()+"$"+"\n";
    }

}
