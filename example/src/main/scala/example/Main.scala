package example

import org.apache.spark.SparkContext

/**
  * Created by roshane on 5/20/2017.
  */
object Main extends App {

  println("Lists.max(List(1, 3, 2)) " + Lists.max(List(1, 3, 2)))

  println("Lists.sum(List(1, 3, 2)) " + Lists.sum(List(1, 3, 2)))

  private val context = SparkContext.getOrCreate()
  context.addFile("N:/test.txt")
  println("context.listFiles() " + context.listFiles())
}
