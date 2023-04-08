import java.util.Deque;

public class HomeWork {

    /**
     * Реализовать приложение, которое:
     * Принимает от пользователя и запоминает строки.
     * Если пользователь ввел print, то выводим все предыдущие строки в обратном порядке.
     * Если введено revert, то удаляем последнюю введённую строку.
     * Если введено exit, то завершаем программу.
     */
    public static void main(String[] args) {
        Deque<String> deq = Methods.workOfDeque("print", "revert", "exit");
        deq.descendingIterator().forEachRemaining(x -> System.out.print(x + " "));
    }
}