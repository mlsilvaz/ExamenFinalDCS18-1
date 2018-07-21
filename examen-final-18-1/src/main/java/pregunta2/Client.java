package pregunta2;

public class Client {

    public static void main(String[] args) {
        int[] numbers = { 1, 5, 7, 78, 9, 2, 24, 38, 78, 91, 96, 4, 6, 17, 101, 24, 38, 47, 37, 148, 2, 589};
        boolean hasDuplicates;
        for (ComplexityType complexityType : ComplexityType.values()) {
            switch(complexityType) {
                case Lineal: 
                    hasDuplicates = hasDuplicateValuesLineal(numbers);
                    System.out.println(ComplexityType.Lineal.toString() + " - hasDuplicates: " + hasDuplicates);
                    break;
                case Cuadratic: 
                    hasDuplicates = hasDuplicateValuesCuadratic(numbers);
                    System.out.println(ComplexityType.Cuadratic.toString() + " - hasDuplicates: " + hasDuplicates);
                    break;
                case Exponential: 
                    hasDuplicates = hasDuplicateValuesExponential(numbers);
                    System.out.println(ComplexityType.Exponential.toString() + " - hasDuplicates: " + hasDuplicates);
                    break;
            }
        }
    }
    
    public static boolean hasDuplicateValuesCuadratic(int[] numbers)
    {        
        return true;
    }
    
    public static boolean hasDuplicateValuesLineal(int[] numbers)
    {        
        return true;
    }
    
    public static boolean hasDuplicateValuesExponential(int[] numbers)
    {        
        return true;
    }
}
