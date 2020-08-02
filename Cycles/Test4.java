//Работа с циклом for; Пользователь задаёт число и получает результат ввиде сложение от 1 до веденного числа;
import java.util.Scanner; //Подключение библиотеки для использования сканнера;
public class Test4 {

    public static void main(String[] args){

        System.out.print("Введите положительно число: ");

        Scanner sc = new Scanner(System.in); //объявление сканнера

        int x = sc.nextInt(); //чтение введенного числа из консоли; x является число, которое вводит пользователь;

        int sum = 0; //объявление переменной, в которой будет значение сложенных чисел;

        for (int i = 1; i <= x; i++) {

            sum = sum + i;
        }
            System.out.print(sum);

    }
}
