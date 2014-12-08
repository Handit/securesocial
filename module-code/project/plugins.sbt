// Comment to get more information during initialization
// logLevel := Level.Warn

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += Resolver.url(
   "bintray-sbt-plugin-releases",
   url("http://dl.bintray.com/content/sbt/sbt-plugin-releases")
  )(Resolver.ivyStylePatterns)

resolvers += Resolver.mavenLocal

addSbtPlugin("me.lessis" % "bintray-sbt" % "0.1.2")

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % Option(System.getProperty("play.version")).getOrElse("2.2.2"))

// PGP signing
// addSbtPlugin("com.typesafe.sbt" % "sbt-pgp" % "0.8")
