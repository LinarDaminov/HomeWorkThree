public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Скачайте приложение по ссылке для IOS");
        }
        if (clientOS == 1) {
            System.out.println("Cкачайте приложение по ссылке для Android");
        }
        // Задача 2
        System.out.println("Задача 2");
        int clientDeviceYear = 2012;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Скачайте приложение по ссылке для IOS");}
        if (clientOS == 0 && 2015 > clientDeviceYear){
                System.out.println("Скачайте облегченную версию для Android");}
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Скачайте приложение по ссылке для Android");}
        if (clientOS == 1 && 2015 > clientDeviceYear){
            System.out.println("Скачайте облегченную версию для Android");}

        //Задача 3
        System.out.println("Задача 3");
        int year = 2020;
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
            System.out.println ( year +  " год является високосным");
        } else {
            System.out.println ( year + " год не является високосным");
        }

        // Задача 4
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance >20) {deliveryDays++;
        }
        if (deliveryDistance>60) {deliveryDays++;
        }
        System.out.println("Потребуется дней " + deliveryDays);

        // Задача 5
        System.out.println("Задача 5");
        int monthNumber=12;
        switch (monthNumber) {
            case  12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8 :
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Некорректный ввод данных");
        }
        }

    }
