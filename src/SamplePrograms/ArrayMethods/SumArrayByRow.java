package SamplePrograms.ArrayMethods;

public class SumArrayByRow {

    public static void main(String[] args) {
        double shopping[][] = {
            {3.49,12.5,14},
            {10, 30.50},
            {34,12,50,101.34,23.99,54.17}
        };
        double tots[] = getTotals(shopping);
        System.out.println("Totals for "+tots.length+" days: ");
        for (int i = 0; i < tots.length; i++) {
            
        }
    }
    public double[] getTotals(double prices[][]){
       double totals[]=new double[prices.length];
        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < prices[i].length; j++) {
                totals[i] += prices[i][j];
            }
        }
        return totals;
    }
}
