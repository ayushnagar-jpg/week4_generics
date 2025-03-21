package generics.mealplangenerator;

import java.util.Scanner;

//Main
public class MealPlanGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a meal plan: ");
        System.out.println("1. Vegetarian");
        System.out.println("2. Vegan");
        System.out.println("3. Keto");
        System.out.println("4. High Protein");
        
        int choice = scanner.nextInt();
        
        Meal<? extends MealPlan> meal = null;

        switch (choice) {
            case 1:
                meal = new Meal<>(new VegetarianMeal());
                break;
            case 2:
                meal = new Meal<>(new VeganMeal());
                break;
            case 3:
                meal = new Meal<>(new KetoMeal());
                break;
            case 4:
                meal = new Meal<>(new HighProteinMeal());
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                scanner.close();
                return;
        }

        meal.generateMealPlan();
        scanner.close();
    }
}
