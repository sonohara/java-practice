import java.util.EnumSet;

public class HowToEnum {
    public static void main(String[] args) {
        HowToEnum.region(Region.JAPAN);
        HowToEnum.greeting(Greeting.AMERICA);
    }

    private static void region(Region region) {
        String greet = switch (region) {
            case JAPAN -> "こんにちは";
            case AMERICA -> "Hello";
            case CHINA -> "ニイハオ";
        };

        System.out.println("region ---------------");
        System.out.println(greet);
    }

    private static void greeting(Greeting greeting) {
        System.out.println("greeting ---------------");

        System.out.println(greeting.greeting());
    }

    public enum Region {
        JAPAN,
        AMERICA,
        CHINA
    }

    public enum Greeting {
        JAPAN("こんにちは"),
        AMERICA("Hello"),
        CHINA("ニイハオ");

        private final String greeting;

        private Greeting(String greeting) {
            this.greeting = greeting;
        }

        public String greeting() {
            return this.greeting;
        }
    }

    public enum Runner {
        WALK {
            @Override
            public void run(int speed) {
                System.out.println(speed * 1);
            }
        },
        CAR {
            @Override
            public void run(int speed) {
                System.out.println(speed * 2);
            }
        };

        private static final EnumSet<Runner> walker = EnumSet.of(Runner.WALK);

        abstract public void run(int speed);

        public boolean isWalker() {
            return walker.contains(this);
        }
    }
}
