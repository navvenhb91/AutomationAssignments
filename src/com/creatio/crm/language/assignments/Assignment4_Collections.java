package com.creatio.crm.language.assignments;
import java.util.*;

public class Assignment4_Collections {
    public static void main(String[] args) {
        
        List<Map<String, String>> productDetails = new ArrayList<>();

        Map<String, String> product1 = new HashMap<>();
        product1.put("ProductID", "P001");
        product1.put("Name", "Laptop");
        product1.put("Category", "Electronics");
        product1.put("Price", "$1,200");
        product1.put("StockQuantity", "50");
        product1.put("Supplier", "Tech Supplies");
        product1.put("Warranty", "2 years");
        product1.put("Rating", "4.5");
        product1.put("ManufacturingDate", "15-01-2023");
        product1.put("ExpiryDate", "15-01-2025");
        productDetails.add(product1);

        Map<String, String> product2 = new HashMap<>();
        product2.put("ProductID", "P002");
        product2.put("Name", "Desk Chair");
        product2.put("Category", "Furniture");
        product2.put("Price", "$150");
        product2.put("StockQuantity", "200");
        product2.put("Supplier", "Office Depot");
        product2.put("Warranty", "1 year");
        product2.put("Rating", "4.0");
        product2.put("ManufacturingDate", "10-02-2023");
        product2.put("ExpiryDate", "N/A");
        productDetails.add(product2);

        Map<String, String> product3 = new HashMap<>();
        product3.put("ProductID", "P003");
        product3.put("Name", "Coffee Maker");
        product3.put("Category", "Kitchen");
        product3.put("Price", "$75");
        product3.put("StockQuantity", "100");
        product3.put("Supplier", "KitchenWorld");
        product3.put("Warranty", "6 months");
        product3.put("Rating", "4.2");
        product3.put("ManufacturingDate", "20-03-2023");
        product3.put("ExpiryDate", "20-03-2024");
        productDetails.add(product3);
    }
}
