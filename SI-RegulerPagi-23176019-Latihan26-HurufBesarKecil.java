package pertemuan6;

/**
 *
 * @author Afra Syavina
 */
import java.util.Scanner;

public class HurufBesarKecil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();

        String hurufBesar = kalimat.toUpperCase();
        String hurufKecil = kalimat.toLowerCase();

        System.out.println("\n=====Hasil Formatting=====");
        System.out.println("Huruf Besar : " + hurufBesar);
        System.out.println("Huruf Kecil : " + hurufKecil);
    }
}

