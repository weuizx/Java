package org.example;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public interface MyComparator<T>{

    default boolean equals(T obj) {
        return false;
    }

    default MyComparator reversed() {
        return ;
    }


    default MyComparator thenComparing(MyComparator other) {
        return ;
    }


    default MyComparator thenComparing(Function keyExtractor, MyComparator keyComparator) {
        return ;
    }


    default MyComparator thenComparing(Function keyExtractor) {
        return ;
    }


    default MyComparator thenComparingInt(ToIntFunction keyExtractor) {
        return ;
    }


    default MyComparator thenComparingLong(ToLongFunction keyExtractor) {
        return ;
    }


    default MyComparator thenComparingDouble(ToDoubleFunction keyExtractor) {
        return ;
    }
}
