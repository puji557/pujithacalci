import java.util.Scanner;
interface calculator{
    abstract int execute(int operand1, int operand2);
}
class Add implements calculator{
    public int execute(int operand1, int operand2) {
        return operand1 + operand2;
    }    
}
class Subtract implements calculator{
    public int execute(int operand1, int operand2) {
        return operand1 - operand2;
    }   
     
}
class Multiplication implements calculator{
    public int execute(int operand1, int operand2) {
        return operand1 * operand2;
    }   
     
}
class Division implements calculator{
    public int execute(int operand1, int operand2) {
        return operand1 / operand2;
    }   
     
}
public class calci{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        calculator cmd = new Add();
        int a=cmd.execute(x, y);
        cmd = new Subtract();
        int s= cmd.execute(x, y);
        cmd = new Multiplication();
        int m= cmd.execute(x, y);
        cmd = new Division();
        int d= cmd.execute(x, y);
        System.out.println("Addition result=" +a);
        System.out.println("Subtraction result=" +s);
        System.out.println("Multiplication result=" +m);
        System.out.println("Division result=" +d);
    }
}
