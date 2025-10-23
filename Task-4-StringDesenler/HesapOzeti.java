public class hesapozeti {
    public static void main(String[] args) {
        String urun1 = "Elma";
        int miktar1 = 3;
        double fiyat1 = 2.5;

        String urun2 = "Ekmek";
        int miktar2 = 2;
        double fiyat2 = 4.0;

        String urun3 = "Süt";
        int miktar3 = 1;
        double fiyat3 = 3.75;

        System.out.println("HESAP ÖZETİ");
        System.out.println("-------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Ürün", "Miktar", "Birim Fiyat", "Tutar");
        System.out.println("-------------------------------");

        double tutar1 = miktar1 * fiyat1;
        double tutar2 = miktar2 * fiyat2;
        double tutar3 = miktar3 * fiyat3;

        System.out.printf("%-10s %-10d %-10.2f %-10.2f\n", urun1, miktar1, fiyat1, tutar1);
        System.out.printf("%-10s %-10d %-10.2f %-10.2f\n", urun2, miktar2, fiyat2, tutar2);
        System.out.printf("%-10s %-10d %-10.2f %-10.2f\n", urun3, miktar3, fiyat3, tutar3);

        System.out.println("-------------------------------");

        double toplam = tutar1 + tutar2 + tutar3;
        System.out.printf("Toplam: %.2f\n", toplam);
    }
}
