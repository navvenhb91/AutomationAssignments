package com.creatio.crm.language.assignments;

public class Assignment1_DataTypes {

    public static void main(String[] args) {

        // 1. Temperature of a city in degrees Celsius
    	// double temperature = 25.5;
    	// System.out.println("Temperature: " + temperature + "°C");
        float temperature = 25.5f;
        System.out.println("Temperature of a city in degrees Celsius: " + temperature);

        // 2. Whether a customer has placed an order
        boolean hasPlacedOrder = true;
        System.out.println("Has placed order: " + hasPlacedOrder);

        // 3. Person's phone number
        String phoneNumber = "123-456-7890";
        System.out.println("Person's phone number: " + phoneNumber);

        // 4. Amount of money in a customer's bank account: 1000.50
        double accountBalance = 1000.50;
        System.out.println("Amount of money in a customer's bank account:Rs." + accountBalance);

        // 5. Person's email address
        String emailAddress = "john.doe@example.com";
        System.out.println("Person's Email Address: " + emailAddress);

        // 6. Coordinates of a location (latitude, longitude)
        double latitude = 37.7749;
        double longitude = -122.4194;
        System.out.println("Coordinates: (" + latitude + ", " + longitude + ")");

        // 7. Person's marital status
        boolean isMarried = true;
        System.out.println("Person's Marital Status: " + (isMarried ? "Married" : "Unmarried"));

        // 8. Person's occupation
        String occupation = "Software Engineer";
        System.out.println("Person's occupation: " + occupation);

        // 9. Person's favourite colour
        String favouriteColour = "Blue";
        System.out.println("Person's Favourite Colour: " + favouriteColour);

        // 10. Current year
        int currentYear = 2023;
        System.out.println("Current Year: " + currentYear);

        // 11. Number of followers on a social media platform
        String followers = "1,000,000";
        System.out.println("Number of followers on a social media platform: " + followers);
        
        // 12. Rating of a movie
        double movieRating = 7.5;
        System.out.println("Movie Rating: " + movieRating + "/10");

        // 13. Person's blood type
        char bloodType = 'A';
        System.out.println("Blood Type: " + bloodType);

        // 14. Title of a book
        String bookTitle = "To Kill a Mockingbird";
        System.out.println("Title of a book: " + bookTitle);

        // 15. Number of employees in a company
        int noOfEmployees = 500;
        System.out.println("Number of Employees: " + noOfEmployees);

        // 16. Time of an event
        String eventTime = "2:30 PM";
        System.out.println("Event Time: " + eventTime);

        // 17. Name of a country
        String countryName = "United States";
        System.out.println("Country Name: " + countryName);

        // 18. Person's eye color
        String eyeColor = "Brown";
        System.out.println("Eye Color: " + eyeColor);

        // 19. Person's birthplace
        String birthplace = "New York City";
        System.out.println("Person's Birthplace: " + birthplace);

        // 20. Distance between two cities
        double distance = 200.5;
        System.out.println("Distance: " + distance + " km");
    }
}