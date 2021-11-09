public class Main {
    public int gcd(int x, int y) {
        if (x < 1 || y < 1 || y > 300 || x > 300)
            return -1;
        if (x == y && x != 1)
            return 0;
        int r=0, a, b;
        a = Math.max(x, y); // a is greater number
        b = Math.min(x, y); // b is smaller number
        r = b;
        while(a % b != 0)
        {
            r = a % b;
            a = b;
            b = r;
        }
        return r == 1 ? 1 : 0;
    }
    public static void main(String[] args) {
        Main main = new Main();
        System.out.printf("" + main.gcd(13,26));
    }
}
