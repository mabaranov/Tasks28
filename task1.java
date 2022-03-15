public class task1 {

    public static int factorial(int N) {
        int factorial = 1;
        for(int i=2; i<=N; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int squirrel(int N) {

        int emerald = factorial(N);

        while( (float)emerald/10 > 1) {
            emerald /= 10;
        }

        return emerald;
    }

    public static void main(String[] args) {
    }
}
