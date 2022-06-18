//Nama  : Amelia Intan Permatasari
//NIM   : 215150601111009
package Tugas5;

public class Main {
    public static void main(String[] args) {
        CarRider amelia = new CarRider("Amelia",19,"080000000000");
        CarRider jono = new CarRider("Jono",20,"081111111111");
        CarRider jaka = new CarRider("Jaka",31,"081222222222");
        CarRider citra = new CarRider("Citra",40,"082333333333");
        
        CarData data = new CarData();
        data.addCar("SEDAN", "N 4314 AE", "Honda");
        data.addCar("SUV", "N 1543 EA", "Toyota");
        data.addCar("PICK UP", "N 2222 AB", "Suzuki");
        data.addCar("MPV", "N 3214 AD", "Toyota");
        
        data.listOfCar();
        
        RentArchive arsip = new RentArchive();
        arsip.Rent(amelia, data.carList.get(0), 2);
        arsip.Rent(jono, data.carList.get(3), 1);
        arsip.Rent(jaka, data.carList.get(0), 4);
        arsip.Rent(citra, data.carList.get(2), 3);
        
        System.out.println("");
        arsip.info();
    }
}
