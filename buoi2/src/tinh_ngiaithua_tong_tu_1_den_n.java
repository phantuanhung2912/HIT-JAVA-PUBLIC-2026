import java.util.Scanner;

public class tinh_ngiaithua_tong_tu_1_den_n {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Nhập n: ");
        double n = scanner.nextDouble();
        double gt = 1;
        double tong = 0;
        for (int i = 1; i <= n; i++){
            gt *= i;
            if (i%2 == 0){
                tong += i;
            }
        }
        System.out.println(n + "!=" + gt);
        System.out.print("tổng số chẵn từ 1 đến " + n + ": " +  tong);
    }
}
