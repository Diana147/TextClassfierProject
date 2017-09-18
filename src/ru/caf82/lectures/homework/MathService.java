  
package homework;
public class MathService {
    public static double dotProduct(double[] x, double[] w){
        double result = 0;
        for (int i=0; i<x.length; i++){
            result +=x[i] * w[i];
        }
        return result;
    }
    
    public static double sigmoid(double x){
        return (1/(1+Math.exp(-x)));
       
    }
    
    public static double sigmoid (double[] x, double[] w) {
        double result = dotProduct(x, w);
        double result1 = sigmoid(result);
        return result1;
       
    }
    
    public static double [] vectorNormalize (double[]x) {
        double average = 0;
        double[] result = new double [x.length];
        for (int i=0; i<x.length; i++) {
            average +=x[i];
        }
        double disp=0;
        average = average/x.length;
        for (int k=0; k<x.length; k++) {
            disp +=Math.pow((x[k]-average), 2);
        }
        disp=Math.sqrt(disp/(x.length-1));
        for (int m=0;m<x.length; m++){
            result[m]=(x[m]-average)/disp;
        }
        return result;
    }
    
public static double [][] matrixNormalize (double [][] x)  {
    double[][] result =new double [x.length] [];
    for (int i=0; i<x.length;i++){
        result[i] = new double [x[i].length];
        result[i] = vectorNormalize (x[i]);
    }
    return result;
}
}

