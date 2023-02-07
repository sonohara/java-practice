## Optional

### API

https://docs.oracle.com/javase/jp/17/docs/api/java.base/java/util/Optional.html

- 非null値を含んでも含まなくてもよいコンテナ・オブジェクト。 
- `Optional` は、主に"検索結果はありません、"を明示的に表示する必要があり、`null` を使用するとエラーが発生する可能性のあるメソッドの戻り値の型として使用することを意図しています。 型が `Optional` の変数は、それ自体決して `null` であってはなりません。常に `Optional` インスタンスを指す必要があります。

### 基本的な使い方

- [Java8 Optionalの逆引きレシピ](https://zenn.dev/nslender/articles/e2292eb9e06d35)
- [今更まとめるJava Optional](https://zenn.dev/ayumukob/articles/552d0c7b544838)

### 参考

[Optionalクラスを意図されたとおりに使うための12のレシピ](https://blogs.oracle.com/otnjp/post/recipes-for-using-the-optional-class-as-its-meant-to-be-used-ja)

直接 `get()` を呼ばない
- `Optional` は空になる可能性があるため、`get()` を直接呼び出すと `java.util.NoSuchElementException` がスローされる
- 後述の `orElse()` や `orElseGet()` 等を使う

`orElse()` 内で高コストの演算をしない
- `orElse()` が返す値は、オプショナル値が存在するかどうかによらず、必ず評価されます
- そこで、`orElseGet(Supplier<? extends T> supplier)` を使います。このメソッドは `orElse()` に似ていますが、1つ違いがあります。`Optional` が空だった場合、`orElse()` では直接デフォルト値が返されますが、`orElseGet()` には `Optional` が空だった場合にのみ呼び出される `Supplier` 関数を渡すことができます。

値が存在しない場合に別の `Optional` を返すときは `or (Supplier<? extends Optional<? extends T>> supplier)` を使う
- https://docs.oracle.com/javase/jp/17/docs/api/java.base/java/util/Optional.html#or(java.util.function.Supplier)


