class Car{
    String make;
    int year;

    void display(){
        System.out.println("Make: " + make + "\nYear: " + year);
    }
}

public class one{
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.make = "Suzuki";
        c1.year = 2004;

        c1.display();

    }
}