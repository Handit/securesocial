name := "SecureSocial-parent"

version := Common.version

scalaVersion := "2.10.0"

lazy val core =  project.in( file("module-code") )

lazy val scalaDemo = project.in( file("samples/scala/demo") ).dependsOn(core)

lazy val javaDemo = project.in( file("samples/java/demo") ).dependsOn(core)

lazy val root = project.in( file(".") ).aggregate(core, scalaDemo, javaDemo) .settings(
     aggregate in update := false
   )
