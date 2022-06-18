package PraktikumTugas7;

public class Sales extends Pegawai{
    private int penjualan;
    private double komisi;

    public Sales(String nama, String noKTP, int penjualan, double komisi){
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    @Override
    public double gaji(){
        return (getPenjualan() *getKomisi());
    }

    @Override
    public void tampilData(){
        System.out.print("Sales\t\t\t : "+super.getNama()+"\n");
        System.out.print("No. KTP \t\t : "+super.getNoKTP()+"\n");
        System.out.print("Total Penjualan\t : "+(double)this.getPenjualan()+"\n");
        System.out.print("Besaran Komisi\t : "+(int)this.getKomisi()+"\n");
        System.out.println("Pendapatan\t\t : Rp "+(int)gaji()+"\n");
        }
}
