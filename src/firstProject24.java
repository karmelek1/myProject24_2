import jdk.jfr.StackTrace;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.processing.Generated;
import java.lang.annotation.Target;
import java.util.*;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.lang.annotation.Annotation;

public class firstProject24 implements firstProject24Interface , UnaryOperator<Integer> {





    public static void main(String[] args) {


        firstProject24 newO=new firstProject24();
        newO.myM();

        newO.apply(4);
        newO.equals(new Object());

    }



    public Integer myM2(int a ,int b){

        int c= a+b;


        return c;
    }






    void myM(){

        List<Integer> six=new ArrayList<>();
        six.add(4);

        Integer[] a= {33,366};
        System.out.println(Arrays.toString(a));
        //change list later and check if array will be changed too
        List<Integer> three=Arrays.asList(a);

        Collection<Integer> seven= new ArrayList<>();
        seven.add(45);

        Integer[] b={33,66};
        System.out.println(Arrays.toString(b));
        List<Integer> four=Arrays.asList(b);

          List<Integer> eight=new ArrayList<>();
        eight.add(5);
        eight.add(3534);
////////////////////////////////////////////   (Integer list)->(list)
        System.out.println("000000000000000000");
        //eight.replaceAll((Integer list)->(list))

        for (int i=0;i<four.size();i++){

            int aa= eight.get(i);
            four.set(i,aa);




        }

        System.out.println(four);
        System.out.println(Arrays.toString(b));











        // collect list to Set with collect method
        //Set newSet= three.stream().collect()  with supplier accumulator and combiner ?







        /*Set<Integer> two= three;


                new HashSet<Integer>();
        two.add(4);*/


        Map<Integer,Integer> one= new Hashtable<Integer,Integer>();




//will it work without calling it's methods?
        //Collector<>

    }



    @Override
    public Integer apply(Integer integer) {
        List<Integer>b;
        return integer;
    }

    @Test
    public void testMethod(){

        int sum =myM2(3,4);

       // Assert.assertEquals("failed",73,sum);
// test assertEquals info on the website here and in keep, assert equals is same as assertEquals?
       // System.out.println(sum.equals(7));

    }



}



