import java.util.Scanner;

public class dao_nguoc_so_nguyen_va_kiem_tra_doi_xung {
    public static void main(String[] args){
        System.out.print("Nhập số nguyên n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int original = n;
        int reverse = 0;
        while (n != 0){
            int digit = n%10;
            reverse = reverse*10 + digit;
            n = n/10;
        }
        System.out.println("số đảo ngược là: " + reverse);

        //ktra đối xứng
        if (original == reverse){
            System.out.print("có đối xứng");
        }
        else{
            System.out.print("không đối xứng");
        }
        scanner.close();
    }
}
