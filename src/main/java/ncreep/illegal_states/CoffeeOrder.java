package ncreep.illegal_states;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Invariants:
 * - For cappuccino: milk must not be null, all other nullables should be null
 * - For espresso: all nullable field should be null
 * - For latte: milk must not be null, all other nullables should be null
 * - For affogato: gelato must not be null, all other nullables should be null
 * - For Irish coffee: cream and whiskey must not be null, all other nullables
 * should be null
 */
record CoffeeOrder(
    @Nonnull DrinkType drinkType,
    @Nullable Milk milk,
    @Nullable Gelato gelato,
    @Nullable Cream cream,
    @Nullable Whiskey whiskey) {
}
