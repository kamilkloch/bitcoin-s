package org.scalacoin.script.control

import org.scalacoin.script.constant.{ScriptTrue, ScriptConstantImpl, ScriptToken}

/**
 * Created by chris on 1/6/16.
 */
trait ControlOperationsInterpreter {


  /**
   * Marks transaction as invalid if top stack value is not true.
   * @param stack
   * @param script
   * @return
   */
  def verify(stack : List[ScriptToken], script : List[ScriptToken]) : (List[ScriptToken],List[ScriptToken],Boolean) = {
    require(stack.size > 0, "Stack must not be empty to verify it")
    require(script.headOption.isDefined && script.head == OP_VERIFY, "Top of script stack must be OP_VERIFY")
    if (stack.head == ScriptTrue) (stack.tail,script.tail,true) else (stack.tail,script.tail,false)
  }
}
