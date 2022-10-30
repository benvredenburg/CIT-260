import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner keyboard = new Scanner(System.in);

//        for (int i = 0; i < 10; i++)
//        {
//            System.out.println(i);
//        }
//        int i = 0;
//        while (i < 10)
//        {
//            System.out.println(i);
//            i++;
//        }
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<10);
//        int loopCount = 0;
//        for (double i = 40; loopCount < 10; i--){
//            System.out.println(i);
//            loopCount++;
//        }

//    String s1 = new String("Welcome to Java!");
//    String s2 = new String("Welcome to Java!");
//
//    if (s1 == s2)
//        System.out.println("s1 and s2 have the same contents");
//    else
//        System.out.println("s1 and s2 have different contents");

        nPrint('a', 4);

        static void nPrint(String message, int n) {
            while (n > 0) {
                System.out.print(message);
                n--;
            }
        }

}}
