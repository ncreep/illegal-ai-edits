Material for the "Make Illegal AI Edits Unrepresentable" [blog post](http://blog.daniel-beskin.com/2025-08-24-illegal-ai-edits).

The different parts of the post are located in different branches:
- [master](https://github.com/ncreep/illegal-ai-edits) - the baseline code
- [illegal-ai-edits](https://github.com/ncreep/illegal-ai-edits/tree/illegal-ai-edits) - the AI generated edits
- [unrepresentable](https://github.com/ncreep/illegal-ai-edits/tree/unrepresentable) - after applying a "make illegal states unrepresentable" refactor

To run the `main` use:

```bash
./gradlew run -Pmain=ncreep.illegal_states.Main
```
