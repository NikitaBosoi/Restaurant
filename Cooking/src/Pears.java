import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Pears {

    int indexOfStopPosition = 0;

    Random random = new Random();

    String[] menu = {
            "Шарлотка грушевая",
            "Компот грушевый",
            "Салат из груш и лисичек",
            "Рулет с грушами",
            "Грушевое вино",
            "Груша с макаронами",
            "Грушевое масло",
            "Запеченная с трюфелем груша",
            "Грушевые сухарики",
            "Просто груша"
    };

    // цикл показывает доступные позиции + то блюдо, которое заказать нелья(в стоп листе)
    public void showMenu() {
        int stopPosition = random.nextInt(10);
        System.out.println("Сегодня у нас в меню: ");
        for (int i = 0; i < menu.length; i++) {
            if( i == stopPosition) continue;
            System.out.println(menu[i]);
        }
        System.out.println("К сожалению, сегодня мы не можем приготовить " + menu[stopPosition]);
        indexOfStopPosition = stopPosition;
    }
    int newPearsCount = 0;

    // проверка количества груш + дозаказ, если нужно

    public int checkPears(int pearsCount) {

        if (pearsCount < 5) {
            System.out.println("Пора заказать ещё груш");
            newPearsCount = pearsCount + 5;
        } else {
            System.out.println("Груш пока достаточно");
            newPearsCount = pearsCount;
        }
        return newPearsCount;
    }
    int newPearsCountAfterCooking = 0;

    // в этом методе клиент выбирает блюдо и оно готовится. Вычитается рандомное количество груш из общего количества.
    // этот метод вызывается после метода checkPears

    public int cooking(int pearsCount){
        newPearsCountAfterCooking = pearsCount;
        int position = random.nextInt(10);
        if(position == indexOfStopPosition){
            System.out.println("Извините, блюдо в стоп-листе. Выберете другое блюдо");
            position += 1;
        }
        int pearsGrabber = ThreadLocalRandom.current().nextInt(1, 4);
        System.out.println("Жора Обжоркин выбирает " + menu[position]);
        System.out.println("Кол-во груш, которое уйдет на приготовление - " + pearsGrabber);
        System.out.println("Готовим " + menu[position]);
        newPearsCountAfterCooking -= pearsGrabber;
        return newPearsCountAfterCooking;
    }
}
