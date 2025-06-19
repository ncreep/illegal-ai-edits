package ncreep.illegal_states;

import javax.annotation.Nonnull;

public class OrderProcessor {

  public CoffeeOrder process(@Nonnull CoffeeOrderDTO order) {
    var drinkType = order.drinkType() == null ? DrinkType.CAPPUCCINO : order.drinkType();

    return switch (drinkType) {
      case CAPPUCCINO -> processCappuccino(order);
      case ESPRESSO -> processEspresso(order);
      case LATTE -> processLatte(order);
      case AFFOGATO -> processAffogato(order);
      case IRISH_COFFEE -> processIrishCoffee(order);
    };
  }

  private CoffeeOrder processIrishCoffee(CoffeeOrderDTO order) {
    return new CoffeeOrder.IrishCoffee(
        order.cream() == null ? Cream.HALF_AND_HALF : order.cream(),
        order.whiskey() == null ? Whiskey.JAMESON : order.whiskey());
  }

  private CoffeeOrder processCappuccino(CoffeeOrderDTO order) {
    return new CoffeeOrder.Cappuccino(
        order.milk() == null ? Milk.SKIM : order.milk());
  }

  @SuppressWarnings("UnusedVariable")
  private CoffeeOrder processEspresso(CoffeeOrderDTO order) {
    return new CoffeeOrder.Espresso();
  }

  private CoffeeOrder processLatte(CoffeeOrderDTO order) {
    return new CoffeeOrder.Latte(
        order.milk() == null ? Milk.SKIM : order.milk());
  }

  private CoffeeOrder processAffogato(CoffeeOrderDTO order) {
    return new CoffeeOrder.Affogato(
        order.gelato() == null ? Gelato.VANILLA : order.gelato());
  }
}
