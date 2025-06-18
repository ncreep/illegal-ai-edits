package ncreep.illegal_states;

import static ncreep.illegal_states.Util.throwNotImplemented;

import javax.annotation.Nonnull;

public class CoffeeMachine {
  public void prepare(CoffeeOrder order) {
    switch (order.drinkType()) {
      case CAPPUCCINO -> throwNotImplemented();
      case ESPRESSO -> throwNotImplemented();
      case LATTE -> throwNotImplemented();
      case AFFOGATO -> throwNotImplemented();
      case IRISH_COFFEE -> {
        // This is SAFE
        // Irish coffee ALWAYS has cream and whiskey
        if (order.cream() == null)
          throw new IllegalStateException("No cream");
        if (order.whiskey() == null)
          throw new IllegalStateException("No whiskey");

        prepareIrishCoffee(
            order.cream(),
            order.whiskey());
      }
    }
  }

  private void prepareIrishCoffee(@Nonnull Cream cream, @Nonnull Whiskey whiskey) {
    System.out.println("Making Irish coffee with: " + cream + " cream and " + whiskey + " whiskey");
  }
}
