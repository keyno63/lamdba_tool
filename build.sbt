import sbt._
import sbt.Keys._

lazy val lamdba_tool = (project in file("."))
  .enablePlugins(JavaAppPackaging)
  .settings(
    name := "lamdba_tool",
    libraryDependencies ++= jsonModule
  )

val versions = Map(
  "circe" -> "0.12.1",
)

val jsonModule = Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser",
).map(_ % versions("circe")) :+
  ("com.dripower" %% "play-circe" % "2712.0")