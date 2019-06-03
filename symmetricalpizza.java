import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine().replace(".", "");
        int number = Integer.parseInt(n);
        int total = 36000;
        System.out.println(total/mdc(total, number));

    }
    // Maior divisor comum
    public static int mdc (int n1, int n2){
        if ((n1 % n2 == 0 )) return n2;
        else return mdc(n2,(n1 % n2));
    }
}
