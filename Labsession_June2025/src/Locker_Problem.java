import java.util.*;

public class Locker_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Students=sc.nextInt();
        int count=0;
        int i=2;
        int n=0;
        while(n<=Students){
            count++;
            n=i*i;
            i++;
        }
        System.out.println(count);
        System.out.println(Students-count);
    }
}