public class Main {

    public static void calculationLeapYear (int year) {  //task 1
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        if (isLeapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void main(String[] args) {
        calculationLeapYear(2021);

    }
}