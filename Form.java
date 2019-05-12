
package pkg11visitorpattern;

/**
 *
 * @author Johan Urban s1024726
 * @author Paolo Scattolin s1023775
 * @assignment 11: visitor pattern
 * @date 12/05/2019
 */
public interface Form {
    public <R, A> R accept(FormVisitor<R, A> visitor, A a);
    public int getPrecedence();
}
