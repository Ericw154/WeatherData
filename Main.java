import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        double[] temps = {
            99.1, 142, 85, 85.1, 84.6, 94.3, 124.9, 98, 101, 102.5
        };
        ArrayList<Double> t = new ArrayList<Double>();
        for (double n : temps) t.add(n);
        WeatherData w = new WeatherData(t);
        w.cleanData(85.0, 120.0);
        System.out.println(w);
        t.add(1, 121.0);
        System.out.println(w);
        t.add(1, 84.0);
        System.out.println(w);
        w.cleanData(85.0, 120.0);
        System.out.println(w);
        System.out.println();

        double[] newTemps = {
            100.5, 98.5, 102, 103.9, 87.5, 105.2, 90.3, 94.8, 109.1, 102.1, 107.4, 93.2
        };
        ArrayList<Double> newList = new ArrayList<Double>();
        for (double n : newTemps) newList.add(n);
        w = new WeatherData(newList);
        System.out.println(w.longestHeatWave(100.5));
        System.out.println(w.longestHeatWave(95.2));
    }
}