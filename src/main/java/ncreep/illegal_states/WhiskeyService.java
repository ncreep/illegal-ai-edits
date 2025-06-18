package ncreep.illegal_states;

import javax.annotation.Nullable;

interface WhiskeyService {

  @Nullable
  public Whiskey fetchTodayDefaultWhiskey();
}
