//Nama  : Amelia Intan Permatasari
//NIM   : 215150601111009
package Tugas5;

public class Car {
    private String carType;
    private String polNum;
    private String merk;
    private boolean status;
    
    public Car(String carType, String polNum, String merk, boolean status){
        this.carType    = carType;
        this.polNum     = polNum;
        this.merk       = merk;
        this.status     = true;
    }
    public String getCarType(){
        return carType;
    }
    public String getPolNum(){
        return polNum;
    }
    public String getMerk(){
        return merk;
    }
    public boolean getStatus(){
        return status;
    }
    
    public void setStatus(boolean status){
        this.status     = status;
    }
}
