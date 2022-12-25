import java.util.*;

public class Contacts {

    private Map<String, Contact> contacts = new HashMap<>();

    public void addContact(String contact) {
        String[] contactList = contact.split(" ");
        contacts.put(contactList[2], new Contact(contactList[0], contactList[1], contactList[2]));
    }

    public String getContactByNumber(String phone) {
        if (contacts.containsKey(phone)) {
            return contacts.get(phone).toString();
        }
        return "";
    }

    public void printContactList() {
        for (Map.Entry entry : contacts.entrySet()) {
            System.out.print(entry.getValue());
            System.out.println(", Номер телефона: " + entry.getKey());
        }
        System.out.println("Всего контактов в телефонной книге: " + contacts.size() + ".");
    }
}
