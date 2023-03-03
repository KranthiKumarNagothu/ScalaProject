object AnonymousFunction {
  def main(args:Array[String]): Unit={
    val p=(i:Int)=>{
      println("Hello")
      i
    }
    println((p(10)))
  }

}