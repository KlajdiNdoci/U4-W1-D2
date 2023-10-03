public class Exercise1 {
    public static void main(String[] args) {

        System.out.println(evenOdd("ciao"));
        System.out.println(evenOdd("ciaoo"));

        System.out.println(isLeapYear(1998));
        System.out.println(isLeapYear(1996));
        System.out.println(isLeapYear(1800));
        System.out.println(isLeapYear(1600));

    }

    public static String evenOdd(String str) {
        if (str.length() % 2 == 0) {
            System.out.println("The number of letters of the string is even");
        } else {
            System.out.println("The number of letters of the string is odd");
        }
        return str;
    }

    public static boolean isLeapYear(int year) {
        boolean leapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        if (leapYear) {
            System.out.println("the year " + year + " is a leap year");
            return true;

        } else {
            System.out.println("the year " + year + " is not a leap year");
            return false;
        }

    }
}
