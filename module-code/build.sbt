import play.Project._
import bintray.Keys._

sbtPlugin := true

name := "SecureSocial"

version := Common.version

libraryDependencies ++= Seq(
  cache,
  "com.typesafe" %% "play-plugins-util" % "2.2.0",
  "com.typesafe" %% "play-plugins-mailer" % "2.2.0",
  "org.mindrot" % "jbcrypt" % "0.3m",
  "org.specs2" %% "specs2" % "2.3.7" % "test",
  "org.mockito" % "mockito-all" % "1.9.5"%"test"
)

resolvers ++= Seq(
  Resolver.mavenLocal,
  Resolver.typesafeRepo("releases")
)

organization := "br.com.handit"

organizationName := "Handit"

organizationHomepage := Some(new URL("http://www.securesocial.ws"))

crossPaths := false

publishMavenStyle := false

bintrayPublishSettings

repository in bintray := "sbt-plugins"

bintrayOrganization in bintray := None

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

startYear := Some(2012)

description := "An authentication module for Play Framework applications supporting OAuth, OAuth2, OpenID, Username/Password and custom authentication schemes."

licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

homepage := Some(url("http://www.securesocial.ws"))

pomExtra := (
  <scm>
    <url>https://github.com/jaliss/securesocial</url>
    <connection>scm:git:git@github.com:jaliss/securesocial.git</connection>
    <developerConnection>scm:git:https://github.com/jaliss/securesocial.git</developerConnection>
  </scm>
  <developers>
    <developer>
      <id>jaliss</id>
      <name>Jorge Aliss</name>
      <email>jaliss [at] gmail.com</email>
      <url>https://twitter.com/jaliss</url>
    </developer>
  </developers>
)

scalacOptions := Seq("-feature", "-deprecation")

playScalaSettings
