package ncreep.illegal_states;

public class Main {
  public static void main(String[] args) {
    var whiskeyService = new WhiskeyServiceDefault();
    var processor = new OrderProcessor(whiskeyService);
    var coffeeMaker = new CoffeeMachine();

    var dto1 = new CoffeeOrderDTO(
        DrinkType.IRISH_COFFEE, null, null, Cream.HEAVY, Whiskey.TULLAMORE);

    var dto2 = new CoffeeOrderDTO(
        DrinkType.IRISH_COFFEE, null, null, Cream.HEAVY, null);

    var order1 = processor.process(dto1);
    var order2 = processor.process(dto2);

    System.out.println(order1);
    System.out.println(order2);

    coffeeMaker.prepare(order1);
    coffeeMaker.prepare(order2);
  }
}
