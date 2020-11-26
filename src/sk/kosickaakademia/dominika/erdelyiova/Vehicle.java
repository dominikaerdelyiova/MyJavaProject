package sk.kosickaakademia.dominika.erdelyiova;

public class Vehicle {
    private String maxSpeed;

    {
        int maxSpeed = 120;
    }

    static class Car extends Vehicle
    {
        int maxSpeed = 180;

        void display()
        {
            System.out.println("Maximum Speed: " + super.maxSpeed);
        }
    }

    static class Test
    {
        public static void main(String[] args)
        {
            Car small = new Car();
            small.display();
        }
    }
}
