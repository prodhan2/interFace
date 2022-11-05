
public class Person implements Measurable{
    double height;
    String name;

    public Person(double height, String name){
        this.height = height;
        this.name = name;
    }

    public double getValues(){
        return height;
    }
    public String getNames(){
        return name;
    }
}
