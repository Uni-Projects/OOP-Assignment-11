package pkg11visitorpattern;

import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author Johan Urban s1024726
 * @author Paolo Scattolin s1023775
 * @assignment 11: visitor pattern
 * @date 12/05/2019
 */
public class EvalFromVisitor implements FormVisitor<Boolean, Void> {
    
    Map<String, Boolean> map;
    
    public EvalFromVisitor (Map<String, Boolean> map) {
        this.map = map;
    }
    
    @Override
    public Boolean visit(NotForm form, Void a) {
        return !form.getOperand().accept(this, a);
    }

    @Override
    public Boolean visit(BinOpForm form, Void a) {
        return form.getOp().apply(form.getLeftOp().accept(this, a), form.getRightOp().accept(this, a));
    }

    @Override
    public Boolean visit(AtomForm form, Void a) {
        return map.get(form.getAtom());
    }

    @Override
    public Boolean visit(ConstantForm form, Void a) {
        return form.getConst();
    }
    
}
