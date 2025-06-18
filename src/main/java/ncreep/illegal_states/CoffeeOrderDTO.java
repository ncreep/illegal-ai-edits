package ncreep.illegal_states;

import javax.annotation.Nullable;

record CoffeeOrderDTO(
    @Nullable DrinkType drinkType,
    @Nullable Milk milk,
    @Nullable Gelato gelato,
    @Nullable Cream cream,
    @Nullable Whiskey whiskey) {
}
