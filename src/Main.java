import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntUnaryOperator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        Integer [] array=new Integer[size];
        int index=0;

        while (size>0){
            int number=scanner.nextInt();
            array[index++]=number;
            size--;
        }

         ArrayList <Integer> arr=new ArrayList<>(Arrays.asList(array));

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
                    result=(double)c/(double)s;
                    String sonuc = String.format("%.6f", result);
                    System.out.println(sonuc);

            }
        }

    }



