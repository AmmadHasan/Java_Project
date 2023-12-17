import java.util.Scanner;
public class Class05 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("Calculating the Percentage of student as result");
        int sub1, sub2, sub3, sub4, sub5;

        System.out.println("Enter the marks of subject-1 : ");
        sub1 = S.nextInt();
        System.out.println("Enter the marks of subject-2 : ");
        sub2 = S.nextInt();
        System.out.println("Enter the marks of subject-3 : ");
        sub3 =  S.nextInt();
        System.out.println("Enter the marks of subject-4 : ");
        sub4 =  S.nextInt();
        System.out.println("Enter the marks of subject-5 : ");
        sub5 =  S.nextInt();

        int sum =  (sub1 + sub2 + sub3 + sub4 + sub5);
        float percentage = (sum/500.0f) * 100.0f;

        System.out.println("Your percentage is ");
        System.out.println(percentage);
    }

}

