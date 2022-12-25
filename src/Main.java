
import java.util.*;

public class Main {

    private static void printDelim() {
        System.out.println("\n" +
                "Меню:\n" +
                "1. Добавить контакт\n" +
                "2. Вывести список контактов\n" +
                "3. Добавить пропущенный вызов\n" +
                "4. Вывести все пропущенные вызовы\n" +
                "5. Выход");
    }

    public static void main(String[] args) {

        Contacts contacts = new Contacts();
        MissedCalls missedCalls = new MissedCalls();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа: пропущенные вызовы.");

        while (true) {
            printDelim();
            String input = scanner.nextLine();
            int operation = Integer.parseInt(input);
            if (operation == 5) {
                System.out.println("Программа завершена.");
                break;
            }
            switch (operation) {
                case 1:
                    System.out.println("Введите Имя, Фамилию, Номер телефона через пробел");
                    contacts.addContact(scanner.nextLine());
                    System.out.println("Контакт добавлен");
                    break;
                case 2:
                    System.out.println("Список контактов");
                    contacts.printContactList();
                    break;
                case 3:
                    System.out.println("Добавьте номер пропущенного вызова");
                    missedCalls.addMissedCall(scanner.nextLine());
                    System.out.println("Пропущенный вызов добавлен.");
                    break;
                case 4:
                    System.out.println("Список пропущенных вызовов :");
                    missedCalls.missedCallList(contacts);
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }
    }
}
