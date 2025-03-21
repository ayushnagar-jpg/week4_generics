package generics.mealplangenerator;

import generics.mealplangenerator.MealPlan;


@SuppressWarnings("unused")
public class Meal<T extends MealPlan> {
    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public void generateMealPlan() {
        System.out.println("Generating meal plan...");
        mealPlan.displayMeal();
    }
}
