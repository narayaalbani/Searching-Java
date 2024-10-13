import java.util.Scanner;

public class BinarySearch {
    private static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                return mid + 1;
            }

            if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan angka yang telah diurutkan (pisahkan dengan koma): ");
            String input = scanner.nextLine();
            System.out.print("Masukkan angka yang ingin dicari: ");
            int x = scanner.nextInt();

            String[] numbers = input.split(",");
            int[] intArray = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                intArray[i] = Integer.parseInt(numbers[i]);
            }

            System.out.println(
                    binarySearch(intArray, x) != -1 ? "Elemen ditemukan pada urutan ke-" + binarySearch(intArray, x)
                            : "Elemen tidak ditemukan.");
        } catch (NumberFormatException e) {
            System.err.println("Format yang dimasukkan tidak sesuai!");
        }
    }
}
