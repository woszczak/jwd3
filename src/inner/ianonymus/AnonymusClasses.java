package inner.ianonymus;

public class AnonymusClasses {
    public interface GreetingModule {
        void sayHello();
    }

    public static class Robot {
        private final GreetingModule greetingModule;

        public Robot(GreetingModule greetingModule) {
            this.greetingModule = greetingModule;
        }

        public void saySomething() {
            greetingModule.sayHello();
        }

        public static void main(String[] args) {
            Robot jan = new Robot(new GreetingModule() {
                @Override
                public void sayHello() {
                    System.out.println("dzień dobry");
                }
            });

            Robot john = new Robot(new GreetingModule() {
                @Override
                public void sayHello() {
                    System.out.println("good morning");
                }
            });

            Robot johan = new Robot(new GreetingModule() {
                @Override
                public void sayHello() {
                    System.out.println("guten morgen");
                }
            });


            jan.saySomething();
            john.saySomething();
            johan.saySomething();
        }
    }
}
