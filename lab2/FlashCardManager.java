import java.util.*;

public class FlashCardManager {
    private Map<String, String> flashCards;
    private Scanner scanner;

    public FlashCardManager() {
        this.flashCards = new HashMap<>();
        this.scanner = new Scanner(System.in);
    }

    public void addCard() {
        System.out.println("Үг:");
        String term = scanner.nextLine();

        if (flashCards.containsKey(term)) {
            System.out.println("Давтагдсан.");
        } else {
            System.out.println("Тайлбар:");
            String definition = scanner.nextLine();
            flashCards.put(term, definition);
            System.out.println("Амжилттай нэмэгдлээ.");
        }
    }

    public boolean removeCard() {
        System.out.println("Устгах үгээ бичнэ үү :");
        String term = scanner.nextLine();

        if (flashCards.containsKey(term)) {
            flashCards.remove(term);
            System.out.println("Амжилттай устгагдлаа.");
            return true;
        } else {
            System.out.println("Карт олдсонгүй.");
            return false;
        }
    }

    public void ask() {
        System.out.println("Асууж эхэллээ...");
        for (Map.Entry<String, String> entry : flashCards.entrySet()) {
            System.out.println("Үг: " + entry.getKey());
            System.out.println("Утга бичнэ үү:");
            String userDefinition = scanner.nextLine();
            if (userDefinition.equalsIgnoreCase(entry.getValue())) {
                System.out.println("Зөв байна!");
            } else {
                System.out.println("Буруу. Зөв хариулт нь: " + entry.getValue());
            }
            System.out.println("Enter дарж үргэлжлүүлнэ үү...");
            scanner.nextLine();
        }
        System.out.println("Карт дууссан.");
    }

    public void displayAllCards() {
        System.out.println("Бүх карт:");
        for (Map.Entry<String, String> entry : flashCards.entrySet()) {
            System.out.println("Үг: " + entry.getKey() + ", Утга: " + entry.getValue());
        }
    }
}