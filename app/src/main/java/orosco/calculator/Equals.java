package orosco.calculator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by orosco on 19/09/17.
 */

public class Equals {

    private List<String> list = new ArrayList<String>();

    private double calcular(){

        String value1 = list.get(0);
        String operator = list.get(1);
        String value2 = list.get(2);

        switch (operator){
            case "+":
                return Double.valueOf(value1)+Double.valueOf(value2);

            case "-":
                return Double.valueOf(value1)-Double.valueOf(value2);

            case "*":
                return Double.valueOf(value1)*Double.valueOf(value2);

            case "÷":
                return Double.valueOf(value1)/Double.valueOf(value2);
            case "=":

            default:
                return 0;
        }
    }
}
