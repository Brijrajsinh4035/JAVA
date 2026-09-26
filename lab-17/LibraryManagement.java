import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter membership of Library");
        String str = sc.next().toLowerCase();
        Member m;
        switch (str) {
            case "student":
                m = new StudentMember();
                m.getBorrowingLimit();
                m.getLoanPeriodDays();
                break;
            case "faculty":
                m = new FacultyMember();
                m.getBorrowingLimit();
                m.getLoanPeriodDays();
                break;
            case "research":
                m = new ResearchMember();
                m.getBorrowingLimit();
                m.getLoanPeriodDays();
                break;                    
            default:
                System.out.println("enter valid member ship");
                break;
        }
    }
}

class Member{
    void getBorrowingLimit(){

    }
    void getLoanPeriodDays(){

    }
}
class StudentMember extends Member{
    void getBorrowingLimit(){
        System.out.println("2 BOOKS CAN BE BORROW");
    }
    void getLoanPeriodDays(){
        System.out.println("Borrowing Period is 2 days");
    }
}
class FacultyMember extends Member{
    void getBorrowingLimit(){
        System.out.println("5 BOOKS CAN BE BORROW");
    }
    void getLoanPeriodDays(){
        System.out.println("Borrowing Period is 5 days");
    }
}
class ResearchMember extends Member{
    void getBorrowingLimit(){
        System.out.println("8 BOOKS CAN BE BORROW");
    }
    void getLoanPeriodDays(){
        System.out.println("Borrowing Period is 10 days");
    }
}
