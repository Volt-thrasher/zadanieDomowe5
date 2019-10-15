package zadanie3;

public class Product {
    private String name;
    private String category;
    private String description;
    private double priceNetto;

    Product() {
    }

    Product(String name, String category, String description, double netto) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.priceNetto = netto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPriceNetto() {
        return priceNetto;
    }

    public void setPriceNetto(double priceNetto) {
        this.priceNetto = priceNetto;
    }

}
