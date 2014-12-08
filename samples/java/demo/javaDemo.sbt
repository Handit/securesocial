import play.Project._

name    := "java-demo"

version := Common.version

libraryDependencies ++= Seq("br.com.handit" %% "securesocial" % version.value, javaCore)

resolvers += Resolver.mavenLocal

resolvers += Resolver.sonatypeRepo("snapshots")

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += Resolver.url(
   "bintray-sbt-plugin-releases",
   url("http://dl.bintray.com/content/sbt/sbt-plugin-releases")
  )(Resolver.ivyStylePatterns)

licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

playJavaSettings
