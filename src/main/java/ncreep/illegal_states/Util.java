package ncreep.illegal_states;

class Util {
  @SuppressWarnings("TypeParameterUnusedInFormals")
  public static <A> A throwNotImplemented() {
    throw new UnsupportedOperationException("???");
  }
}
