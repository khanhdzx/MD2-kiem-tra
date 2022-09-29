import java.util.Scanner;

public class bai1 {
    private static int i;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Nhập vào số  phần tử vào mảng :");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        do {
            System.out.println("\n" + "*******************MENU*******************");
            System.out.println("1.Hiển thị giá trị các phần tử mảng");
            System.out.println("2.In giá trị các phần tử là số nguyên tố trong mảng");
            System.out.println("3.In giá trị max, min các phần tử trong mảng ");
            System.out.println("4. Sắp xếp mảng giảm dần");
            System.out.println("5.Thoát");
            System.out.println("Lựa chọn của bạn");
            number = scanner.nextInt();

            switch (number) {
                case 1:
                    System.out.println("Mảng vừa nhập là :");
                    for (int i = 0; i < size; i++) {
                        System.out.print(" " + arr[i]);
                    }
                    break;
                case 2:
                    System.out.println("\n " + "số nguyên tố trong mảng là :");
                    for (int i = 0; i < arr.length; i++) {
                        if (checkSoNguyenTo(i) == 0) {
                            System.out.printf("%d, ", i);
                        }
                    }
                    break;
                case 3:
                    int min = arr[0], max = arr[0];
                    for (int k : arr) {
                        if (k < min) {
                            min = k;
                        }
                        if (k > max) {
                            max = k;
                        }
                    }
                    System.out.printf("\nPhần tử nhỏ nhất của mảng là: %d\n", min);
                    System.out.printf("Phần tử lớn nhất của mảng là: %d\n", max);
                    System.out.println("\n");
                    break;
                case 4:

                    System.out.print("\nMảng sau khi sắp xếp là: ");
                    for (int i = 0; i < arr.length - 1; i++) {
                        for (int j = i + 1; j < arr.length; j++) {
                            if (arr[i] < arr[j]) {
                                int x = arr[i];
                                arr[i] = arr[j];
                                arr[j] = x;
                            }
                        }
                    }
                    for (int j : arr) {
                        System.out.printf("%5d", j);
                    }
                    System.out.println("\n");
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Mời nhập lại (1-6)");
                    System.out.println("");
            }
        } while (number != 5);

    }
    public static int checkSoNguyenTo(int n) {
        int k = 0;
        if (n < 2) {
            k = 1;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                k = 1;
            }
        }
        return k;
    }
}