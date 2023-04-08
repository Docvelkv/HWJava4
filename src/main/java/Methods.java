import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Methods {
    /**
     * Создание "двусторонней очереди"
     * Просмотр в обратном порядке
     * Удаление последнего введённого элемента
     *
     * @param print   строка для просмотра коллекции
     * @param delLast строка для удаления последнего введённого значения
     * @param stop    строка для выхода из метода
     * @return ArrayDeque<>()
     */
    public static Deque<String> workOfDeque(String print, String delLast, String stop) {
        Deque<String> arrDeq = new ArrayDeque<>();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Введите строку: ");
            String str = scan.nextLine();
            if (print.equals(str)) {
                arrDeq.forEach(x -> System.out.print(x + " "));
                System.out.println();
                continue;
            }
            if (delLast.equals(str)) {
                arrDeq.removeFirst();
                continue;
            }
            if (stop.equals(str)) {
                break;
            }
            else {
                arrDeq.addFirst(str);
            }
        }
        scan.close();
        return arrDeq;
    }
}