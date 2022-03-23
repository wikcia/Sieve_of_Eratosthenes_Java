import java.util.ArrayList;

public class PrimeNumbers {
    ArrayList<Integer> list = new ArrayList<>();
    int[] tab;
    // constructor
    PrimeNumbers(int n) throws InvalidNumberException {

        if (n < 2) throw new InvalidNumberException();

        boolean[] prime = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) {
            // If prime[p] is not changed, then it is prime
            if (prime[p]) {
                // Update all multiples of p
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                list.add(i);
            }
        }

        tab = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            tab[i] = list.get(i);
        }
    }

    int number(int m) throws InvalidNumberException {
        if (m < 0 || m >= tab.length)
            throw new InvalidNumberException();
        return tab[m];
    }
}
/**
 tab = new int[n];

 for (int i = 2; i <= n; i++) {
 p = 0;
 for (int j = 2; j < i; j++) {
 if (i % j == 0) {
 p = 1;
 break;
 }
 }
 if (p == 0) {
 tab[counter] = i;
 counter++;
 }
 }
 tab2 = new int[counter];
 System.arraycopy(tab, 0, tab2, 0, counter);
 */