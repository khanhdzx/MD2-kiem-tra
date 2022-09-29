import java.util.Scanner;

public class bai2 {
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
            System.out.println("2.In giá trị các phần tử của mảng theo ma trận");
            System.out.println("3.In giá trị các phần tử nằm trên chéo chính, chéo phụ và tính tổng ");
            System.out.println("4. Sắp xếp mảng tăng dần theo cột");
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
                    System.out.println("\n" + "In giá trị các phần tử của mảng theo ma trận là : ");
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            System.out.printf("%5d", arr[i]);
                        }
                        System.out.println("");
                    }
                    System.out.println("\n");
                    break;
            }
        } while (number != 5);
    }
}
