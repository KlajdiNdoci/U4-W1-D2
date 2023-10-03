public class Exercise2 {
    public static void main(String[] args) {

        System.out.println(numbersIncluded(0));
        System.out.println(numbersIncluded(1));
        System.out.println(numbersIncluded(2));
        System.out.println(numbersIncluded(3));
        System.out.println(numbersIncluded(30));


    }

    public static String numbersIncluded(int n) {
        switch (n) {
            case 0: {
                return "zero";
            }

            case 1: {
                return "one";
            }

            case 2: {
                return "two";
            }

            case 3: {
                return "three";
            }

            default: {
                return "Should be a number between 0 and 3";
            }

        }
    }
}
