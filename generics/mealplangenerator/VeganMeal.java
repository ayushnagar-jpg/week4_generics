package generics.mealplangenerator;


public class VeganMeal implements MealPlan {
    @Override
    public void displayMeal() {
        System.out.println("Vegan Meal: Chickpea salad with avocado dressing.");
    }
}
