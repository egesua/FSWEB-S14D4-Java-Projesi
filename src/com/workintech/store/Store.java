package com.workintech.store;

import com.workintech.product.Bread;
import com.workintech.product.Chocolate;
import com.workintech.product.Coke;
import com.workintech.product.ProductForSale;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] sales = new ProductForSale[5];
        sales[0] = new Chocolate("Sweet", 20, "...","Brown", true);
        sales[1] = new Bread("Bakery", 10, "Siyez Unu", "einkorn", "Brown");
        sales[2] = new Coke("Drinks", 15, "Soguk iciniz.", true, 1);

        listProducts(sales);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product: products){
            product.showDetails();
        }
    }
}