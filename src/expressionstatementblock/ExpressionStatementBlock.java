package expressionstatementblock;

public class ExpressionStatementBlock {
    public static void main(String[] args) { // block dari main function
        int value; // expresion
        value = 100; // expresion

        System.out.println(value); // statement
        System.out.println(value = 10); // statement dan expression value = 10

        { // block yang ada di dalam block main function
            System.out.println("hello");
            { // nested block didalam block
                System.out.println("world");
            }
        }
    }
}
