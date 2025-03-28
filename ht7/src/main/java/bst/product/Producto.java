package bst.product;

public class Producto implements Comparable<Producto> {
    private int sku;
    private double priceRetail;
    private double priceCurrent;
    private String productName;
    private String category;

    public Producto(int sku, double priceRetail, double priceCurrent, String productName, String category) {
        this.sku = sku;
        this.priceRetail = priceRetail;
        this.priceCurrent = priceCurrent;
        this.productName = productName;
        this.category = category;

    //setters getters
    }

    public int getSku() {
        return sku;
    } 
    public void setSku(int sku) {
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
        return Integer.compare(this.sku, otro.sku);
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + sku;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Producto other = (Producto) obj;
        return sku == other.sku;
    }

    @Override
    public String toString() {
        return productName + " - SKU: " + sku + " - Precio Retail: $" + priceRetail + " - Precio Actual: $" + priceCurrent;
    }
}
