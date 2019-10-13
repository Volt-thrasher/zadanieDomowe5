package zadanie3;

public class BruttoCalc {
    BruttoCalc() {
    }

    public double brutto(Product product) {
        double VAT = 0.0;
        switch (product.getCategory()) {
            case "Produkty zywnosciowe":
                VAT = 0.23;
                break;
            case "Maly sprzet kuchenny":
                VAT = 0.05;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + product.getCategory());
        }
        double priceBrutto = product.getPriceNetto() * (1 + VAT);
        return priceBrutto;
    }

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
