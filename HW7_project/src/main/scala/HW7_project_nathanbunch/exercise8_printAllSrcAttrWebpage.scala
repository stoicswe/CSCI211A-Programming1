package HW7_project_nathanbunch

import scala.io.Source
import scala.io.StdIn

object exercise8_printAllSrcAttrWebpage extends App{

  while(true) {
    print("Enter a URL (copy and paste from web browser): ")
    var url = StdIn.readLine()
    var source = ""
    source = Source.fromURL(url, "UTF-8").getLines.mkString("\n")
    println(imgSrc(source))
  }

  def imgSrc(content: String) = {
    val src = """(?s)<img\s[^>]*?src\s*=\s*['\"]([^'\"]*?)['\"][^>]*?>""".r
    src findAllMatchIn content map (_.group(1)) toList
  }
}
