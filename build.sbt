name := "blog"

version := "0.0.1"

scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  "org.webjars" %% "webjars-play" % "2.2.0",
  "org.webjars" % "bootstrap" % "3.0.0",
  "org.webjars" % "jquery" % "1.9.0",
  "com.typesafe.slick" % "slick_2.10" % "1.0.1",
  "org.scalatest" % "scalatest_2.10" % "2.0.M7" % "test",
  "org.seleniumhq.selenium" % "selenium-java" % "2.35.0" % "test",
  "postgresql" % "postgresql" % "9.1-901.jdbc4"
)

play.Project.playScalaSettings
