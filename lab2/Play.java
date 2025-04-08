public class Play implements IApp {

    @Override
    public String getCaption() {
        return "Тоглох";
    }

    @Override
    public void launch() {
        System.out.println("1. Тоглож эхлэх");
        String uChoice = Main.scanner.nextLine(); // Main.java дахь scanner-ийг ашиглаж байна

        if (uChoice.equals("1")) {
            Main.db.ask();
        } else {
            System.out.println("Буруу сонголт");
        }   
    }
}