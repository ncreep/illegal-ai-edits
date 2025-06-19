# Prompts

In @src/main/java/ncreep/illegal_states/OrderProcessor.java we no longer want to hardcode the default `Whiskey` value since we don't know whether it's available today or not. Use @src/main/java/ncreep/illegal_states/WhiskeyService.java to inject the value dynamically instead. In @src/main/java/ncreep/illegal_states/Main.java use @src/main/java/ncreep/illegal_states/WhiskeyServiceDefault.java. Use `gradlew build` to verify that everything compiles.

In @src/main/java/ncreep/illegal_states/WhiskeyServiceDefault.java it's possible that we used a whiskey that's not in stock today. Use @src/main/java/ncreep/illegal_states/WhiskeyStockService.java to only return the chosen whiskey if it's in stock at the moment. In @src/main/java/ncreep/illegal_states/Main.java use @src/main/java/ncreep/illegal_states/WhiskeyStockServiceDefault.java. Use `gradlew build` to verify that everything compiles

Never use a hardcoded value

No exceptions

It's impossible to guarantee that `fetcTodayDefaultWhiskey` is never `null`

Changing the drink silently is not user friendly

It makes no sense to have Irish coffee without whiskey
