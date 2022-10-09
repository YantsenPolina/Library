ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion     := "3.2.0"
ThisBuild / organization     := "com.polinayantsen"
ThisBuild / organizationName := "library"

val zioVersion = "2.0.2"

lazy val root = (project in file("."))
  .settings(
    name := "library",
    libraryDependencies ++= Seq (
      "dev.zio" %% "zio" % zioVersion,
    )
  )
