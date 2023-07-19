// this will be the first of my many projects to use in my portfolio, this being the most basic one
import java.util.Scanner;

public class calculator{
    double firstnumber;
    double secondnumber;
    public calculator(double firstnumber, double secondnumber){
        this.firstnumber = firstnumber;
        this.secondnumber = secondnumber;
    }

    public void add(){
        double addnum = firstnumber + secondnumber;
        System.out.println("the answer is " + addnum);
    }
    public void subtract(){
        double subnum = firstnumber - secondnumber;
        System.out.println("the answer is " + subnum);
    }
    public void multiply(){
        double multiplynum = firstnumber * secondnumber;
        System.out.println("the answer is " + multiplynum);
    }
    public void divide(){
        if(secondnumber == 0){
            System.out.println("Error: cannot divide by zero");
        }
        else{
            double dividenum = firstnumber / secondnumber;
            System.out.println("the answer is " + dividenum);
        }

    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter your second number:");
        double num2 = scanner.nextDouble();
        System.out.println("Enter your opperation: + , - , * , /");
        String operation = scanner.next();

        calculator calc = new calculator(num1, num2);
        
        if(operation.equals("+")){
            calc.add();
        }
        else if(operation.equals("-")){
            calc.subtract();
        }
        else if(operation.equals("*")){
            calc.multiply();
        }
        else if(operation.equals("/")){
            calc.divide();
        }
        else{
            System.out.println("Error, invalid operation");
        }
    }


}   