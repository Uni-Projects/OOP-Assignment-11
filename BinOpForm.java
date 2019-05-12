
package pkg11visitorpattern;

import java.util.function.BinaryOperator;
import java.lang.Integer;

/**
 *
 * @author Johan Urban s1024726
 * @author Paolo Scattolin s1023775
 * @assignment 11: visitor pattern
 * @date 12/05/2019
 */
public class BinOpForm implements Form {
    private BinOp op;
    private Form leftOperand;
    private Form rightOperand;
    private BinOp parent;
    
    
    public BinOpForm(Form left, Form right, BinOp op, BinOp parent) {
        this.op = op;
        this.leftOperand = left;
        this.rightOperand = right;
        this.parent = parent;
    }    

    @Override
    public <R, A> R accept(FormVisitor<R, A> visitor, A a) {
        return visitor.visit(this, a);
    }
    
    public BinOp getOp() {
        return op;
    }
    
    public Form getLeftOp() {
        return leftOperand;
    }   
    
    public Form getRightOp() {
        return rightOperand;
    }
    
    public int getParentPre() {
        return parent.precedence;
    }

    @Override
    public int getPrecedence() {
        return op.precedence;
    }
}
