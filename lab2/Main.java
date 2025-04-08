import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner;
    public static FlashCardManager db;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        db = new FlashCardManager();

        List<IApp> apps = new ArrayList<>();
        apps.add(new Manage());
        apps.add(new Play());
        apps.add(new Study());

        boolean programOn = true;
        IApp currentApp = null;

        while (programOn) {
            System.out.println("Сонгоно уу?:");
            for (int i = 0; i < apps.size(); i++) {
                System.out.println((i + 1) + ". " + apps.get(i).getCaption());
            }
            System.out.println((apps.size() + 1) + ". Гарах");

            String uChoice = scanner.nextLine();

            int choice = Integer.parseInt(uChoice);
            if (choice >= 1 && choice <= apps.size()) {
                currentApp = apps.get(choice - 1);
            } else if (choice == apps.size() + 1) {
                programOn = false;
            } else {
                System.out.println("Буруу сонголт!");
                continue;
            }

            if (currentApp != null) {
                System.out.println(currentApp.getCaption());
                currentApp.launch();
            }
        }

        scanner.close();
    }
}