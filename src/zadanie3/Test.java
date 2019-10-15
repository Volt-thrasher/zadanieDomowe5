package zadanie3;

public class Test {
    public static void main(String[] args) {
        Product product1 = new Product("Mleko", "Produkty zywnosciowe", "Mleko 1l 0,5% tluszczu",
                1.80);
        Product product2 = new Product("Mikser", "Maly sprzet kuchenny",
                "Mikser 1300W 2 komplety zmiennych koncowek", 85);
        BruttoCalc calc1 = new BruttoCalc();
        System.out.println(calc1.brutto(product1));
        System.out.println(calc1.brutto(product2));

    }
}
