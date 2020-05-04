import main.scala.Lab1  
import org.scalatest._


class Lab1Tests extends FunSuite {
    test("max equal max(tailrec)") {
        val words = List[String]("test", "big", "boy", "largest")
        assert(Lab1.getMaxRec(words) === Lab1.getMaxRecTail(words))
    }

    test("return max length") {
        val words = List[String]("test", "big", "boy", "largest")
        assert(Lab1.getMaxRec(words) === 7)
    }

    test("return max length(tailrec)") {
        val words = List[String]("test", "big", "boy", "largest")
        assert(Lab1.getMaxRecTail(words) === 7)
    }

    test("decToBin equal decToBin(tailrec)") {
        val num = 259
        assert(Lab1.decToBin(num) === Lab1.decToBinTail(num))
    }

    test("return binary number") {
        val num = 259
        assert(Lab1.decToBin(num) === "100000011")
    }

    test("return binary number(tailrec)") {
        val num = 259
        assert(Lab1.decToBinTail(num) === "100000011")
    }
}