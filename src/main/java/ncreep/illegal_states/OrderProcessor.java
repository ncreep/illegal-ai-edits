package ncreep.illegal_states;

import javax.annotation.Nonnull;

public class OrderProcessor {

  private final WhiskeyService whiskeyService;

  public OrderProcessor(WhiskeyService whiskeyService) {
    this.whiskeyService = whiskeyService;
  }

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
    return new CoffeeOrder(
        DrinkType.IRISH_COFFEE,
        null,
        null,
        order.cream() == null ? Cream.HALF_AND_HALF : order.cream(),
        order.whiskey() == null ? whiskeyService.fetchTodayDefaultWhiskey() : order.whiskey());
  }

  private CoffeeOrder processCappuccino(CoffeeOrderDTO order) {
    return new CoffeeOrder(
        DrinkType.CAPPUCCINO,
        order.milk() == null ? Milk.SKIM : order.milk(),
        null,
        null,
        null);
  }

  @SuppressWarnings("UnusedVariable")
  private CoffeeOrder processEspresso(CoffeeOrderDTO order) {
    return new CoffeeOrder(
        DrinkType.ESPRESSO,
        null,
        null,
        null,
        null);
  }

  private CoffeeOrder processLatte(CoffeeOrderDTO order) {
    return new CoffeeOrder(
        DrinkType.LATTE,
        order.milk() == null ? Milk.SKIM : order.milk(),
        null,
        null,
        null);
  }

  private CoffeeOrder processAffogato(CoffeeOrderDTO order) {
    return new CoffeeOrder(
        DrinkType.AFFOGATO,
        null,
        order.gelato() == null ? Gelato.VANILLA : order.gelato(),
        null,
        null);
  }
}
