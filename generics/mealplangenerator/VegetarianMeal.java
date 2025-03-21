package generics.mealplangenerator;

public class VegetarianMeal implements MealPlan {
    @Override
    public void displayMeal() {
        System.out.println("Vegetarian Meal: Grilled vegetables with quinoa.");
    }
}
