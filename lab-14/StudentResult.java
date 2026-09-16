import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s1 = new Student[3];
        String sub_code[] = new String[5];
        String sub[] = new String[5];
        int sub_credit[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("enter subject name");
            String name = sc.next();
            sub[i] = name;
            System.out.println("enter subject code");
            String code = sc.next();
            sub_code[i] = code;
            System.out.println("enter subject credit");
            int credit = sc.nextInt();
            sub_credit[i] = credit;
        }

        for (int i = 0; i < 3; i++) {
            s1[i] = new Student((101 + i), sub, sub_code, sub_credit);
        }
        for (int i = 0; i < 3; i++) {
            s1[i].calculateSpi(sc);
        }
    }
}

class Student {
    int id_no;
    String sub_code[] = new String[5];
    String sub[] = new String[5];
    int sub_credit[] = new int[5];
    String[] grade_obtain = new String[5];
    double spi;

    public Student(int id_no, String[] subjectList, String[] subjectCode, int[] subjectCredits) {
        this.id_no = id_no;
        for (int i = 0; i < 5; i++) {
            sub[i] = subjectList[i];
            sub_code[i] = subjectCode[i];
            sub_credit[i] = subjectCredits[i];
        }
    }

    private boolean isValidGrade(String g) {
        switch (g) {
            case "a+": case "a":
            case "b+": case "b":
            case "c+": case "c":
            case "d+": case "d":
            case "f":
                return true;
            default:
                return false;
        }
    }

    void calculateSpi(Scanner sc) {
        double totalcredit = 0;

        for (int i = 0; i < 5; i++) {
            String g;
            while (true) {
                System.out.println("Enter grade of " + sub[i] + "(" + sub_code[i] + ") for id " + id_no);
                g = sc.next().toLowerCase();
                if (isValidGrade(g)) {
                    break;
                }
                System.out.println("Invalid grade. Please enter one of: A+, A, B+, B, C+, C, D+, D, F");
            }
            grade_obtain[i] = g;
            totalcredit += sub_credit[i];
        }

        int totalscore = 0;
        for (int i = 0; i < 5; i++) {
            String str = grade_obtain[i];
            int grade = 0;
            switch (str) {
                case "a+":
                    grade = 10 * sub_credit[i];
                    break;
                case "a":
                    grade = 9 * sub_credit[i];
                    break;
                case "b+":
                    grade = 8 * sub_credit[i];
                    break;
                case "b":
                    grade = 7 * sub_credit[i];
                    break;
                case "c+":
                    grade = 6 * sub_credit[i];
                    break;
                case "c":
                    grade = 5 * sub_credit[i];
                    break;
                case "d+":
                    grade = 4 * sub_credit[i];
                    break;
                case "d":
                    grade = 3 * sub_credit[i];
                    break;
                case "f":
                    grade = 0;
                    break;
            }
            totalscore += grade;
        }

        spi = totalscore / totalcredit;
        System.out.println("spi for student_id " + id_no + " is " + spi);
    }
}