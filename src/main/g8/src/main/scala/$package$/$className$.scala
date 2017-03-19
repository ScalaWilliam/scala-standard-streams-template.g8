package $package$

import scala.io.StdIn

object $className$ extends App {

  /**
    * @see http://www.scalawilliam.com/most-important-streaming-abstraction/
    ***/
  object WordCount {
    def wordsInLine(line: String): WordCount = {
      line.split("\\s+").length
    }
    type WordCount = Int
    def initial: WordCount = 0
    def scan(totalWords: WordCount, newWords: WordCount): WordCount = {
      totalWords + newWords
    }
  }

  Iterator
    .continually(StdIn.readLine())
    .takeWhile(_ != null)
    .takeWhile(_ => !System.out.checkError())
    .map(WordCount.wordsInLine)
    .scanLeft(WordCount.initial)(WordCount.scan)
    .map(_.toString)
    .foreach(System.out.println)
}
