public class Main {

    static Customers customers = new Customers();
    static Pears pears = new Pears();
    static CustomersName customersName = new CustomersName();

    public static void  main(String[] args) {
        int pearsCount = 5;
        int costumersCounter = customers.generateCustomersCount();


       System.out.println("Сегодня довольно много гостей - " + costumersCounter);
       pears.showMenu();

       for(int i = 0; i < costumersCounter; i++){

            System.out.println();
            System.out.println("Осталось обслужить гостей - " + (costumersCounter - i));
            System.out.println("Обслужили гостей - " + i);
            System.out.println();

            pears.cooking(pearsCount);
            pearsCount = pears.newPearsCountAfterCooking;
            System.out.println("Количество груш - " + pearsCount);
            pears.checkPears(pearsCount);
            pearsCount = pears.newPearsCount;
            System.out.println("Количество груш - " + pearsCount);



        }
    }
}
