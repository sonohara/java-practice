## JUnit

## Doc
- 公式: https://junit.org/junit5/
- 日本語訳: https://oohira.github.io/junit5-doc-jp/user-guide/ ※少し古い

### 環境構築
VSCode で簡単に動かす
- https://qiita.com/natsuozawa/items/822ba59c523e8c6223c0
- https://code.visualstudio.com/docs/java/java-testing#_enable-testing-and-adding-test-framework-jars-to-your-project

なぜか Before/After 系が実行されない謎
Gradle プロジェクトでは実行されるのでこっちで試す

Gradle で JUnit
- https://oohira.github.io/junit5-doc-jp/user-guide/#running-tests-build-gradle

Gradle のテスト設定
- https://docs.gradle.org/current/userguide/java_testing.html#java_testing
- https://docs.gradle.org/current/dsl/org.gradle.api.tasks.testing.Test.html

### 実行
コンソールから
```
$ .\gradlew.bat clean test
```

### 参考
- [JUnit5 使い方メモ](https://qiita.com/opengl-8080/items/efe54204e25f615e322f)
- [JUnit 5 + Gradle による Java の自動テスト導入](https://qiita.com/niwasawa/items/cfcd37a3c2a795c336ba)
