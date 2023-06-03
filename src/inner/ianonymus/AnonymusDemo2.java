package inner.ianonymus;




//niedokończone

public class AnonymusDemo2 {

    public interface GreetingModule {

        void sayHello();
    }


    public class GreetingModuleImpl implements GreetingModule {
        @Override
        public void sayHello() {
            System.out.println("good morning");
        }
    }


    public void someMethod() {
        GreetingModule greetingModule = new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("Good morning");

            }
        };
        greetingModule.sayHello();
    }

    public static void main(String[] args) {
        AnonymousDemo anonymousDemo = new AnonymousDemo();
        anonymousDemo.someMethod();
    }

}
