package main.scala

import scala.annotation.tailrec

object Lab1 {
  def main(args: Array[String]) {
    val words = List[String]("test", "big", "boy", "largest")
    println(getMaxRec(words))
    println(getMaxRecTail(words))

    val num = 9
    println(decToBin(num))
    println(decToBinTail(num))
  }

  def getMaxRec(words: List[String]): Int = {
        def search(words: List[String], idx: Int): Int = {
            idx match {
                case 0 => words(idx).length
                case _ => words(idx).length.max(search(words, idx - 1))
            }
        }
        search(words, words.length - 1)
  }

  def getMaxRecTail(words: List[String]): Int = {
        @tailrec
        def search(words: List[String], idx: Int, best: Int): Int = {
            idx match {
                case 0 => words(idx).length.max(best)
                case _ => search(words, idx - 1, words(idx).length.max(best))
            }
        }
        search(words, words.length - 1, 0)
  }

  def decToBin(num: Int): String = {
        def convert(num: Int): String = {
            num match {
                case 0 => ""
                case _ => convert(num / 2) + num % 2
            }
        }
        convert(num)
  }

  def decToBinTail(num: Int): String = {
        def convert(num: Int, accum: String): String = {
            num match {
                case 0 => accum
                case _ => convert(num / 2, num % 2 + accum)
            }
        }
        convert(num, "")
  }
}