package bst.product;

public class Producto implements Comparable<Producto> {
    private String sku;
    private double priceRetail;
    private double priceCurrent;
    private String productName;
    private String category;

    public Producto(String sku, double priceRetail, double priceCurrent, String productName, String category) {
        this.sku = sku;
        this.priceRetail = priceRetail;
        this.priceCurrent = priceCurrent;
        this.productName = productName;
        this.category = category;

    //setters getters
    }

    public String getSku() {
        return sku;
    } 
    public void setSku(String sku) {
        this.sku = sku;
    }

    public double getPriceRetail() {
        return priceRetail;
    }
    public void setPriceRetail(double priceRetail) {
        this.priceRetail = priceRetail;
    }

    public double getPriceCurrent() {
        return priceCurrent;
    }
    public void setPriceCurrent(double priceCurrent) {
        this.priceCurrent = priceCurrent;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public int compareTo(Producto otro) {
        return this.sku.compareTo(otro.sku);
    }

    @Override
    public String toString() {
        return productName + " - SKU: " + sku + " - Precio Retail: $" + priceRetail + " - Precio Actual: $" + priceCurrent;
    }
}
