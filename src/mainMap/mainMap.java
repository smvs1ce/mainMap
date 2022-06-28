package mainMap;
//Importing required classes
import java.util.*;  //Map, ArrayList
import java.util.Scanner;  // Take user input

public class mainMap
{

	public static void main(String[] args) {
		
        // Question 1
        // Java Program to Demonstrate
        // Working of Map interface
        // Write a program that does the following:
        // Asks the user for 5 numbers
        // Stores them in an array list
        // Finds the sum, product, largest, and smallest of those numbers
        ////////////////////////////////////////////////////
    	
        ArrayList<Integer> numbers = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        
        Integer theSum = 0;
        Integer theProduct = 1;
        
        for (int i = 0; i < 5; i++)
        {
            // Take input
            int number = scanner.nextInt();
            
            // Add to array
            numbers.add(number);
            
            // Calculate sum and product
            theSum = theSum + number;
            theProduct = theProduct * number;
            
        }

        // The min and max
        Integer maxNumber = Collections.max(numbers);
        Integer minNumber = Collections.min(numbers);
        
        // Output the max and min
        System.out.println("The max is " + maxNumber);
        System.out.println("The min is " + minNumber);
        // Output the sum and product
        System.out.println("The sum is " + theSum);
        System.out.println("The product is " + theProduct);
        
        ////////////////////////////////////////////////////
        // Question 2
        // You are a car dealer. Create a hash map of vehicles.
        // The model is the Key, the make is the Value.
        // Ask the customer what car (model) they are looking for. 
        // Use the Hash Map to determine if you have that vehicle, and what make it is.
        // (e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")
        // Submit to your GitHub and provide a link to your repository 
        ////////////////////////////////////////////////////
        
        
        // Car Dealership Problem
        // Map interface can be HashMap, Hastable, TreeMap, ConcurrentMap, LinkedHashMap, ..
		Map<String, String> carMaps = new HashMap<>();
        carMaps.put("Civic", "Honda");
        carMaps.put("Accord", "Honda");
        carMaps.put("Corolla", "Toyota");
        carMaps.put("350i", "Mercedez");
        carMaps.put("7series", "BMW");
        
        // Create a scanner
        Scanner scanner2 = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter the Car Model: ");
        String inputModel = scanner2.nextLine();
        
       
        
        for (String elem : carMaps.keySet())
        {
            if (elem.equals(inputModel))
            {
                System.out.println("The car model " + inputModel + " is made by " + carMaps.get(elem));
            }
        }
        
        
	}
}
