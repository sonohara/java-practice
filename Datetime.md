## Datateime

### API
https://docs.oracle.com/javase/jp/17/docs/api/java.base/java/time/package-summary.html

フォーマット
https://docs.oracle.com/javase/jp/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

アジャスタ
https://docs.oracle.com/javase/jp/17/docs/api/java.base/java/time/temporal/TemporalAdjusters.html

特定の日付などへの調整
> - 月の最初または最後の日を見つける
> - 翌月の最初の日を見つける
> - その年の最初または最後の日を見つける
> - 翌年の最初の日を見つける
> - 月内の最初または最後の曜日(「6月の最初の水曜日」など)を見つける
> - 次または前の曜日(「次の木曜日」など)を見つける

Unixtime
https://docs.oracle.com/javase/jp/17/docs/api/java.base/java/time/Instant.html

### 参考
[Java8の日時APIはとりあえずこれだけ覚えとけ](https://qiita.com/tag1216/items/91a471b33f383981bfaa)

[ここが大変だよJava 8 Date-Time API（1）- ImmutableでスレッドセーフになったJavaの新しい日時APIの基礎知識](https://atmarkit.itmedia.co.jp/ait/articles/1412/16/news041.html)
> - Date-Time APIで用意されたクラスは生成後に状態が変わらないImmutableなクラスになっており、スレッドセーフになっている

[ここが大変だよJava 8 Date-Time API（2）- Java 8日時APIの主なメソッドとフォーマット用のパターン文字の使い方](https://atmarkit.itmedia.co.jp/ait/articles/1501/29/news016.html)

[タイムゾーン呪いの書 (Java 編)](https://zenn.dev/dmikurube/articles/curse-of-timezones-java-ja)