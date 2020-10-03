public class Prob6 {

    public static void main(String[] args) {
        int sum = 0, sqsum = 0, diffsum = 0, n = 100;
        sum = (n * (n + 1)) / 2;
        sqsum = (n * (n + 1) * ((2 * n) + 1)) / 6;
        diffsum = (sum * sum) - sqsum;
        System.out.println("difference of sum=" + diffsum);
    }
}
