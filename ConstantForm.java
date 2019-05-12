
package pkg11visitorpattern;

/**
 *
 * @author Johan Urban s1024726
 * @author Paolo Scattolin s1023775
 * @assignment 11: visitor pattern
 * @date 12/05/2019
 */
public class ConstantForm implements Form{
    private Constant constant;

    @Override
    public <R, A> R accept(FormVisitor<R, A> visitor, A a) {
       return visitor.visit(this, a);
    }

    @Override
    public int getPrecedence() {
        return 10;
    }
    
    public boolean getConst() {
        return constant.val;
    }

    
    public enum Constant {
        False ("F", false),
        True  ("True", true);
        
        public final String string;
        private final Boolean val;
        
        private Constant(String string, Boolean val) {
            this.string = string;
            this.val = val;
        }
    }
}
