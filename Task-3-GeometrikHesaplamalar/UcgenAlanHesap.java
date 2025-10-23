public class UcgenAlan {
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double c = 5;

        // Yarı çevre
        double s = (a + b + c) / 2;

        // Alan (Heron formülü)
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Üçgenin alanı: " + alan);
    }
}
