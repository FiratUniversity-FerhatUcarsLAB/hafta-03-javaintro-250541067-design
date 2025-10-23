public class boykilo {
    public static void main(String[] args) {
        double kilo = 49;
        double boy = 1.53;

        double bmi = kilo / (boy * boy);
        System.out.printf("Vücut Kitle İndeksi (BMI): %.2f%n", bmi);

        // Kategoriler
        String[] kategoriler = {"Zayıf", "Normal", "Fazla kilolu", "Obez"};

        // Matematiksel olarak indeks hesaplama (if / else yok)
        int index = (int) Math.min(3, Math.max(0, Math.floor((bmi - 18.5) / 6)));

        System.out.println("Durum: " + kategoriler[index]);
    }
}
