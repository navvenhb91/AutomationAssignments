package com.creatio.crm.language.assignments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Assignment5 {
    public static void main(String[] args) {
        // Task 1: Create a list of the top 5 most populated countries and print the 2nd country
        List<String> countries = Arrays.asList("China", "India", "United States", "Indonesia", "Pakistan");
        System.out.println("Second most populated country: " + countries.get(1));

        // Task 2: Create a set of the top 10 most visited tourist attractions and print its size
        Set<String> attractions = new HashSet<>(Arrays.asList(
                "Eiffel Tower", "Great Wall of China", "Taj Mahal", "Statue of Liberty", "Machu Picchu",
                "Colosseum", "Pyramids of Giza", "Christ the Redeemer", "Sydney Opera House", "Burj Khalifa"
        ));
        System.out.println("Number of tourist attractions: " + attractions.size());

        // Task 3: Create a map of the 5 largest cities in the US and their populations
        Map<String, Integer> cities = new HashMap<>();
        cities.put("New York", 8419600);
        cities.put("Los Angeles", 3980400);
        cities.put("Chicago", 2716000);
        cities.put("Houston", 2328000);
        cities.put("Phoenix", 1690000);
        System.out.println("Largest cities in the US and their populations:");
        cities.forEach((city, population) -> 
                System.out.println(city + ": " + population));

        // Task 4: Create an array of 10 random integers and print the sum of the 3rd and 5th values
        int[] randomNumbers = new Random().ints(10, 1, 101).toArray();
        System.out.println("Array of random integers: " + Arrays.toString(randomNumbers));
        int sum = randomNumbers[2] + randomNumbers[4];
        System.out.println("Sum of 3rd and 5th values: " + sum);

        // Task 5: Create a list of the top 5 highest-grossing movies and print the 3rd movie
        List<String> movies = Arrays.asList(
                "Avatar", "Avengers: Endgame", "Titanic", "Star Wars: The Force Awakens", "Avengers: Infinity War"
        );
        System.out.println("Third highest-grossing movie: " + movies.get(2));
    }
}
