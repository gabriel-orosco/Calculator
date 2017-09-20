package orosco.calculator;

/**
 * Created by orosco on 18/09/17.
 */

public class GetValues {

    private MakeCalcs calcs = new MakeCalcs();


        public Double GetValues (Double value1, String display, String operator) {

        switch (operator){
            case "+":
                value1=(calcs.sum(value1,display));
                break;

            case "-":
                value1=calcs.sub(value1,display);
                break;

            case "*":
                value1=calcs.mult(value1,display);
                break;

            case "÷":
                value1=calcs.div(value1,display);
                break;
        }
        return value1;
    }
}
