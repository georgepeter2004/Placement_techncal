import java.util.Scanner;
public class Greatest_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int o = sc.nextInt();
        int result=Math.max(n,Math.max(m,o));
        System.out.print("Greatest No: "+ result);
    }
}

