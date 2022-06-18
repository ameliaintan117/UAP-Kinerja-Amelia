package PraktikumTugas7;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class PegawaiTetap extends Pegawai{
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah){
        super(nama, noKTP);
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }
    @Override
    public double gaji(){
        return this.upah;
    }

    @Override
    public void tampilData(){
        System.out.print("Pegawai Tetap\t : "+super.getNama()+"\n");
        System.out.print("No. KTP \t\t : "+super.getNoKTP()+"\n");
        System.out.print("Upah\t\t\t : "+this.getUpah()+"\n");
        System.out.println("Pendapatan\t\t : Rp "+(int)gaji()+"\n");

    }
}
