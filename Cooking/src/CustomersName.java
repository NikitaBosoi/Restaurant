import java.util.Random;

public class CustomersName {

    Customers customers = new Customers();
    int personsCount = customers.generateCustomersCount();

    Random random = new Random();

    String[] firstName = {"Вася", "Олег", "Михаил", "Евгений", "Никита", "Алексей", "Кирилл", "Павел"};
    String[] lastName = {"Иванов", "Киров", "Васин", "Минаев", "Киркин", "Булкин", "Бурунов"};
}
