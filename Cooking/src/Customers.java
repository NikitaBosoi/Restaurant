import java.util.Random;

public class Customers {

    public int generateCustomersCount(){
        Random random = new Random();
        int costumersCount = random.nextInt(16);
        return costumersCount;
    }
}
