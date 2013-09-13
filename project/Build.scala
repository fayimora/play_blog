import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "blog"
  val appVersion      = "0.0.1" // => use semantic versioning

  val appDependencies = Seq(
    jdbc,
    "org.webjars" %% "webjars-play" % "2.1.0-3",
    "org.webjars" % "bootstrap" % "3.0.0",
    "com.typesafe.slick" % "slick_2.10" % "1.0.1",
    "postgresql" % "postgresql" % "9.1-901.jdbc4"
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    scalaVersion := "2.10.2"
  )

}
