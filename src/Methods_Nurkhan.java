public class Methods_Nurkhan {
    public static void main(String[] args) {

        System.out.println("--- Методтарды шақыру ---");

        int result = square(7);
        System.out.println("7-нің квадраты: " + result);

        greet("Нұрхан");

        System.out.println("17 жас: " + isAdult(17));
        System.out.println("18 жас: " + isAdult(18));
    }

    // Методтар main-нің сыртында жазылады
    static int square(int x) {
        return x * x;
    }

    static void greet(String name) {
        System.out.println("Сәлем, " + name + "!");
    }

    static boolean isAdult(int age) {
        return age >= 18;
    }
}