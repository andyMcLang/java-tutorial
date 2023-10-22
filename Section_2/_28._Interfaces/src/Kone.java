public class Kone implements Info {
    public int id = 7;

    void start() {
        System.out.println("Kone starttas!");
    }

    @Override
    public void showInfo() {
        System.out.printf("Koneen tunnusnumero on %d\n", id);
    }
}
