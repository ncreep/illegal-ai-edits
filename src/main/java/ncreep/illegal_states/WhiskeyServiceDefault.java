package ncreep.illegal_states;

import java.util.Random;

import javax.annotation.Nullable;

public class WhiskeyServiceDefault implements WhiskeyService {

  @Nullable
  @Override
  public Whiskey fetchTodayDefaultWhiskey() {
    var rnd = new Random();
    var whiskies = Whiskey.values();

    var whiskey = whiskies[rnd.nextInt(whiskies.length)];

    return whiskey;
  }
}
