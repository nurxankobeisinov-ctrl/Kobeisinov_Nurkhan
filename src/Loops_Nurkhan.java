public class Loops_Nurkhan {
    public static void main(String[] args) {

        System.out.println("--- 1. while циклі ---");
        int n = 5;
        while (n > 0) {
            System.out.print(n + " ");
            n--;
        }
        System.out.println();

        System.out.println("\n--- 2. for циклі ---");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n--- 3. break және continue ---");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) continue; // 5-ті өткізіп жібереді
            if (i == 8) break;    // 8-ге келгенде тоқтайды
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n--- 4. Жұп сандардың қосындысы ---");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Қосынды: " + sum);
    }
}