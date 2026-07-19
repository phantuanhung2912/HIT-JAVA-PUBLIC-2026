import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        int a = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập cạnh b: ");
        int b = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập cạnh c: ");
        int c = Integer.parseInt(sc.nextLine());

        boolean check = true;
        if (a + b <= c || a + c <= b || b + c <= a || a <= 0 || b <= 0 || c <= 0){
            System.out.print("Ba cạnh đã nhập không tạo thành tam giác hợp lệ.");
            check = false;
        }
        else if(a == b && b == c){
            System.out.println("Tam giác này là tam giác đều.");
        }
        else if((a == b && b != c) || (a == c && c != b) || (b == c && c != a)){
            System.out.println("Tam giác này là tam giác cân.");
        }
        else{
            System.out.println("Tam giác này là tam giác thường.");
        }

        if (check == true){
            System.out.println("Chu vi: " + (a + b + c));
            double p = (a+b+c)/2.0;
            System.out.print("Diện tích: " + Math.sqrt(p*(p-a)*(p-b)*(p-c)));
        }
        sc.close();
    }
}
