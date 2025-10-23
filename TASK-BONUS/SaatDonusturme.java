public class saatdonuşum {
    public static void main(String[] args) {
        int toplamSaniye = 3665;

        int saat = toplamSaniye / 3600;            // 1 saat = 3600 saniye
        int dakika = (toplamSaniye % 3600) / 60;   // Kalan saniyeden dakikayı bul
        int saniye = toplamSaniye % 60;            // Kalan saniyeyi bul

        // Formatlı şekilde yazdır (örnek: 1:01:05)
        System.out.printf("%d:%02d:%02d%n", saat, dakika, saniye);
    }
}

