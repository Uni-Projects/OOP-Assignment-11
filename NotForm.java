
package pkg11visitorpattern;

/**
 *
 * @author Johan Urban s1024726
 * @author Paolo Scattolin s1023775
 * @assignment 11: visitor pattern
 * @date 12/05/2019
 */
public class NotForm implements Form {
    private Form operand;
    private final int precedence = 1;
    private Form parent;
    
    public NotForm(Form oper, Form parent) {
        this.operand = oper;
        this.parent = parent;
    }
    
    public Form getOperand() {
        return operand;
    }
    
    public int getPrecedence() {
        return precedence;
    } 
    
    public int getParentPre() {
        return parent.getPrecedence();
    }

    @Override
    public <R, A> R accept(FormVisitor<R, A> visitor, A a) {
        return visitor.visit(this, a);
    }
    

}
