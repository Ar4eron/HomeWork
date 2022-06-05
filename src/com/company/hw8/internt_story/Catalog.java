package com.company.hw8.internt_story;

/**
 * Catalog - каталогог продукції
 * productTitle - назва продукції
 * quantityOfProducts - кількісь продукції
 * productEvaluation - оцінка продукції
 * numberProduct - номер продукту
 */
public class Catalog {
    private String productTitle;
    private int quantityOfProducts;
    private int productEvaluation;
    private int numberProduct;

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public int getQuantityOfProducts() {
        return quantityOfProducts;
    }

    public void setQuantityOfProducts(int quantityOfProducts) {
        this.quantityOfProducts = quantityOfProducts;
    }

    public int getProductEvaluation() {
        return productEvaluation;
    }

    public void setProductEvaluation(int productEvaluation) {
        this.productEvaluation = productEvaluation;
    }

    public int getNumberProduct() {
        return numberProduct;
    }

    public void setNumberProduct(int numberProduct) {
        this.numberProduct = numberProduct;
    }
}
