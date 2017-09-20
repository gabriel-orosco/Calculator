package orosco.calculator;

/**
 * Created by orosco on 19/09/17.
 */

public class MakeCalcs {

    private  double resultado;

    public double sum(Double value1, String value2){
        if(Double.valueOf(value1)==null){
            return Double.valueOf(value2);
        }else{
            resultado = Double.valueOf(value1) + Double.valueOf(value2);
            return resultado;
        }
    }

    public double sub(Double value1, String value2){
        if(value1==null){
            return (Double.valueOf(value2)*-1);
        }else{
            resultado = value1 - Double.valueOf(value2);
            return resultado;
        }
    }

    public double mult(Double value1, String value2){
        resultado = value1 * Double.valueOf(value2);
        return resultado;
    }

    public double div(Double value1, String value2){
        resultado = value1 / Double.valueOf(value2);
        return resultado;
    }
}
