package orosco.calculator;

/**
 * Created by orosco on 17/09/17.
 */

public class Operators {

    private String removeOperator(String temp){
        temp = temp.substring(0,temp.length()-3);
        return temp;
    }

    public String checkOperators(String textView){
        if(textView.length()>=3){
            String temp = textView.substring(textView.length()-2,textView.length()-1);
            switch (temp) {
                case "+":
                    return removeOperator(textView);

                case "-":
                    return removeOperator(textView);

                case "*":
                    return removeOperator(textView);

                case "÷":
                    return removeOperator(textView);

                default:
                    return textView;

            }
        }else{
            return textView;

        }
    }

}
