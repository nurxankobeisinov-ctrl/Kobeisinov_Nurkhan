public class Conditions_Nurkhan {
    public static void main(String[] args) {

        System.out.println("--- 1. if / else шарты ---");
        int score = 82;
        if (score >= 90) {
            System.out.println("A");
        } else {
            System.out.println("Пока не A");
        }

        System.out.println("\n--- 2. else if тізбегі ---");
        int gradeScore = 82;
        if (gradeScore >= 90) System.out.println("Баға: A");
        else if (gradeScore >= 75) System.out.println("Баға: B");
        else if (gradeScore >= 50) System.out.println("Баға: C");
        else System.out.println("Баға: F");

        System.out.println("\n--- 3. switch операторы ---");
        String role = "USER";
        switch (role) {
            case "ADMIN":
                System.out.println("Админ панелі ашылды");
                break;
            case "USER":
                System.out.println("Профиль ашылды");
                break;
            default:
                System.out.println("Қате");
        }

        System.out.println("\n--- 4. Күрделі шарт ---");
        int testScore = 105;
        if (testScore >= 0 && testScore <= 100) {
            System.out.println("Корректно");
        } else {
            System.out.println("Ошибка");
        }
    }
}
