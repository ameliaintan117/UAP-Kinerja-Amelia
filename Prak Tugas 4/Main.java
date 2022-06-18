package studi.kasus.pbo;

public class Main {
    public static void main(String[] args) {
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        DataMerchant.tampilData();
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(DataMerchant.in.nextLine(), DataMerchant.in.nextLine(), DataMerchant.in.nextInt()));
        DataMerchant.tampilData();
    }
}
