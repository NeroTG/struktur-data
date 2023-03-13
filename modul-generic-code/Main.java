import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilih;

        do {
            System.out.println("=== HITUNG LUAS SEGITIGA===");
            System.out.println("Mau menampilkan Luas dalam bentuk? :\n 1. untuk Hasil Integer \n 2. untuk Hasil double \n Masukkan pilihan 1 / 2 ");

            try {
                pilih = sc.nextInt();

                switch (pilih) {
                    case 1:
                        System.out.print("Masukkan Alas dan Tinggi: ");
                        int alas = sc.nextInt();
                        int tinggi = sc.nextInt();

                        Segitiga<Integer> segitigaint = new Segitiga<>(alas, tinggi);
                        System.out.println("\n Luas Segitiga Dalam Integer: " + segitigaint.getResultAsInt());
                        break;
                    case 2:
                        System.out.print("Masukkan Alas dan Tinggi: ");
                        double alasDouble = sc.nextDouble();
                        double tinggiDouble = sc.nextDouble();

                        Segitiga<Double> segitigadouble = new Segitiga<>(alasDouble, tinggiDouble);
                        System.out.println("\n Luas Segitiga Dalam Double: " + segitigadouble.getResultAsDouble());
                        break;
                    default:
                        System.out.println("Masukkan pilihan yang benar 1 atau 2:");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid, silakan masukkan angka");
                sc.nextLine();
                pilih = 0;
            }
        } while (pilih != 1 && pilih != 2);
    }
}
