import com.typesafe.config.ConfigFactory

object TypeSafeConfig {

  //private lazy val config = ConfigFactory.load()  // Loads default application.conf
  private lazy val config = ConfigFactory.load("application.dev.conf")  // Loads default application.conf
  val host = config.getString("myapp.host")
  val port = config.getInt("myapp.port")
  val timeout = config.getInt("myapp.timeout")
}
