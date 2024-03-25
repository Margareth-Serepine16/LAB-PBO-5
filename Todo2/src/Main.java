import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<String>();

        hewan.add("Jason");
        hewan.add("Anjing");
        hewan.add("Kucing");
        hewan.add("Monyet");
        hewan.add("Babi");
        hewan.forEach((binatang) -> System.out.println(binatang));
        }
}