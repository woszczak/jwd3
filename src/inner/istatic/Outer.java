package inner.istatic;

public class Outer {
    public static class Inner {
    }

    public Inner instantiate() {
        return new Inner();
    }

    public enum MyEnum {ONE, TWO} //domyślnie statyczny

    public interface  MyInterface{}; // domyślnie statyczny
}
