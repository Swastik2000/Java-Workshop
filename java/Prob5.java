public class Prob5 {
    static long hcf(long i, long j) {
        while (i != j) {
            if (i > j)
                i = i - j;
            else
                j = j - i;

        }
        return i;
    }

    static long lcm(long i, long j) {
        long lcm;
        lcm = (i * j) / hcf(i, j);
        return lcm;
    }

    public static void main(String[] args) {
        long j = 1;
        for (int i = 11; i <= 20; i++) {
            j = lcm(j, i);
        }
        System.out.println(j);
    }
}
