import java.util.*;

public class Largest_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] words = new String[n+1];
        int c=0;
        for(int i=0;i<=n;i++){
            words[i] = sc.nextLine();

        }

        String largest_word = words[0];
        for(String Word : words){
            if(Word.length()>largest_word.length()){
                largest_word = Word;
            }
        }
        System.out.println(largest_word);
    }
}
