public class Main {
    public static void main(String[] args) {
        int para = 278;

        int yuz = para / 100;
        para = para % 100;

        int elli = para / 50;
        para = para % 50;

        int yirmi = para / 20;
        para = para % 20;

        int on = para / 10;
        para = para % 10;

        int bes = para / 5;
        para = para % 5;

        int iki = para / 2;
        para = para % 2;

        int bir = para / 1;

        System.out.println("278 TL = "
                + yuz + "x100, "
                + elli + "x50, "
                + yirmi + "x20, "
                + bes + "x5, "
                + iki + "x2, "
                + bir + "x1");
    }
}
