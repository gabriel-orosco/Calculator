package orosco.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by orosco on 17/09/17.
 */

public class Operators {

    private List<String> list = new ArrayList<String>();

    public String setList (String calculo){
        String resultado;
        list = Arrays.asList(calculo.split("\\s+"));

        if ( list.size() == 3 ){
            resultado = String.valueOf(calcular());
        }if (list.size()<3){
            return calculo;
        }else{
            resultado = list.remove(list.size()-1);
        }
        return resultado;
    }


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
