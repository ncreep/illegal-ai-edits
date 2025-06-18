package ncreep.illegal_states;

import java.util.Map;
import java.util.Random;

import javax.annotation.Nonnull;

class WhiskeyStockServiceDefault implements WhiskeyStockService {
  @Nonnull
  @Override
  public Map<Whiskey, Integer> fetchTodayStock() {
    var rnd = new Random();

    return Map.of(
        Whiskey.TULLAMORE, rnd.nextInt(3),
        Whiskey.JAMESON, rnd.nextInt(3),
        Whiskey.BUSHMILLS, rnd.nextInt(3));
  }
}
