import java.util.*;

public class Lexical_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String [] arr = new String[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextLine();
        }
        String first = arr[0];
        for(int i=1;i< arr.length;i++){
          //  if(arr[i]==null) continue;
            if(arr[i].compareTo(first)<0){
                first = arr[i];
            }
        }
        System.out.println(first);
    }
}
