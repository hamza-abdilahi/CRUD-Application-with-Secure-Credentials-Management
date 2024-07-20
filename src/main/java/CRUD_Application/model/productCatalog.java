package CRUD_Application.model;

public class productCatalog {


    private int price;
    private int productCode;
    private String itemName ;
    private String description;
    private String category;
    private String colour;


    public productCatalog(int price, int productCode, String itemName, String description, String category, String colour) {
        this.price = price;
        this.productCode = productCode;
        this.itemName = itemName;
        this.description = description;
        this.category = category;
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "productCatalog{" +
                "price=" + price +
                ", productCode=" + productCode +
                ", itemName='" + itemName + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
