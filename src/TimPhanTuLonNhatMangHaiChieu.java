import java.util.Scanner;

public class TimPhanTuLonNhatMangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row;
        int col;

        do {
            System.out.println("Nhap Row = ");
            row = scanner.nextInt();
            System.out.println("Nhap col = ");
            col = scanner.nextInt();
        } while (row < 0 || col < 0);
        int[][] array = new int[row][col];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhap phan tu hang " + (i + 1) + " cot thu " + (j + 1));
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhap phan tu hang " + (i + 1) + " cot thu " + (j + 1) + " = " + array[i][j]);
            }
        }
        int max=array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(max<array[i][j])
                {
                    max=array[i][j];
                }
            }
        }
        System.out.println("So lon nhat = "+max);
    }
}

