public class Exercise3 {
    public static void main(String[] args) {

        String inputString = "Examplqe";
        String result = "";
        int x = 0;
        while (x < inputString.length() && inputString.charAt(x) != 'q') {
            result += inputString.charAt(x);
            x++;
        }

        System.out.println("Result: " + result);
    }


}
