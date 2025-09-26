import java.util.Scanner;

public class Letter_comparison {
    public static void main(String[] args) {
        Scanner msc = new Scanner(System.in);
        System.out.print("Enter a Letter to Compare: ");
        char n = msc.next().charAt(0);
        char m = msc.next().charAt(0);
        System.out.println(m+">"+n+" is "+(m>n));
        System.out.println(m+">="+n+" is "+(m>=n));
        System.out.println(m+">"+n+" is "+(m>n));
        System.out.println(m+"<="+n+" is "+(m<=n));
        System.out.println(m+"=="+n+" is "+(m==n));
        System.out.println(m+"!="+n+" is "+(m!=n));

        msc.close();
    }
}
