public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car() {
        this.make = "";
        this.model = "";
        this.year = 0;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void out() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    /*
    В этом классе есть три приватных поля make, model и year, два конструктора (один принимает аргументы, другой нет),
    ассессоры get и set для каждого поля и метод out для вывода полей на консоль.
     */
}
