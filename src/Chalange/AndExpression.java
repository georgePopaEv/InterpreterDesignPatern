package Chalange;

public class AndExpression implements Expression{
    private Expression expression1 = null;
    private Expression expression2 = null;

    public AndExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    public boolean interpret(Context context){
        return expression1.interpret(context) && expression2.interpret(context);
    }

}
