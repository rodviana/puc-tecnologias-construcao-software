import java.util.ArrayList;

public class Util {
    static ArrayList<Integer> fibonnciList = new ArrayList<>();
    static ArrayList<Integer> tribonacciList = new ArrayList<>();
    public static void getValueTribonnaci(Integer index)
    {
        if(fibonnciList.isEmpty())
            inicalizaFibonnaciList();

        if(tribonacciList.size()<index-1)
            getTribonnaciListAtIndex(index);

        System.out.println(tribonacciList.get(index-1));
    }

    public static void getTribonnaciListAtIndex(Integer index)
    {
        while (tribonacciList.size()<index)
        {
            getNextFibonnaci();
            if(ultimoIsTribonnaci(fibonnciList))
                tribonacciList.add(fibonnciList.get(fibonnciList.size()-1));
        }
    }

    public static void getNextFibonnaci()
    {
        Integer index = fibonnciList.size()-1;
        fibonnciList.add(fibonnciList.get(index) + fibonnciList.get(index-1));
    }

    public static Boolean ultimoIsTribonnaci(ArrayList<Integer> fibonnciList)
    {
        Integer value = fibonnciList.get(fibonnciList.size()-1);
        return (value%3==0 || containsThree(value));
    }

    public static Boolean containsThree(Integer numero)
    {
        String numeroString = String.valueOf(numero);
        return  numeroString.contains("3");
    }
    public static void inicalizaFibonnaciList()
    {
        fibonnciList.add(1);
        fibonnciList.add(1);
    }
}
