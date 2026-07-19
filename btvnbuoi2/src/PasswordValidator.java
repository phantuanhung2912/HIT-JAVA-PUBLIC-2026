import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mật khẩu: ");
        String password = sc.nextLine();
        password = password.trim();

        int length = 0;
        for (int i = 0; i < password.length(); i++) {
            length++;
        }

        boolean hasNumber = false;
        boolean hasUpper = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (c >= '0' && c <= '9') {
                hasNumber = true;
            }
            if (c >= 'A' && c <= 'Z') {
                hasUpper = true;
            }
        }

        if (length >= 8 && hasUpper == true && hasNumber == true) {
            System.out.println("Mật khẩu hợp lệ!");
        }
        else {
            System.out.println("Mật khẩu không hợp lệ!");
            if (length < 8) {
                System.out.println("- Mật khẩu phải có độ dài tối tiểu 8 ký tự (Độ dài hiện tại sau khi cắt khoảng trắng: " + length + ")");
            }
            if (hasNumber == false){
                System.out.println("- Mật khẩu phải có ít nhất 1 chữ số");
            }
            if (hasUpper == false){
                System.out.println("- Mật khẩu phải có ít nhất 1 chữ cái viết hoa");
            }
        }
        sc.close();
    }
}