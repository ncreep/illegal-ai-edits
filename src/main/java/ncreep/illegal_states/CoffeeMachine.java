package ncreep.illegal_states;

import static ncreep.illegal_states.Util.throwNotImplemented;

import javax.annotation.Nonnull;

public class CoffeeMachine {
  public void prepare(CoffeeOrder order) {
    switch (order) {
      case CoffeeOrder.Cappuccino cappuccino -> throwNotImplemented();
      case CoffeeOrder.Espresso espresso -> throwNotImplemented();
      case CoffeeOrder.Latte latte -> throwNotImplemented();
      case CoffeeOrder.Affogato affogato -> throwNotImplemented();
      case CoffeeOrder.IrishCoffee irishCoffee -> {
        prepareIrishCoffee(
            irishCoffee.cream(),
            irishCoffee.whiskey());
      }
    }
  }

  private void prepareIrishCoffee(@Nonnull Cream cream, @Nonnull Whiskey whiskey) {
    System.out.println("Making Irish coffee with: " + cream + " cream and " + whiskey + " whiskey");
  }
}
