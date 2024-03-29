/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak 
 *
 *
 *****************************************************************************/

public class Counter {

    private final String name;      // counter name
    private final int maxCount;    // maximum value
    private int count;             // current value

    // create a new counter with the given parameters
    public Counter(String id, int max) {
        name = id;
        maxCount = max;
        count = 0;
    }

    // increment the counter by 1

    public void increment() {
        if (count < maxCount) count++;
    }
    // return the current count

    public int value() {
        return count;
    }

    // return a string representation of this counter

    public String toString() {
        return name + ": " + count;
    }
    // compare two Counter objects based on their count

    /*public int compareTo(Counter that) {
        return Integer.compare(this.count, that.count);
    } */   // test client

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(
                args[1]);
        // create n counters
        Counter[] hits = new Counter[n];
        for (int i = 0; i < n; i++) {

            hits[i] = new

                    Counter(i + "", trials);
        }
        // increment trials counters at random
        for (int t = 0; t < trials; t++) {
            int index = StdRandom.uniform(n);
            hits[index].increment();
        }
        // print results
        for (int i = 0; i < n; i++) {
            StdOut.println(hits[i]);
        }
    }
}


