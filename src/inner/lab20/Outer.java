package inner.lab20;

public class Outer {

    private String Outer;

    public void Outermethod() {
        Inner1 inner1 = new Inner1();
        inner1.inner1Method();
    }


    private class Inner1 {
        private String Inner1;

        public void inner1Method() {
            Inner2 inner2 = new Inner2();
            inner2.inner2Method();

        }
    }

    private class Inner2 {
        public String Inner2;
        public void inner2Method(){
            System.out.println("Metoda zewnętrzna: " + Outer);
            System.out.println("Metoda zagnieżdżona 1: " );

        }
    }

}
