package orosco.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by orosco on 18/09/17.
 */

public class Spliter {

    private List<String> list = new ArrayList<String>();

     public String OperatorsList (String display) {

         String[] operators = {"+","-","*","÷"};
         String operador;
         for (String operator: operators) {
             if(list.contains(operator)==true){
              operador=operator;
                 //chamada metodo calcular
             }
         }

         list = Arrays.asList(display.split("\\s+"));













         return null;

     }
}
