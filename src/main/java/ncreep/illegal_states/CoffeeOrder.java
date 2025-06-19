package ncreep.illegal_states;

import javax.annotation.Nonnull;

public sealed interface CoffeeOrder {
  record Cappuccino(@Nonnull Milk milk) implements CoffeeOrder {
  }

  record Espresso() implements CoffeeOrder {
  }

  record Latte(@Nonnull Milk milk) implements CoffeeOrder {
  }

  record Affogato(@Nonnull Gelato gelato) implements CoffeeOrder {
  }

  record IrishCoffee(
      @Nonnull Cream cream,
      @Nonnull Whiskey whiskey) implements CoffeeOrder {
  }
}
