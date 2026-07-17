import java.util.Scanner;

public class dientichHCN {
    public static void main(String[] args) {
        double x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh dài: ");
        x = scanner.nextDouble();
        System.out.print("Nhập cạnh rộng: ");
        y = scanner.nextDouble();
        System.out.print("Diện tích hcn: " + x * y);
    }
}
