public class Manage implements IApp {

    @Override
    public String getCaption() {
        return "Нэмэх, Хасах";
    }

    @Override
    public void launch() {
        System.out.println("Сонгоно уу: \n 1. Нэмэх \n 2. Хасах");
        String uChoice = Main.scanner.nextLine(); // Main.java дахь scanner-ийг ашиглаж байна

        if (uChoice.equals("1")) {
            Main.db.addCard();
        } else if (uChoice.equals("2")) {
            boolean removed = Main.db.removeCard();
            if (removed) {
                System.out.println("Амжилттай устгагдлаа.");
            } else {
                System.out.println("Карт олдсонгүй.");
            }
        } else {
            System.out.println("Буруу сонголт.");
        }
    }
}