import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2016;
        checkYear(year);
        System.out.println();
        int clientOS = 0;
        int currentYear = LocalDate.now().getYear();
        checkOS(clientOS, currentYear);
        System.out.println();
        int deliveryDistance = 200;
        System.out.println("Потребуется дней: "+calculateDelivery(deliveryDistance));
    }
    public static void checkYear(int year){
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void checkOS(int clientOS, int currentYear){
        boolean lightVersionYear = currentYear < 2015;
        boolean normalVersionYear = currentYear > 2015;
        boolean iOS = clientOS == 0;
        boolean android = clientOS == 1;
        if (lightVersionYear && iOS){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (lightVersionYear && android) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (normalVersionYear && android) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } else if (normalVersionYear & iOS) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        }
    }
    public static int calculateDelivery(int deliveryDistance){
        int deliveryTerm = 1;
        if (deliveryDistance >20){
            deliveryTerm++;
        }
        if (deliveryDistance >60) {
            deliveryTerm++;
            return deliveryTerm;
        }
        return deliveryTerm;
    }
}