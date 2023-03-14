package calculator.my.calculatordemo;


import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {

    public String sayHello () {
        return "Добро пожаловать в калькулятор";
    }

    public String sum (String num1, String num2) {
        if(num1 == null || num2 == null){
            return "Пожалуйста, заполните оба параметра!";
        }
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        return num1 + " + " + num2 + " = " + (number1 + number2);
    }

    public String sub (String num1,  String num2) {
        if(num1 == null || num2 == null){
            return "Пожалуйста, заполните оба параметра!";
        }
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        return num1 + " - " + num2 + " = " + (number1 - number2);
    }

    public String mult (String num1, String num2) {
        if(num1 == null || num2 == null){
            return "Пожалуйста, заполните оба параметра!";
        }
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        return num1 + " * " + num2 + " = " + (number1 * number2);
    }

    public String div ( String num1,  String num2) {
        if(num1 == null || num2 == null){
            return "Пожалуйста, заполните оба параметра!";
        }
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        if(number2 == 0) {
            return "Ошибка! На 0 делить нельзя!";
        }
        return num1 + " / " + num2 + " = " + (number1 / number2);
    }
}
