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
        boolean flag = true;
        while (flag) {
            System.out.print("Введите строку: ");
            String str = scan.nextLine();
            if (str.equals(print)) {
                arrDeq.forEach(x -> System.out.print(x + " "));
                System.out.println();
            }
            if (str.equals(delLast)) {
                arrDeq.removeFirst();
            }
            if (str.equals(stop)) {
                flag = false;
            }
            else {
                arrDeq.addFirst(str);
            }
        }
        scan.close();
        return arrDeq;
    }
}