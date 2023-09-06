// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner scn = new Scanner(System.in);

        System.out.println("пожалуста введите целое число: ");
        float felm = scn.nextFloat();

        if(Math.floor(felm) == felm){
            System.out.println("True");
            for(int i = 0; i <= felm; i++){
                System.out.println(i);
            }
        } else{
            System.out.println("False");
        }
    }
}