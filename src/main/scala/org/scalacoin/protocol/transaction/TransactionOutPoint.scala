package org.scalacoin.protocol.transaction

/**
 * Created by chris on 12/26/15.
 */
trait TransactionOutPoint {
  def hash : Seq[Char]
  def index : Long
}

case class TransactionOutPointImpl(hash : Seq[Char], index : Long) extends TransactionOutPoint