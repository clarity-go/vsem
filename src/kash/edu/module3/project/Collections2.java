package kash.edu.module3.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/**
  @author   Alona Kashpruk
  @project   vsem
  @class  Collections2
  @version  1.0.0 
  @since 03.04.2021 - 17.53
**/
/*              Laboratory Work No.2.

Topic: Object-oriented programming, JavaCollectionFramework
Develop a service using all your best in OOP and Java collections.
Six methods must be written.

Subjects according to the number:
5. Cafe: standard lunch and ordering.
*/

public class Collections2 {
    public static void main(String[] args) {
        List<IAccounting> listOfOrderings = new ArrayList<>(
                Arrays.asList(
                        new StandardLunch("Standard Lunch", 85, 2, 20, TypeOfOrdering.HERE_AND_NOW),
                        new StandardLunch("Standard Lunch", 85, 1, 10, TypeOfOrdering.HERE_AND_NOW),
                        new Ordering(FirstCourse.CARROT_SOUP, 0.8, 85, 1, 25, TypeOfOrdering.WITH_ME),
                        new Ordering(FirstCourse.SHRIMP_SOUP, 0.25, 78, 1, 5, TypeOfOrdering.DELIVERY),
                        new Ordering(MainCourse.CASSEROLE, 0.5, 95, 1, 10, TypeOfOrdering.HERE_AND_NOW),
                        new Ordering(Dessert.BROWNIE, 0.3, 45, 3, 15, TypeOfOrdering.DELIVERY),
                        new Ordering(Beverage.COFFEE, 0.3, 35, 1, 5, TypeOfOrdering.DELIVERY)
                )
        );

        // calculate the revenue
        double totalIncome = listOfOrderings.stream()
                .mapToDouble(IAccounting::getUltimatePrice).sum();
        System.out.println("Total income: " + totalIncome);

        // get the most expensive orders
        double expensive = listOfOrderings.stream()
                .mapToDouble(IAccounting::getUltimatePrice).max().getAsDouble();
        System.out.println("Price of the most expensive order: " + expensive);

        // get the most cheap orders
        double cheap = listOfOrderings.stream()
                .mapToDouble(IAccounting::getUltimatePrice).min().getAsDouble();
        System.out.println("Price of the cheapest order: " + cheap);

        // calculate the average sum of all orders
        double average = listOfOrderings.stream()
                .mapToDouble(IAccounting::getUltimatePrice).average().getAsDouble();
        System.out.println("Average sum of all orders: " + average);

        // calculate the average sum of only all orderings
        double averageOnlyOrderingPrice = listOfOrderings.stream()
                .filter(item -> item instanceof Ordering)
                .mapToDouble(IAccounting::getUltimatePrice).average().getAsDouble();
        System.out.println("Average price of only orderings: " +
                averageOnlyOrderingPrice);

        // calculate the average sum of only all standard lunches
        double averageOnlyStandardLunchesPrice = listOfOrderings.stream()
                .filter(item -> item instanceof StandardLunch)
                .mapToDouble(IAccounting::getUltimatePrice).average().getAsDouble();
        System.out.println("Average price of only standard lunches: " +
                averageOnlyStandardLunchesPrice);

        // calculate the total sum of only all orderings
        double totalOnlyOrderingPrice = listOfOrderings.stream()
                .filter(item -> item instanceof Ordering)
                .mapToDouble(IAccounting::getUltimatePrice).sum();
        System.out.println("Total price of only orderings: " +
                totalOnlyOrderingPrice);

        // calculate the total sum of only all standard lunches
        double totalOnlyStandardLunchesPrice = listOfOrderings.stream()
                .filter(item -> item instanceof StandardLunch)
                .mapToDouble(IAccounting::getUltimatePrice).sum();
        System.out.println("Total price of only standard lunches: " +
                totalOnlyStandardLunchesPrice);

        // find out where is the highest sum of orders (in orderings or standard lunches)
        System.out.println((totalOnlyOrderingPrice > totalOnlyStandardLunchesPrice) ?
                "→ Orderings" : "→ Standard Lunches");
        // Output: Ordering.

        // calculate the most expensive order from orderings
        double expensiveOrdering = listOfOrderings.stream()
                .filter(item -> item instanceof Ordering)
                .mapToDouble(IAccounting::getUltimatePrice).max().getAsDouble();
        System.out.println("The most expensive order (orderings): " +
                expensiveOrdering);

        // calculate the most expensive order from standard lunches
        double expensiveStandardLunch = listOfOrderings.stream()
                .filter(item -> item instanceof StandardLunch)
                .mapToDouble(IAccounting::getUltimatePrice).max().getAsDouble();
        System.out.println("The most expensive order (standard lunches): "
                + expensiveStandardLunch);

        // find out where was the most expensive order
        // (among orderings or standard lunches)
        System.out.println((expensiveOrdering > expensiveStandardLunch) ?
                "→ Orderings" : "→ Standard Lunches");
        // Output: Ordering.

    }
}
/* --------------------------- OUTPUT: ---------------------------
    Total income: 773.0

    Price of the most expensive order: 190.0
    Price of the cheapest order: 40.0

    Average sum of all orders: 110.4

    Average price of only orderings: 97.6
    Average price of only standard lunches: 142.5

    Total price of only orderings: 488.0
    Total price of only standard lunches: 285.0
    → Orderings

    The most expensive order (orderings): 150.0
    The most expensive order (standard lunches): 190.0
    → Standard Lunches
 */