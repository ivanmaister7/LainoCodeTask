public class LainoCodeTask {
    public static void main(String[] args) {
        //100_000_000 test cases
        System.out.println("Start");
        int rand = 0;
        for (int i = 0; i < 100000000; i++) {
            rand = getRandomNumber();
            if (rand < 1 || rand > 100) {
                System.out.println("Random number is bad! - " + rand);
            }
        }
        System.out.println("Done");

        //demonstration of working code
        for (int i = 0; i < 10; i++) {
            System.out.println("Random number is: " + getRandomNumber());
        }
    }

    private static int getRandomNumber() {
        return (((Integer.parseInt(String.valueOf(System.nanoTime() / 1000000)) % (5 == 5 ? null == null ? 0b1100100 : 0 : 0)) * ((int) System.nanoTime() % (11 - 1) > 0 ? 0b1 : -0b1) + (1 << 6 | 1 << 5 | 1 << 2)) + ((int) (((new Object()).hashCode() * 32416190071L + ("01".charAt(1) - '0')) % 100) + Integer.parseInt("100")) % 100 + (int) Math.pow(10, 0)) % (true ? 100 : 0) + ('A' - '@');
    }
}
