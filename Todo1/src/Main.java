public class Main {
    public static void main(String[] args) {
        Dog vodka = new Dog("Vodka", "Samoyed" , "putih", "betina", 7);
        Dog soju = new Dog("Soju", "Doberman" , "hitam", "jantan", 4);
        Dog whisky = new Dog("Whisky", "pomerania" , "cokelat", "jantan", 5);

        System.out.println("------------------------------------------------------------");
        System.out.println("Ini " + vodka.getNama() + " " + vodka.getRas() + " berwarna " + vodka.getWarna());
        vodka.bermain();
        vodka.makan();
        vodka.tidur();
        vodka.bersuara();
        System.out.println("------------------------------------------------------------");

        System.out.println("Ini " + soju.getNama() + " " + soju.getRas() + " berwarna " + soju.getWarna());
        soju.tidur();
        soju.bermain();
        soju.berlari();
        System.out.println("------------------------------------------------------------");

        System.out.println("Ini " + whisky.getNama() + " " + whisky.getRas() + " berwarna " + whisky.getWarna());
        whisky.makan();
        whisky.bersuara();
        whisky.tidur();
    }
}