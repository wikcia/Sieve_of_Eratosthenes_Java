public class Test {
    public static void main(String[] args) {
        int n, k;
        try {
            n = Integer.parseInt(args[0]);
            PrimeNumbers prime = new PrimeNumbers(n);
            for(int i = 1; i < args.length; i++) {
                try {
                    k = Integer.parseInt(args[i]);
                    System.out.println(args[i] + " - " + prime.number(k));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid data");
                } catch (InvalidNumberException e) {
                    System.out.println("Number out of range");
                }
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid data");
        } catch (InvalidNumberException e) {
            System.out.println("Number out of range");
        }
    }
}

