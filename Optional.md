## Optional
API

https://docs.oracle.com/javase/jp/17/docs/api/java.base/java/util/Optional.html

- 非null値を含んでも含まなくてもよいコンテナ・オブジェクト。 
- `Optional` は、主に"検索結果はありません、"を明示的に表示する必要があり、`null` を使用するとエラーが発生する可能性のあるメソッドの戻り値の型として使用することを意図しています。 型が `Optional` の変数は、それ自体決して `null` であってはなりません。常に `Optional` インスタンスを指す必要があります。


Optionalクラスを意図されたとおりに使うための12のレシピ

https://blogs.oracle.com/otnjp/post/recipes-for-using-the-optional-class-as-its-meant-to-be-used-ja

- レシピ2：直接 `get()` を呼ばない
- `Optional` は空になる可能性があるため、`get()` を直接呼び出すと `java.util.NoSuchElementException` がスローされる


