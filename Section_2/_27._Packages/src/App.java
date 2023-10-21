import com.andymclang.ocean.Fish;

// 27. Packages
public class App {
    public static void main(String[] args) {
        Fish kala = new Fish();
        kala.name = "Hauki";
        kala.weight = 12;

        System.out.printf("Kala on %s ja sen pituus on %d", kala.name, kala.weight);
    }
}
