import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();

        if(num > 50){
            System.out.println("above 50");
        } else if (num >=40 && num <= 50) {
            System.out.println("between 40 to 50");
        }
        else {
            System.out.println("below 40");
        }
    }
}