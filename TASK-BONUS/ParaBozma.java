public class parabozma {
    public static void main(String[] args) {
        int amount = 278;
        int[] denominations = {100, 50, 20, 5, 2, 1};
        int[] counts = new int[denominations.length];

        int remaining = amount;
        for (int i = 0; i < denominations.length; i++) {
            counts[i] = remaining / denominations[i];
            remaining = remaining % denominations[i];
        }

        // Çıktıyı istenen formatta yazdır
        System.out.print(amount + " TL = ");
        for (int i = 0; i < denominations.length; i++) {
            if (counts[i] > 0) {
                System.out.print(counts[i] + "x" + denominations[i]);
                // Son parçadan önce virgül ve boşluk ekle
                if (i < denominations.length - 1) System.out.print(", ");
            }
        }
        System.out.println();

        // Alternatif: daha okunaklı gösterim
        for (int i = 0; i < denominations.length; i++) {
            if (counts[i] > 0) {
                System.out.println(counts[i] + " adet " + denominations[i] + " TL");
            }
        }
    }
}
