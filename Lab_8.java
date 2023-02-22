import java.util.*;
class exl
{

        static Scanner reader = new Scanner(System.in);
        public static void main(String[] args)
        {
            int i=0;
            while (i!=5) {
                System.out.print("Bвeди целое число = ");
                int a = reader.nextInt();
                if (a / 10 > 7) {
                    a++;
                    System.out.println("Yes");
                } else {
                    a--;
                    System.out.println("No");
                }
                System.out.println(a);
                i += 1;
            }
    }
}