import java.util.concurrent.ThreadLocalRandom;

public class Customers {

    // генерируется рандомное количество посетителей

    public int generateCustomersCount(){
        int costumersCount = ThreadLocalRandom.current().nextInt(1, 16);
        return costumersCount;
    }
}
