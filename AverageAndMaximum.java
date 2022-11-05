

public class AverageAndMaximum {
    public double average(Measurable[] datas){
        double sum=0;
        double length = datas.length;

        for(int i=0; i<length; i++){
            sum = sum + datas[i].getValues();
        }

        return sum/length;
    }

    public Measurable maximum(Measurable[] datas){
        double max = -1;
        Measurable obj = datas[0];
        for(int i=0; i< datas.length; i++){
            if(datas[i].getValues()>max){
                max = datas[i].getValues();
                obj = datas[i];
            }
        }
        return obj;
    }
}
