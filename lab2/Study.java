public class Study implements IApp {

    @Override
    public String getCaption() {
        return "Судлах";
    }

    @Override
    public void launch() {
        System.out.println("Сурж эхлэх...");
        Main.db.displayAllCards();
    }
}