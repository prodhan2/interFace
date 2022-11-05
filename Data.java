public class Data {
    public static void main(String[] str){
        Measurable[] datas = new Quiz[5];
        datas[0] = new Quiz(60, "B-");
        datas[1] = new Quiz(70, "B");
        datas[2] = new Quiz(80, "A-");
        datas[3] = new Quiz(90, "A");
        datas[4] = new Quiz(100, "A+");

        AverageAndMaximum obj = new AverageAndMaximum();
        System.out.println(obj.average(datas));
        Quiz obj2 = (Quiz)obj.maximum(datas);
        System.out.println("Maximum Grade: "+obj2.getNames()+"\nMaximum Score: "+obj2.getValues());

        Measurable[] datas2 = new Person[5];
        datas2[0] = new Person(60, "Zahin1");
        datas2[1] = new Person(70, "Zahin2");
        datas2[2] = new Person(80, "Zahin3");
        datas2[3] = new Person(90, "Zahin4");
        datas2[4] = new Person(100, "zahin5");

        AverageAndMaximum obj3 = new AverageAndMaximum();
        System.out.println(obj3.average(datas2));
        Person obj4 = (Person) (obj3.maximum(datas2));
        System.out.println("Tallest Person: "+obj4.getNames()+"\nMaximum Height: "+obj4.getValues());
    }
}
