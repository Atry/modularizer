enablePlugins(SbtWeb)

enablePlugins(SbtSassify)

enablePlugins(WebScalaJSBundlerPlugin)

lazy val js = project

scalaJSProjects += js

pipelineStages in Assets += scalaJSPipeline

libraryDependencies += "org.webjars" % "bootstrap" % "4.3.1"

libraryDependencies += "org.webjars" % "jquery" % "3.3.1-2"

libraryDependencies += "org.webjars" % "popper.js" % "1.14.7"

ThisBuild / organization := "com.thoughtworks.modularizer"
