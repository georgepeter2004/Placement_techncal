import java.util.*;
public class FindLastNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int lastno = n % 10;

        System.out.println("LastNumber: "+lastno);
    }
}
