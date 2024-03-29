import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "play-mongo-crud"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      "org.mongodb" % "mongo-java-driver" % "2.8.0"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here      
    )

}
