package _sandbox;

import java.util.Optional;

/**
 * Optional
 */
public class HowToOptional {
    public static void main(String[] args) {
        // 生成
        HowToOptional.of();
        HowToOptional.ofNullable();
        HowToOptional.empty();

        // 取得
        // 値がない場合は指定した値を返す
        HowToOptional.orElse();
        HowToOptional.orElseGet();
        // 値がない場合に例外を投げる
        HowToOptional.orElseThrow();
        // 値が存在する場合のみ処理する、存在しない場合はなにもしない
        HowToOptional.ifPresent();
    }

    protected static void of() {
        System.out.println("of  ------------------");

        // https://docs.oracle.com/javase/jp/17/docs/api/java.base/java/util/Optional.html#of(T)
        // 引数が null だとぬるぽが発生する
        Optional<String> o = Optional.of("hoge");
        // Optional<String> o = Optional.of(null);
        o.ifPresent(x -> System.out.println(x));
    }

    protected static void ofNullable() {
        System.out.println("ofNullable  ------------------");

        // https://docs.oracle.com/javase/jp/17/docs/api/java.base/java/util/Optional.html#ofNullable(T)
        // こっちは引数が null でぬるぽは発生しない
        Optional<String> o = Optional.ofNullable(null);
        o.ifPresent(System.out::println); // なにも出力されない
    }

    protected static void empty() {
        System.out.println("empty  ------------------");

        // https://docs.oracle.com/javase/jp/17/docs/api/java.base/java/util/Optional.html#empty()
        Optional<String> o = Optional.empty();
        o.ifPresent(System.out::println); // なにも出力されない
    }

    protected static void orElse() {
        System.out.println("orElse  ------------------");

        // https://docs.oracle.com/javase/jp/17/docs/api/java.base/java/util/Optional.html#orElse(T)
        String p = "hoge";
        // String p = null;
        Optional<String> o = Optional.ofNullable(p);
        String v = o.orElse(HowToOptional._getFuga());
        // p = hoge の場合は hoge、p = null の場合は fuga が出力される
        // orElse で指定した値は必ず評価されるため、p = hoge の場合でも _getFuga() は実行される（p = null
        // の場合は当然実行される）
        // -> 実行させたくない場合は orElseGet() を使う
        System.out.println(v);
    }

    protected static void orElseGet() {
        System.out.println("orElseGet  ------------------");

        String p = "hoge";
        // String p = null;
        Optional<String> o = Optional.ofNullable(p);
        // orElseと違って p = hoge の場合は _getFuga が call されない
        String v = o.orElseGet(HowToOptional::_getFuga);

        System.out.println(v);
    }

    protected static String _getFuga() {
        System.out.println("call fuga");
        return "fuga";
    }

    protected static void orElseThrow() {
        System.out.println("orElseThrow  ------------------");

        String p = "hoge";
        // String p = null:
        Optional<String> o = Optional.ofNullable(p);
        try {
            String v = o.orElseThrow(() -> new Exception("error"));
            System.out.println(v);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static void ifPresent() {
        System.out.println("ifPresent  ------------------");

        // String p = "hoge";
        String p = null;
        Optional<String> o = Optional.ofNullable(p);
        o.ifPresent(s -> System.out.println(s));
        o.ifPresentOrElse(s -> System.out.println(s), () -> System.out.println("null"));
    }
}