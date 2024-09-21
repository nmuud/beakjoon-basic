package step06;

import java.util.Scanner;

public class n_25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 전공평점 계산에 필요한 변수
        double totalGradePoints = 0.0;
        double totalCredits = 0.0;

        // 등급별 성적 점수 매핑
        for (int i = 0; i < 20; i++) {
            String subject = sc.next();
            double credits = sc.nextDouble();
            String grade = sc.next();

            // P는 계산에서 제외
            if (grade.equals("P")) {
                continue;
            }

            double gradePoint = 0.0;
            switch (grade) {
                case "A+":
                    gradePoint = 4.5;
                    break;
                case "A0":
                    gradePoint = 4.0;
                    break;
                case "B+":
                    gradePoint = 3.5;
                    break;
                case "B0":
                    gradePoint = 3.0;
                    break;
                case "C+":
                    gradePoint = 2.5;
                    break;

                case "C0":
                    gradePoint = 2.0;
                    break;
                case "D+":
                    gradePoint = 1.5;
                    break;
                case "D0":
                    gradePoint = 1.0
                    ;
                    break;
                case "F":
                    gradePoint = 0.0;
                    break;
            }

            totalGradePoints += credits * gradePoint;
            totalCredits += credits;
        }

        // 전공평점 계산
        double majorGPA = totalGradePoints / totalCredits;

        System.out.printf("%.6f\n", majorGPA);
    }
}
