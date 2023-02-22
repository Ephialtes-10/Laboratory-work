import java.util.Scanner;
public class Lab_7 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("7.7");
        System.out.print("Введите количество мест: ");
        int x=in.nextInt();
        System.out.print("Введите количество студентов: ");
        int b=in.nextInt();
        int nehvatka=0;
        int mnogo=0;
        if (x==b){
            System.out.print("Студентов ровно столько же, сколько мест ");
        }
        if (x>b){
            mnogo=x-b;
            System.out.print("Мест оказалось больше студентов.Количество свободных мест: ");
            System.out.print(mnogo);
        }
        if (x<b){
            nehvatka=b-x;
            System.out.print("Количество студентов,которым не досталось мест: ");
            System.out.print(nehvatka);
        }
    }
}
