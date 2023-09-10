import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("task 1");
        printIsLeapYear(2024);
    }


    public static void printIsLeapYearResult(int year, boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.printf(" високосный %d \n", year);
        } else {
            System.out.printf(" не является високосным %d \n", year);
        }
    }

    public static void printIsLeapYear(int year) {
        boolean yearIsLeap = isLeap(year);
        printIsLeapYearResult(year, yearIsLeap);
    }

    public static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void task2() {
        System.out.println("task 2");
        chooseVersion(0, 2023);
    }

    public static void chooseVersion(int clientOS, int deviceYear) {
        boolean deviceIsOld = isDeviceOld(deviceYear);
        System.out.print("Установите ");
        if (deviceIsOld) {
            System.out.print("lite ");
        }
        System.out.print("версию для ");
        if (clientOS == 0) {
            System.out.println("iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Android по ссылке");
        } else {
            System.out.println("Неверное значение");
        }
    }

    /**
     * Метод определяет старое устройство или нет
     * @param deviceYear
     * @return
     */
    public static boolean isDeviceOld(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return deviceYear < currentYear;
    }
    public static void task3() {
        System.out.println("task 3");
        System.out.println(CalculateDeliveryDays(65));

    }

    public static String CalculateDeliveryDays(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays ++;
        } else if (deliveryDistance > 100) {
            return "Доставка невозможна.";
        }
        return "Потребуется дней:" + deliveryDays;
    }
}
