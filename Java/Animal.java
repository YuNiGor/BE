public class Animal {
    private static int counter = 0;
    public int age; // public
    private double weight; // private
    protected String name; // protected
    int id; // default

    public Animal(int age, double weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.id = ++counter;
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }

    /**
     * Метод для изменения значения поля weight
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Метод для получения значения поля weight
     * @return
     */
    public double getWeight() {
        return weight;
    }
}
