import java.util.Scanner;

class MyThread extends Thread {
    int start, end;
    static int sum = 0;

    
    MyThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    
    static void addSum(int partialSum) {
        sum += partialSum;
    }

    
    public void run() {
        int partialSum = 0;
        for (int i = start; i <= end; i++) {
            partialSum += i;
        }
        addSum(partialSum);  
    }
}

public class prec33 {
    public static void main(String[] args) {
        int N, numThreads;
        Scanner s = new Scanner(System.in);

        
        System.out.print("Enter the number 'N': ");
        N = s.nextInt();
        System.out.print("Enter the number of threads to be used (should be less than or equal to N): ");
        numThreads = s.nextInt();

        MyThread[] threads = new MyThread[numThreads];

        
        int range = N / numThreads;
        int start = 1, end;

        for (int i = 0; i < numThreads; i++) {
            end = (i == numThreads - 1) ? N : start + range - 1; the remainder
            threads[i] = new MyThread(start, end); 
            threads[i].start();  // Start the thread
            start = end + 1;
        }

        try {
            for (int i = 0; i < numThreads; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("The sum of numbers from 1 to " + N + " is: " + MyThread.sum);
    }
}
