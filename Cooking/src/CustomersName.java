import java.util.Random;

public class CustomersName {

    Customers customers = new Customers();
    int personsCount = customers.generateCustomersCount();

    Random random = new Random();

    String[] firstName = {"Вася", "Олег", "Михаил", "Евгений", "Никита", "Алексей", "Кирилл", "Павел"};
    String[] lastName = {"Иванов", "Киров", "Васин", "Минаев", "Киркин", "Булкин", "Бурунов"};
    String[] arrayOfNames = new String[personsCount];


    public String NameGeneration(){
        for (int i = 0; i < personsCount; i++){
            arrayOfNames[i] = firstName[random.nextInt(firstName.length + 1)] + lastName[random.nextInt(lastName.length + 1)];
        }
        return arrayOfNames[];
    }
}
