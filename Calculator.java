import java.util.*;

public class Main{
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        System.out.print("Your numbers: ");
int a ;
int b ;
try{
    a = Integer.parseInt(scan.next());
    b = Integer.parseInt(scan.next());
    Calculator calculator = new Calculator(a,b);
    System.out.print("Choose the one of + - / * ");
    char asd = scan.next().charAt(0);
    switch (asd){
        case '+' :
            System.out.println("Addition: " + calculator.obj1());
            break;
        case '-' :
            System.out.println("Subtarction: " + calculator.obj2());
            break;
        case '*' :
            System.out.println("Multiplication: " + calculator.obj3());
            break;
        case '/' :
            System.out.println("Division: " + calculator.obj4());
            break;
        default:
            System.err.println("Invalid operator!");

    }
}
catch (NumberFormatException ew){
    System.err.println("Number is wrong!");
}
catch (ArithmeticException asq){
    System.err.println(asq.getMessage());
}
    }


    }
    class Calculator{
    int a;
    int b;

Calculator(){}
        public Calculator(int a, int b){
        this.a = a;
        this.b = b;
        }
    public int obj1() throws ArithmeticException{
        if(a<=0 || b<=0) throw new ArithmeticException("Numbers should be positive for addition");
        else return a+b;
    }
    public int obj2() throws ArithmeticException{
        if(a<=0 || b<=0) throw new ArithmeticException("Numbers should be positive for subtraction");
        else return a-b;
    }
    public int obj3() throws ArithmeticException{
        if(a==0 || b==0) throw new ArithmeticException("Numbers should not be zero for multiplication");
        else return a*b;
    }
    public int obj4() throws ArithmeticException{
        if (a==0 || b==0) throw new ArithmeticException("Numbers should not be zero for division");
        else return a/b;
    }

    }
