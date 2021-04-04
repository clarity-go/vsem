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
        System.out.println(totalIncome); // 773.0

        // get the most expensive orders
        OptionalDouble expensive = listOfOrderings.stream()
                .mapToDouble(IAccounting::getUltimatePrice).max();
        System.out.println(expensive); // 190.0

        // get the most cheap orders
        OptionalDouble cheap = listOfOrderings.stream()
                .mapToDouble(IAccounting::getUltimatePrice).min();
        System.out.println(cheap); // 40.0

        // calculate the average sum of all orders
        OptionalDouble average = listOfOrderings.stream()
                .mapToDouble(IAccounting::getUltimatePrice).average();
        System.out.println(average); // 110.4

        // calculate the average sum of only all orderings
        OptionalDouble averageOnlyOrderingPrice = listOfOrderings.stream()
                .filter(item -> item instanceof Ordering)
                .mapToDouble(IAccounting::getUltimatePrice).average();
        System.out.println("Average price of only orderings: " +
                averageOnlyOrderingPrice); // 97.6

        // calculate the average sum of only all standard lunches
        OptionalDouble averageOnlyStandardLunchesPrice = listOfOrderings.stream()
                .filter(item -> item instanceof StandardLunch)
                .mapToDouble(IAccounting::getUltimatePrice).average();
        System.out.println("Average price of only standard lunches: " +
                averageOnlyStandardLunchesPrice); // 142.5

        // calculate the most expensive order from orderings
        OptionalDouble expensiveOrdering = listOfOrderings.stream()
                .filter(item -> item instanceof Ordering)
                .mapToDouble(IAccounting::getUltimatePrice).max();
        System.out.println(expensiveOrdering); // 150.0

        // calculate the most expensive order from standard lunches
        OptionalDouble expensiveStandardLunch = listOfOrderings.stream()
                .filter(item -> item instanceof StandardLunch)
                .mapToDouble(IAccounting::getUltimatePrice).max();
        System.out.println(expensiveStandardLunch); // 190.0

    }
}
