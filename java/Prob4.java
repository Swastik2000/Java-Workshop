public class Prob4 {
    public static void main(String[] args) {
        int i = 0;
        long prod = 0, maxpalin = 0;
        for (i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
                prod = i * j;
                if (ispalin(prod) == 1) {
                    if (maxpalin < prod)
                        maxpalin = prod;
                }
            }
        }
        System.out.println(maxpalin);
    }

    public static int ispalin(long num) {
        long temp = 0, dig = 0, nnum = 0;
        temp = num;
        while (temp != 0) {
            dig = temp % 10;
            temp = temp / 10;
            nnum = nnum * 10 + dig;
        }

        if (nnum == num)
            return 1;
        else
            return 0;

    }

}
