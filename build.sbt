ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.1"

lazy val root = (project in file("."))
  .settings(
    name := "ScalaProjects"
  )

libraryDependencies += "com.mysql" % "mysql-connector-j" % "8.1.0"
libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.33"