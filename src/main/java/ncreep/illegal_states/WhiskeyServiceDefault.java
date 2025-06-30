package ncreep.illegal_states;

import java.util.Random;

import javax.annotation.Nullable;

public class WhiskeyServiceDefault implements WhiskeyService {

  private final WhiskeyStockService stockService;

  public WhiskeyServiceDefault(WhiskeyStockService stockService) {
    this.stockService = stockService;
  }

  @Nullable
  @Override
  public Whiskey fetchTodayDefaultWhiskey() {
    var rnd = new Random();
    var whiskies = Whiskey.values();
    var stock = stockService.fetchTodayStock();

    for (int attempts = 0; attempts < whiskies.length; attempts++) {
      var whiskey = whiskies[rnd.nextInt(whiskies.length)];
      var stockLevel = stock.get(whiskey);
      if (stockLevel != null && stockLevel > 0) {
        return whiskey;
      }
    }

    return null;
  }
}
