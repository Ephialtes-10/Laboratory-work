import java.util.Scanner;
public class Lab_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        int ymn=0;
        System.out.println("6.8");
        System.out.println("Введите первое число ");
        int a = in.nextInt();
        System.out.println("Введите второе число ");
        int b = in.nextInt();
        if (a == b) {
            System.out.print("Числа равны");
        }
        if (a > b) {
            sum= a+b;
            System.out.print("Сумма равна: ");
            System.out.print(sum);
        }
        if (a<b) {
            ymn=a*b;
            System.out.print("Произведение равно: ");
            System.out.print(ymn);
        }
    }
}