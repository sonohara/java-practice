# Mockito

- [Mockito](#mockito)
  - [ドキュメント](#ドキュメント)
  - [めも](#めも)
  - [参考](#参考)

## ドキュメント

公式

- <https://site.mockito.org/>
- <https://javadoc.io/doc/org.mockito/mockito-core/latest/org/mockito/Mockito.html>

## めも

mock と spy の違い

- mock
  - クラスを指定する
    - mock ≒ ハリボテ -> クラスを指定してそのハリボテ（インスタンス）を作る
  - デフォルト（stub していない）場合はメソッドごとに初期値が返る
  - stub することで指定したメソッドの挙動を変更できる
    > By default, for all methods that return a value, a mock will return either null, a primitive/primitive wrapper value, or an empty collection, as appropriate. For example 0 for an int/Integer and false for a boolean/Boolean. <https://javadoc.io/doc/org.mockito/mockito-core/latest/org/mockito/Mockito.html#stubbing>
  - mock のうち、一部メソッドの挙動のみ置き換えたものを partial mock という
    - `thenCallRealMethod()` メソッドで実現する
      - https://javadoc.io/doc/org.mockito/mockito-core/latest/org/mockito/Mockito.html#partial_mocks
- spy
  - オブジェクトを指定する
    - spy ≒ スパイ -> オブジェクトを指定してそれに成りすます
  - デフォルト（stub していない）部分は実際のオブジェクトの処理が実行される
  - stub することで指定したメソッドの挙動を変更できる
  - https://javadoc.io/doc/org.mockito/mockito-core/latest/org/mockito/Mockito.html#spy

private メソッドは mock できない

- https://github.com/mockito/mockito/wiki/Mockito-And-Private-Methods

## 参考

- [Mockito使い方メモ](https://qiita.com/opengl-8080/items/dcdf2cb14f2642240a5b)
- [【Java】雰囲気でmockしていた自分のためのMockito再入門](https://udomomo.hatenablog.com/entry/2020/01/01/153308)