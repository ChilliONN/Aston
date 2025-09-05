import java.util.*;

class Phonebook {
    private Map<String, List<String>> contacts;

    public Phonebook() {
        contacts = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        contacts.putIfAbsent(lastName, new ArrayList<>());
        contacts.get(lastName).add(phoneNumber);
    }

    public List<String> get(String lastName) {
        return contacts.getOrDefault(lastName, Collections.emptyList());
    }

    public void printAllContacts() {
        for (Map.Entry<String, List<String>> entry : contacts.entrySet()) {
            System.out.println("Фамилия: " + entry.getKey() + ", Телефоны: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        // Добавление записей
        phonebook.add("Иванов", "123-456");
        phonebook.add("Иванов", "789-012");
        phonebook.add("Петров", "345-678");
        phonebook.add("Сидоров", "901-234");

        // Получение номеров телефонов по фамилии
        System.out.println("Телефоны Иванова: " + phonebook.get("Иванов"));
        System.out.println("Телефоны Петрова: " + phonebook.get("Петров"));
        System.out.println("Телефоны Сидорова: " + phonebook.get("Сидоров"));
        System.out.println("Телефоны Смирнова: " + phonebook.get("Смирнов")); // Не существует

        // Печать всех контактов
        System.out.println("\nВсе контакты:");
        phonebook.printAllContacts();
    }
}