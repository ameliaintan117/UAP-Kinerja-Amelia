//Nama  : Amelia Intan Permatasari
//NIM   : 215150601111009
package Tugas5;
import java.util.ArrayList;

public class RentArchive {
    static ArrayList<CarRent> rentData = new ArrayList<CarRent>();
    
    public void Rent(CarRider rider, Car car, int rentDur){
        if(car.getStatus()==true){
            System.out.println("MOBIL BERHASIL DISEWA");
            car.setStatus(false);
            rentData.add(new CarRent(rider, car, rentDur));
        }else{
            System.out.println("MAAF, MOBIL SUDAH DISEWA");
        }
    }
    
    public void info(){
        System.out.println("----------------------------------------");
        System.out.println("  INFORMASI PELANGGAN         ");
        System.out.println("----------------------------------------");
        
        for (int i = 0; i < rentData.size(); i++) {
            System.out.println("NAMA PEMINJAM \t: " +rentData.get(i).getCarRider().getName());
            System.out.println("TIPE MOBIL \t: " +rentData.get(i).getCar().getCarType());
            System.out.println("NO. POLISI \t: " +rentData.get(i).getCar().getPolNum());
            System.out.println("LAMA RENTAL \t: " +rentData.get(i).getRentDur());
        }
        System.out.println("");
    }
}
