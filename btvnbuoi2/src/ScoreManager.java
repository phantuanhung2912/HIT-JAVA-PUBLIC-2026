import java.util.Scanner;

public class ScoreManager {
    static double findMax(double[] arr){
        double max = arr[0];
        for (double x : arr){
            if (x >= max){
                max = x;
            }
        }
        return max;
    }

    static double calculateAverage(double[] arr){
        double sum = 0;
        int count = 0;
        for (double x : arr){
            sum += x;
            count++;
        }
        return sum/count;
    }

    static double countFailedStudents(double[] arr){
        int count = 0;
        for (double x : arr){
            if (x < 5.0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng học sinh: ");
        int n;
        do {
            n = Integer.parseInt(sc.nextLine());
            if (n <= 0){
                System.out.println("Số học sinh không hợp lệ, nhập lại!");
            }
        }
        while (n <= 0);
        double[] scores = new double[n];
        System.out.println("Nhập điểm: ");
        boolean check = true;
        do {
            for (int i = 0; i < n; i++) {
                System.out.print("Học sinh " + (i + 1) + ": ");
                scores[i] = Double.parseDouble(sc.nextLine());
                if (scores[i] < 0.0 || scores[i] > 10.0){
                    System.out.println("Điểm không hợp lệ, nhập lại!");
                    check = false;
                    break;
                }
            }
        }
        while (check == false);
        System.out.println("Điểm cao nhất: " + findMax(scores));
        System.out.println("Điểm trung bình cả lớp: " + calculateAverage(scores));
        System.out.println("Số học sinh có điểm dưới trung bình: " + countFailedStudents(scores));
        sc.close();
    }
}
