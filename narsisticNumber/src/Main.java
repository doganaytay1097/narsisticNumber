// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println(NumberUtils.isNarcissistic(153));
    }
}

class NumberUtils {

    public static boolean isNarcissistic(int number) {
        int i = 0;
        int a = 0;
        int x = number;
        int y = number;
        for (; x > 0; i++) {
           x = x/10;
        }
        for (int j = 0;y>0;){
            a = (int) (a + (Math.pow((y%10),i)));
            y = y/10;
        }
        if (a == number) return true;
        else return false;

    }

}