import java.util.Scanner;

class Student{
    int id_no;
    int no_of_subjects_registered;
    String[] subject_code;
    int[] subject_credits;
    char[] grade_obtained;
    double spi;

    Student(int id_no, int n){
        this.id_no = id_no;
        this.no_of_subjects_registered = n;

        subject_code = new String[n];
        subject_credits = new int[n];
        grade_obtained = new char[n];
    }

    void calculate_spi(){
        int totalCredits = 0;
        int totalPoints = 0;

        for(int i=0 ; i<no_of_subjects_registered ; i++){
            int gradePoint = 0;

            switch (grade_obtained[i]) {
                case 'A':
                    gradePoint = 10;
                    break;
                case 'B':
                    gradePoint = 8;
                    break;
                case 'C':
                    gradePoint = 6;
                    break;
                case 'D':
                    gradePoint = 4;
                    break;
                case 'F':
                    gradePoint = 0;
                    break;
            }

            totalCredits += subject_credits[i];
            totalPoints += gradePoint * subject_credits[i];
        }

        spi = (double)totalPoints/totalCredits;
    }

    void display(){
        System.out.println("\nStudent ID : " + id_no);
        System.out.println("SPI : " + spi);
    }
}

public class P1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        for(int i=0 ; i<n ; i++){

            System.out.print("\nEnter Student ID: ");
            int id = sc.nextInt();

            System.out.print("Enter number of subjects: ");
            int sub = sc.nextInt();

            s[i] = new Student(id, sub);

            for(int j=0 ; j<sub ; j++){
                System.out.print("Enter Subject Code: ");
                s[i].subject_code[j] = sc.next();

                System.out.print("Enter Subject Credit: ");
                s[i].subject_credits[j] = sc.nextInt();

                System.out.print("Enter Grade (A/B/C/D/F): ");
                s[i].grade_obtained[j] = sc.next().charAt(0);
            }

            s[i].calculate_spi();
        }

        System.out.println("\n----- Student Details -----");
        for (int i=0 ; i<n ; i++){
            s[i].display();
        }
    }
}