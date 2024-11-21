import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Integer> arr=new ArrayList<>();
        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(4);
        arr.add(1);
        System.out.println(arr);
        plusMinus(arr);
    }
    public static void plusMinus(List<Integer> arr) {
        int minusCount=0;
        int plusCount=0;
        int zero=0;
        for (Integer a:arr){
            if(a>0){
                plusCount++;
            } else if (a<0) {
                minusCount++;
            }else {
                zero++;
            }
        }
        int s=arr.size();
        double result;
        List<Integer> counts=new ArrayList<>();
        counts.add(plusCount);
        counts.add(minusCount);
        counts.add(zero);
        for (Integer c:counts) {
            if(c>0){
                result=(double)c/(double)s;
                String sonuc = String.format("%.6f", result);
                System.out.println(sonuc);
            }
        }
    }
}