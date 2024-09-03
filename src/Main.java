import javax.print.StreamPrintServiceFactory;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача №1
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();

        if (num % 2 == 0){
            System.out.println("Число чётное.");
        }
        else {
            System.out.println("Число нечётное.");
        }

        }
    }