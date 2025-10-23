public class Milkmtablosu {
    public static void main(String[] args) {
        double cevirimOrani = 1.609; // 1 mil = 1.609 km

        // Tablo başlığı
        System.out.printf("%-6s %-10s\n", "Mil", "Kilometre");
        System.out.println("-------------------");

        // Değerler
        System.out.printf("%-6d %-10.3f\n", 1, 1 * cevirimOrani);
        System.out.printf("%-6d %-10.3f\n", 5, 5 * cevirimOrani);
        System.out.printf("%-6d %-10.3f\n", 10, 10 * cevirimOrani);
        System.out.printf("%-6d %-10.3f\n", 20, 20 * cevirimOrani);
        System.out.printf("%-6d %-10.3f\n", 50, 50 * cevirimOrani);
    }
}
