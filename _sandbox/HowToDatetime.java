package _sandbox;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class HowToDatetime {
    public static void main(String[] args) {
        // 現在日時の取得
        System.out.println("now ---------");
        LocalDateTime d = LocalDateTime.now();
        System.out.println(d.toString());

        // フォーマット変更
        System.out.println("format ---------");
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(d.format(f));

        // 加算減算
        System.out.println("+1月 ---------");
        System.out.println(d.plusMonths(1).format(f));
        System.out.println("+1日 ---------");
        System.out.println(d.plusDays(1).format(f));
        System.out.println("+1時間 ---------");
        System.out.println(d.plusHours(1).format(f));

        // 特定日付
        System.out.println("1月 ---------");
        System.out.println(d.withMonth(1).format(f));
        System.out.println("1日 ---------");
        System.out.println(d.withDayOfMonth(1).format(f));

        // 練習
        System.out.println("当月末日 ---------");
        System.out.println(d.plusMonths(1).withDayOfMonth(1).minusDays(1).format(f));
        // TemporalAdujuster を使えばいいらしい
        System.out.println(d.with(TemporalAdjusters.lastDayOfMonth()).format(f));

        // Unixtime
        // タイムゾーン情報を持たないままだと算出できないので ZonedDateTime に変換する
        System.out.println(d.atZone(ZoneId.of("Asia/Tokyo")).toEpochSecond());
    }
}
