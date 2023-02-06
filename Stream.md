## Stream

### API
https://docs.oracle.com/javase/jp/17/docs/api/java.base/java/util/stream/package-summary.html

- > ストリーム・パイプラインは、1つのソース(Collection、配列、ジェネレータ関数、入出力チャネルなど)、それに続く0個以上の中間操作(Stream.filter、Stream.mapなど)および1つの終端操作(Stream.forEach、Stream.reduceなど)から構成
- 中間操作は終端操作が実行されるまで実行されない（遅延実行）
- > すべてのストリーム操作は順次、並列のどちらでも実行できます。 JDKのストリーム実装は、並列性が明示的に要求されない限り、順次ストリームを作成
- > ストリームは、定義された検出順序を持つことも持たないこともあります。 ストリームが検索順序を持つかどうかは、そのソースと中間操作によって決まります

### 参考
[Java Stream APIをいまさら入門](https://qiita.com/takumi-n/items/369dd3fcb9ccb8fcfa44)

[Java 8 新機能つまみぐい](https://qiita.com/oohira/items/9c13f92815266cc5112c#stream)

[Java streams best practices](http://blog.marcinchwedczuk.pl/java-streams-best-practices)
- > You should prefer method references to lambdas. ラムダよりもメソッド参照を優先させるべき
```java
// AVOID:
strings.stream()
	.map(s -> s.length())
	.collect(toList());

// PREFER:
strings.stream()
	.map(String::length)
	.collect(toList());
```
- > Use IntStream, LongStream and DoubleStream when working with primitive types. They are faster (they avoid boxing) and easier to use (they add useful methods like sum). プリミティブ型を扱うときは、IntStream、LongStream、DoubleStreamを使用します。これらは高速で（ボックス化を避ける）、使いやすく（sumのような便利なメソッドが追加される）なっています。
```java
Stream<String> strings = Stream.of("a", "foo", "bar", "baz");

double averageLength = strings
		.mapToInt(String::length)
		.summaryStatistics()
		.getAverage();
```
```java
// prints: 0 1 2 3 4 5 6 7 8 9
IntStream.range(0, 10)
	.forEach(System.out::println);

// prints: 1 2 4 8 16 32 64 128 256 512
IntStream.iterate(1, i -> 2*i)
	.limit(10)
	.forEach(System.out::println);

ThreadLocalRandom random = ThreadLocalRandom.current();

// prints: -376368599 2112239618
// just to demo generate method:
IntStream.generate(random::nextInt)
	.limit(2)
	.forEach(System.out::println);

// prints: -1134353240 2007034835
// stream of random int's - more idiomatic way:
random.ints()
	.limit(2)
	.forEach(System.out::println);
```
