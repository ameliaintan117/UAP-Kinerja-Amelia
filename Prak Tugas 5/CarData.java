//Nama  : Amelia Intan Permatasari
//NIM   : 215150601111009
package Tugas5;
import java.util.ArrayList;

public class CarData {
    static ArrayList<Car> carList = new ArrayList<Car>();
    
    public void addCar(String carType, String polNum, String merk){
        carList.add(new Car(carType, polNum, merk, true));
    }
    public void listOfCar(){
        System.out.println("----------------------------------------");
        System.out.println("  DAFTAR MOBIL                ");
        System.out.println("----------------------------------------");
        for(Car daftar : carList){
            System.out.println("TIPE MOBIL  : " + daftar.getCarType());
            System.out.println("NO. POLISI  : " + daftar.getPolNum());
            System.out.println("MERK MOBIL  : " + daftar.getMerk());
            System.out.println("----------------------------------------");
        }
        System.out.println("");
    }
}
