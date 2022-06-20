import java.util.Random;

public class Pears {

    int indexOfStopPosition = 0;

    Random random = new Random();

    int pearsCount;
    String[] menu = {
            "Шарлотка грушевая",
            "Компот грушевый",
            "Салат из груш и лисичек",
            "Рулет с грушами",
            "Сопли бомжа",
            "Ложка ежа",
            "Потники хапыги",
            "Плюмбус",
            "Жесткое порево",
            "Мамкины люля"
    };

    public void showMenu() {
        int stopPosition = random.nextInt(3);
        for (int i = 0; i < menu.length; i++) {
            if( i == stopPosition) continue;
            System.out.println("Сегодня у нас в меню " + menu[i]);
        }
        System.out.println("К сожалению, сегодня мы не можем приготовить " + menu[stopPosition]);
        indexOfStopPosition = stopPosition;
    }
    int newPearsCount = 0;

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

    public int cooking(int pearsCount){
        newPearsCountAfterCooking = pearsCount;
        int position = random.nextInt(3);
        if(position == indexOfStopPosition){
            System.out.println("Извините, хуй сосите. Другое блюдо выберите");
            cooking(pearsCount);
        }
        int pearsGrabber = random.nextInt(4);
        System.out.println("Жора Обжоркин выбирает " + menu[position]);
        System.out.println();
        System.out.println("На это блюдо уйдет " + pearsGrabber + " груш");
        System.out.println();
        System.out.println("Готовим " + menu[position]);
        newPearsCountAfterCooking -= pearsGrabber;
        return newPearsCountAfterCooking;
    }
}
