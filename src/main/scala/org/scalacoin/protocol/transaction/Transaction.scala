package org.scalacoin.protocol.transaction

import org.scalacoin.currency.Satoshis
import org.scalacoin.protocol.{NetworkVarInt, VarInt}

/**
 * Created by chris on 7/14/15.
 */


trait Transaction {
  def txId : String
  def version : Long
  def inputs  : Seq[TransactionInput]
  def outputs : Seq[TransactionOutput]
  def lockTime : Long
}

case class TransactionImpl(txId : String, version : Long, inputs : Seq[TransactionInput],
  outputs : Seq[TransactionOutput], lockTime : Long) extends Transaction










