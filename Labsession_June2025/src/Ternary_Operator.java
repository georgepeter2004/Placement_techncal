import java.util.*;

public class Ternary_Operator {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int m = sc.nextInt();
     int o = sc.nextInt();

     int Result = (n > m) ? ((n > o) ? n : o) : ((m > o) ? m : o);
        System.out.print("Greatest Number: " + Result);
    }
}
