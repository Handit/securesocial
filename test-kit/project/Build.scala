import sbt._
import Keys._

object ApplicationBuild extends Build {

    val appName         = "securesocial-testkit"
    val appVersion      = "master-play-2.2.x"
    val appOrganization    = "br.com.handit"
    val dependencies = Seq(
	    "br.com.handit" %% "securesocial" % "master-play-2.2.x",
      "org.scalacheck" %% "scalacheck" % "1.11.1",
      "com.typesafe.play" %% "play-test" % "2.2.0",
      "org.mockito" % "mockito-all" % "1.9.5"
  )
    val main = sbt.Project(appName, file(".") ).settings(
      resolvers += Resolver.sonatypeRepo("snapshots")
    , libraryDependencies ++= dependencies
    , version := appVersion
    , organization := appOrganization
    )
}
