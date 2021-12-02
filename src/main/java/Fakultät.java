public class Fakultät {

    public static int Calculation(int num) {
        int zwischenergebnis = 1;
        int i = 1;
        while (num >= i) {
            zwischenergebnis = zwischenergebnis * i;
            ++i;
        }
        return zwischenergebnis;
    }
}
