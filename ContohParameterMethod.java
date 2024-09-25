public class ContohParameterMethod {
    //Method dengan satu parameter
    public static int kaliDua(int angka) {
        int hasil = angka * 2;
    }

    // Method dengan beberapa parameter
    public static double hitungLuasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }
}

    public static void main(String[] args) {
        int hasilKaliDua = kaliDua(angka: 5); //memanggil method dengan argumen 5
        system.out.println("Luas segitiga: " + HasilKaliDua);

        double luasSegitiga = hitungLuasSegitiga( alas: 4, tinggi: 6);
    }
