package org.turkovaleksey.eshop.service;

import java.util.function.BiFunction;

public class Service {
    public static BiFunction<Integer, Double, Integer> needDishWeightFunction = (weight, loss) -> (int) (weight / loss);
    public static BiFunction<Integer, Double, Double> needProductWeight = (weight, procent) -> weight * procent;
}
