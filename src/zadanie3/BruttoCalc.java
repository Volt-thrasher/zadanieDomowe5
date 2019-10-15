package zadanie3;

public class BruttoCalc {

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
        }
        double priceBrutto = product.getPriceNetto() * (1 + VAT);
        return priceBrutto;
    }


}
