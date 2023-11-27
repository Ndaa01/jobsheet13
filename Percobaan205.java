import java.util.Scanner;

public class Percobaan205 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilangan yang dihitung: ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = sc.nextInt();
        System.out.print("Hasil Perhitungan: ");
        for (int i = 0; i <= pangkat; i++) {
            if (i == pangkat) {
                System.out.print(bilangan);
            } else {
                System.out.print(bilangan + "x");
            }
        }
        System.out.print(" = " + hitungPangkat(bilangan, pangkat));
    }
}
