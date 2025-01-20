package step_11_4_generics_wildcard.Question;

public class Question {
    class Base<T> {  }
    class Derived<T> {  }
    class Test {
        public void main(String[] args)  {
            Derived<?> b = new Derived<Integer>();

            Derived<? extends Number> c = new Derived<Integer>();

            //Base<?> d = new Derived<Integer>();

            //Base<? extends Number> e = new Derived<Integer>();

            //Base<? extends Number> f = new Derived<Number>();

            Base<? extends Number> j = new Base<Number>();
        }
    }
}
