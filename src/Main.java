public class Main {
    public static void main(String[] args) {
        //2-КЕЗЕҢ
        System.out.println("--- 2-кезең. Алғашқы жоба ---");
        System.out.println("Аты-жөні: Көбейсінов Нұрхан Алиханұлы");
        System.out.println("Тобы: Mech-3");     // Өз тобыңызды тексеріп алыңыз
        System.out.println("Мен Java бағдарламасын JVM арқылы іске қосып отырмын");
        System.out.println();
        //3-КЕЗЕҢ
        System.out.println("--- 3-кезең. Деректер типтері және операторлар ---");
        // 3.1. Деректер типтері
        String name = "Nurkhan";
        int age = 19;
        double averageScore = 87.5;
        boolean javaStudent = true;
        char group = 'A';
        System.out.println("Студент: " + name + ", Жасы: " + age + ", Орташа балы: " + averageScore + ", Java студенті: " + javaStudent + ", Топ әрпі: " + group);
        // 3.2. Арифметика
        int a = 17;
        int b = 5;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        // 3.3. Бөлуден қалған қалдық
        int number = 7;
        int remainder = number % 2;
        boolean isEven = (number % 2 == 0);
        System.out.println("7-ні 2-ге бөлгендегі қалдық: " + remainder);
        System.out.println("Сан жұп па?: " + isEven);
        System.out.println();
        //4-КЕЗЕҢ
        System.out.println("--- 4-кезең. Сатып алу чегі ---");
        String product = "Coffee";
        int quantity = 3;
        double price = 1250.0;
        double discountPercent = 10.0;
        double totalWithoutDiscount = price * quantity;
        double discountAmount = totalWithoutDiscount * (discountPercent / 100.0);
        double finalTotal = totalWithoutDiscount - discountAmount;
        System.out.println("Тауар атауы: " + product);
        System.out.println("Саны: " + quantity + " шт.");
        System.out.println("Жеңілдіксіз жалпы құны: " + totalWithoutDiscount + " тг.");
        System.out.println("Жеңілдік сомасы (" + discountPercent + "%): " + discountAmount + " тг.");
        System.out.println("Қорытынды құны: " + finalTotal + " тг.");
    }
}