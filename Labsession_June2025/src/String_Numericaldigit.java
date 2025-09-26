import java.util.*;

public class String_Numericaldigit {
    public static int stringdigit(String[]words){
        int count =0;
        for(String Words : words){
            if(Words == null) continue;
            for(char ch : Words.toCharArray()){
                if(Character.isDigit(ch)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String [] words = new String[n+1];
        for(int i=0;i<n;i++){
            words[i] = sc.nextLine();
        }
        int result = stringdigit(words);
        System.out.println("No of digit in a total String :s " +result);
    }
}
