import java.util.Scanner;

public class EmployeeInfoStandardizer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập thông tin: ");
        String in4 = sc.nextLine();

        String[] parts = in4.trim().split("-");
        if (parts.length < 4){
            System.out.print("Thông tin ko hợp lệ!");
            return;
        }
        String code = parts[0].trim();
        String name = parts[1].trim();
        String yearBirth = parts[2].trim();
        String department = parts[3].trim();

        String[] nameEdit = name.split(" ");
        String[] nameEdited = new String[nameEdit.length];
        for (int i = 0; i < nameEdit.length; i++) {
            String firstChar = nameEdit[i].substring(0,1).toUpperCase();
            String remaining = nameEdit[i].substring(1).toLowerCase();
            nameEdited[i] = firstChar + remaining;
        }

        if (department.toLowerCase().contains("kỹ thuật") || department.toLowerCase().contains("ky thuat")){
            System.out.println("Nhân viên kỹ thuật");
        }
        else{
            System.out.println("Nhân viên nghiệp vụ");
        }

        int age = 2026 - Integer.parseInt(yearBirth);

        System.out.print("Mã nhân viên: " + code + " | Họ và tên: ");
        for (String x : nameEdited){
            System.out.print(x);
            System.out.print(" ");
        }
        System.out.print(" | Tuổi: " + age + " | Bộ phận: ");
        if (department.toLowerCase().contains("kỹ thuật") || department.toLowerCase().contains("ky thuat")){
            System.out.println("Phòng kỹ thuật");
        }
        else{
            System.out.println("Nghiệp vụ");
        }
        sc.close();
    }
}
