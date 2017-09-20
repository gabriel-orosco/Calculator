package orosco.calculator;

/**
 * Created by orosco on 18/09/17.
 */

public class GetValues {

    MakeCalcs calcs = new MakeCalcs();

    public String OperatorsList (String display) {

        String[] temp = display.split("\\s+");
        String value1="", value2;

        for(int i=1; i <= temp.length; i+=2){
            if(i==1){
                value1=temp[i-1];
            }
            value2=temp[i+1];
            switch (temp[i]){
                case "+":
                    value1=String.valueOf(calcs.sum(value1,value2));
                    break;

                case "-":
                    value1=String.valueOf(calcs.sub(value1,value2));
                    break;

                case "*":
                    value1=String.valueOf(calcs.mult(value1,value2));
                    break;

                case "÷":
                    value1=String.valueOf(calcs.div(value1,value2));
                    break;
            }
        }

        return value1;
    }


        public String GetValues (String display, String value1, String operator) {

        switch (operator){
            case "+":
                value1=String.valueOf(calcs.sum(value1,display));
                break;

            case "-":
                value1=String.valueOf(calcs.sub(value1,display));
                break;

            case "*":
                value1=String.valueOf(calcs.mult(value1,display));
                break;

            case "÷":
                value1=String.valueOf(calcs.div(value1,display));
                break;
        }
        return value1;
    }
}
