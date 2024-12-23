package com.creatio.crm.language.assignments;

public class Assignment2Arrays {
    public static void main(String[] args) {
        // Define the 2D array
        String[][] products = {
            // Groceries
            {"Groceries", "Beverages", "1", "Cola"},
            {"Groceries", "Beverages", "2", "Orange Juice"},
            {"Groceries", "Beverages", "3", "Lemonade"},
            {"Groceries", "Beverages", "4", "Green Tea"},
            {"Groceries", "Beverages", "5", "Black Coffee"},
            {"Groceries", "Snacks", "1", "Popcorn"},
            {"Groceries", "Snacks", "2", "Trail Mix"},
            {"Groceries", "Snacks", "3", "Beef Jerky"},
            {"Groceries", "Snacks", "4", "Salted Nuts"},
            {"Groceries", "Snacks", "5", "Rice Cakes"},
            {"Groceries", "Dairy Products", "1", "Cottage Cheese"},
            {"Groceries", "Dairy Products", "2", "Heavy Cream"},
            {"Groceries", "Dairy Products", "3", "Ice Cream"},
            {"Groceries", "Dairy Products", "4", "Parmesan Cheese"},
            {"Groceries", "Dairy Products", "5", "Eggnog"},
            {"Groceries", "Produce", "1", "Apples"},
            {"Groceries", "Produce", "2", "Bananas"},
            {"Groceries", "Produce", "3", "Carrots"},
            {"Groceries", "Produce", "4", "Potatoes"},
            {"Groceries", "Produce", "5", "Onions"},
            // Electronics
            {"Electronics", "Phones", "1", "Smartphone"},
            {"Electronics", "Phones", "2", "Landline Phone"},
            {"Electronics", "Phones", "3", "Satellite Phone"},
            {"Electronics", "Phones", "4", "Cordless Phone"},
            {"Electronics", "Phones", "5", "Feature Phone"},
            {"Electronics", "Laptops", "1", "Gaming Laptop"},
            {"Electronics", "Laptops", "2", "Ultrabook"},
            {"Electronics", "Laptops", "3", "Notebook"},
            {"Electronics", "Laptops", "4", "Chromebook"},
            {"Electronics", "Laptops", "5", "Convertible Laptop"},
            {"Electronics", "Cameras", "1", "DSLR"},
            {"Electronics", "Cameras", "2", "Mirrorless Camera"},
            {"Electronics", "Cameras", "3", "Point-and-Shoot Camera"},
            {"Electronics", "Cameras", "4", "Action Camera"},
            {"Electronics", "Cameras", "5", "Camcorder"},
            {"Electronics", "Accessories", "1", "Charger"},
            {"Electronics", "Accessories", "2", "Headphones"},
            {"Electronics", "Accessories", "3", "Mouse"},
            {"Electronics", "Accessories", "4", "Keyboard"},
            {"Electronics", "Accessories", "5", "USB Drive"}
        };

        // Print the entire array
        System.out.println("Supermarket Products:");
        for (String[] product : products) {
            System.out.printf("%s -> %s -> ID: %s -> Name: %s%n", product[0], product[1], product[2], product[3]);
        }
    }
}
