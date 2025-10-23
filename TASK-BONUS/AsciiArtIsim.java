public class ascııisim {
    public static void main(String[] args) {
        String[] P = {
            "PPPP ",
            "P   P",
            "P   P",
            "PPPP ",
            "P    ",
            "P    ",
            "P    "
        };

        String[] E = {
            "EEEEE",
            "E    ",
            "E    ",
            "EEE  ",
            "E    ",
            "E    ",
            "EEEEE"
        };

        String[] L = {
            "L    ",
            "L    ",
            "L    ",
            "L    ",
            "L    ",
            "L    ",
            "LLLLL"
        };

        String[] I = {
            "IIIII",
            "  I  ",
            "  I  ",
            "  I  ",
            "  I  ",
            "  I  ",
            "IIIII"
        };

        String[] N = {
            "N   N",
            "NN  N",
            "N N N",
            "N  NN",
            "N   N",
            "N   N",
            "N   N"
        };

        // Satır satır tüm harfleri yan yana yazdır
        for (int row = 0; row < P.length; row++) {
            System.out.println(P[row] + "  " + E[row] + "  " + L[row] + "  " + I[row] + "  " + N[row]);
        }
    }
}
