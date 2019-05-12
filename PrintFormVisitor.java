
package pkg11visitorpattern;
/**
 *
 * @author Johan Urban s1024726
 * @author Paolo Scattolin s1023775
 * @assignment 11: visitor pattern
 * @date 12/05/2019
 */
public class PrintFormVisitor implements FormVisitor<Void, Integer> {

    @Override
    public Void visit(NotForm form, Integer a) {
        String end = "";
        System.out.print("~");
        if(form.getPrecedence() > form.getParentPre()) {
            System.out.print("(");
            end = ")";
        }
        form.getOperand().accept(this, a);
        System.out.print(end);
        return null;
    }

    @Override
    public Void visit(BinOpForm form, Integer a) {
        String end = "";
        if (form.getOp().precedence < form.getParentPre()) {
            System.out.print("(");
            end = ")";
        }
            form.getLeftOp().accept(this, form.getPrecedence());
            System.out.print(form.getOp().string);
            form.getRightOp().accept(this, form.getPrecedence());
            System.out.print(end);
            return null;
    }

    @Override
    public Void visit(AtomForm form, Integer a) {
        System.out.print(form.getAtom());
    return null;    
    }

    @Override
    public Void visit(ConstantForm form, Integer a) {
    return null;    
    }
    
}
