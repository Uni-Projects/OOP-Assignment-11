
package pkg11visitorpattern;

/**
 *
 * @author Johan Urban s1024726
 * @author Paolo Scattolin s1023775
 * @assignment 11: visitor pattern
 * @date 12/05/2019
 */
public class AtomForm implements Form {
    private String atom;
    
    public AtomForm(String atom) {
        this.atom = atom;
    }
    
    public String getAtom() {
        return atom;
    }

    @Override
    public <R, A> R accept(FormVisitor<R, A> visitor, A a) {
        return visitor.visit(this, a);
    }

    @Override
    public int getPrecedence() {
        return 10;
    }
}
