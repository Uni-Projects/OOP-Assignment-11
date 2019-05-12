
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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PrintFormVisitor pr = new PrintFormVisitor();
        
        //
        Form f1 = new NotForm(new BinOpForm(new AtomForm("P"), new AtomForm("Q"),
                BinOp.ImpliesOp, BinOp.Root), new AtomForm(""));
        
        Form f2 = new BinOpForm(new NotForm(new AtomForm("P"), new AtomForm("")),
                new AtomForm("Q"), BinOp.ImpliesOp, BinOp.ImpliesOp); //ImpliesOp as last argument to act as parent --> no parentheses
       
        f1.accept(pr, null);
        Map<String, Boolean> map = new HashMap();
        map.put("P", true);
        map.put("Q", false);
        EvalFromVisitor eval = new EvalFromVisitor(map);
        System.out.print("\n"+f1.accept(eval, null));
    }
    
}
