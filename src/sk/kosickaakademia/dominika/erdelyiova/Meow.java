package sk.kosickaakademia.dominika.erdelyiova;

public interface Meow {
        void methodMeow();

    class Woof {
        public void methodWoof() {

        }

    }

    class Oink extends Woof implements Meow {

        public void methodMeow() {

        }

    }
}
