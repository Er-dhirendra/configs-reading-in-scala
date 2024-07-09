import java.io.FileInputStream
import java.util.Properties

object JavaPropertiesConfig {
  lazy private val prop = new Properties()
  prop.load(new FileInputStream("src/main/resources/application.properties"))

  val host = prop.getProperty("myapp.host")
  val port = prop.getProperty("myapp.port").toInt
  val timeout = prop.getProperty("myapp.timeout").toInt
}
