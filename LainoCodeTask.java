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
        return (((Integer.parseInt(String.valueOf(System.nanoTime() / 1000000)) % 100) * ((int) System.nanoTime() % 10 > 0 ? 1 : -1) + 100) + ((int) (((new Object()).hashCode() * 32416190071L + 1) % 100) + 100) % 100 + 1) % 100 + 1;
    }
}
