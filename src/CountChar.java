import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        String quote = "I alone decide my fate";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word: ");
        char word = sc.next().charAt(0);
        int count = 0;
        int string = quote.toString().length();
        for(int i=0; i<string; i++){
            if(word == quote.charAt(i)){
                count++;
            }
        }
        System.out.println(word + " appears in quote " + count + " times");
    }
}
