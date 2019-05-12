/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11visitorpattern;

/**
 *
 * @author jubi
 */
public interface FormVisitor<Result, AdditionalArg> {
    Result visit(NotForm form, AdditionalArg a);
    Result visit(BinOpForm form, AdditionalArg a);
    Result visit(AtomForm form, AdditionalArg a);
    Result visit(ConstantForm form, AdditionalArg a);
}
