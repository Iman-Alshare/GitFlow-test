public class ArithmeticOperation{
<<<<<<< HEAD
    public static Object pow(Object num1, Object num2) {
          /*
        Cases not handled:
            1. It will accept char if it's a number
             however, it will raise exception if it's an alphabetic char
            2. Raise exception on string
            3. Divide by zero and will return max value in integer or double
            4. we can go further and take care of the returned type based on the input
         */
        Object div;
        if ((num1 instanceof String) || (num2 instanceof String) || (num1 instanceof Character) || (num1 instanceof Character))
            return (Object)null;
        if (Double.parseDouble(num1.toString())==0.0)
            return (Object)null;
        div = Math.pow(Double.parseDouble(num1.toString()),Double.parseDouble(num2.toString()));
        if (num1 instanceof Integer && num2 instanceof Integer )
            return Double.valueOf(div.toString()).intValue();
        return Double.valueOf(div.toString());
    }
        public static Object division(Object num1, Object num2) {
            Object div;
            if ((num1 instanceof String) || (num2 instanceof String) || (num1 instanceof Character) || (num1 instanceof Character))
                    return (Object)null;
            if (Double.parseDouble(num1.toString())==0.0)
                return (Object)null;
            System.out.println(Double.parseDouble(num1.toString())/Double.parseDouble(num2.toString()));
            div = Double.parseDouble(num1.toString())/Double.parseDouble(num2.toString());
            if (num1 instanceof Integer && num2 instanceof Integer )
                return Double.valueOf(div.toString()).intValue();
            return Double.valueOf(div.toString());
        }
}