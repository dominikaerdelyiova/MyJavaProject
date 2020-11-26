package sk.kosickaakademia.dominika.erdelyiova;

public class Main {
        public static void main(String[] args) {
            try{
                System.out.println("try Block : Begin");
                int myArray[]=new int[5];
                myArray [5]=10/0;
            }
            catch(ArithmeticException e)
            {
                System.out.println("Arithmetic Exception : Divide by zero");
            }
            System.out.println("rest of the code");
        }
}
