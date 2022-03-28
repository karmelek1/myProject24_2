import java.util.*;
import java.util.stream.Collector;

public class firstProject24 implements firstProject24Interface{


    public static void main(String[] args) {


        firstProject24 newO=new firstProject24();
        newO.myM();
        newO.myM2();

        newO.equals(new Object());

    }



    public Integer myM2(){


        return null;
    }






    void myM(){

        List<Integer> six=new ArrayList<>();
        six.add(4);

        Integer[] a= {33,366};
        System.out.println(Arrays.toString(a));
        //change list later and check if array will be changed too
        Collection<Integer> three=Arrays.asList(a);

        Collection<Integer> seven= new ArrayList<>();
        seven.add(45);

        Integer[] b={33,66};
        List<Integer> four=Arrays.asList(b);
////////////////////////////////////////////
        four.replaceAll();









        // collect list to Set with collect method
        //Set newSet= three.stream().collect()







        Set<Integer> two= (Set<Integer>) three;


                new HashSet<Integer>();
        two.add(4);


        Map<Integer,Integer> one= new Hashtable<Integer,Integer>();




//will it work without calling it's methods?
        //Collector<>

    }
}
