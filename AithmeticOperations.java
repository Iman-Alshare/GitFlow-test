public class ArithmeticOperation{
    public static Object pow(Object num1, Object num2) {

        Object div;
        div = Math.pow(Double.parseDouble(num1.toString()),Double.parseDouble(num2.toString()));
        if (num1 instanceof Integer && num2 instanceof Integer )
            return Double.valueOf(div.toString()).intValue();
        return Double.valueOf(div.toString());
    }
}