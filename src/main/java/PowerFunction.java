public class PowerFunction {
    public int calculator(int base, int exponent) {
        int result = 1;
        for (int limit = 1; limit <= exponent; limit++) {
            result = result * base;
        }
        return result;
    }
}
