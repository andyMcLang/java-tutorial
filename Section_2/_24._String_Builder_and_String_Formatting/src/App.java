// 24. String Builder and String Formatting
public class App {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Appendoun ")
                .append("kaksipa kättä ")
                .append("hississä..");

        System.out.println(sb);

        System.out.printf("Fiil jor baadi %d, eeleveitör", 66);
        System.out.println();

        for (int i = 0; i < 19; i++) {
            System.out.printf("Number %-2d: Jes\n", i);
        }

        double num1 = 1.285;
        double num2 = 4.98732;

        double jakolaskuTulos = num2/num1;
        System.out.printf("Jakolaskutulos on siis: %.3f",jakolaskuTulos);

    }
}
