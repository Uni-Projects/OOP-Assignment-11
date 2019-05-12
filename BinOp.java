
package pkg11visitorpattern;

import java.util.function.BinaryOperator;

/**
 *
 * @author Johan Urban s1024726
 * @author Paolo Scattolin s1023775
 * @assignment 11: visitor pattern
 * @date 12/05/2019
 */
public enum BinOp implements BinaryOperator<Boolean> {
    
        AndOp ("/\\", (a1, a2) -> a1 && a2, 2),
        OrOp ("\\/", (a1, a2) -> a1 || a2, 3),
        ImpliesOp ("=>", (a1, a2) -> !a1 || a2, 4),
        Root ("", (a1, a2) -> a1, 10); //for the starting node
        
        public final String string;
        private final BinaryOperator<Boolean> opStrategy;
        public final int precedence;
        
        private BinOp (String string, BinaryOperator<Boolean> binOp,
                int precedence) {
            this.string = string;
            this.opStrategy = binOp;
            this.precedence = precedence;
        }
        
        
        
       @Override
       public Boolean apply(Boolean a1, Boolean a2) {
           return opStrategy.apply(a1, a2);
       }
}
