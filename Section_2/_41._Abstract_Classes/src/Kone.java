public abstract class Kone {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void kaynnista();
    public abstract void teeJuttuja();
    public abstract void sammuta();

    public void aja() {
        kaynnista();
        teeJuttuja();
        sammuta();
    }
}