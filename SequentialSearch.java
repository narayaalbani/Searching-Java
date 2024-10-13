import java.util.Scanner;

public class SequentialSearch {
    public static int sequentialSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return ++i;
        }
        return -1;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan angka (pisahkan dengan koma): ");
            String input = scanner.nextLine();
            System.out.print("Masukkan angka yang ingin dicari: ");
            int x = scanner.nextInt();

            String[] numbers = input.split(",");
            int[] intArray = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                intArray[i] = Integer.parseInt(numbers[i]);
            }

            int result = sequentialSearch(intArray, x);
            System.out.println(
                    result != -1 ? "Elemen ditemukan pada urutan ke-" + result : "Elemen tidak ditemukan.");
        } catch (NumberFormatException e) {
            System.err.println("Format yang dimasukkan tidak sesuai!");
        }
    }
}