import java.util.Scanner;
public class Lab_4 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("4.15");
        System.out.println("Введите число ");
        int x=in.nextInt();
        if (x%2 ==0 ){
            System.out.println("Число четное");
        }
        else{
            System.out.println("Чисто нечетное");
        }
    }
}