package ncreep.illegal_states;

import java.util.Map;

import javax.annotation.Nonnull;

interface WhiskeyStockService {
  // invariant: all Whiskey types are present in the resulting Map
  @Nonnull
  public Map<Whiskey, Integer> fetchTodayStock();
}
