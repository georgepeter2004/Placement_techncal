import java.util.*;
public class BiggestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n>m){
            System.out.println("Biggest Number: "+n);
        }
        else{
            System.out.println("Biggest Number: "+m);
        }
        sc.close();
    }
}
