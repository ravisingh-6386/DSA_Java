public class LoopsExample {
    public static void main(String[] args) {
        // 1. For Loop
        // Use when you know exactly how many times you want to loop.
        System.out.println("--- For Loop ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // 2. While Loop
        // Use when you want to loop while a condition is true.
        System.out.println("\n--- While Loop ---");
        int count = 5;
        while (count > 0) {
            System.out.println("Count: " + count);
            count--;
        }

        // 3. Do-While Loop
        // Similar to while, but guarantees the code runs at least once.
        System.out.println("\n--- Do-While Loop ---");
        int num = 0;
        do {
            System.out.println("This runs at least once. Num: " + num);
            num++;
        } while (num < 0); // Condition is false, but it ran once.

        // 4. Enhanced For Loop (For-Each)
        // Best for iterating over arrays or collections.
        System.out.println("\n--- Enhanced For Loop ---");
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
