enablePlugins(SbtWeb)

enablePlugins(SbtSassify)

enablePlugins(WebScalaJSBundlerPlugin)

lazy val js = project

scalaJSProjects += js

pipelineStages in Assets += scalaJSPipeline

libraryDependencies += "org.webjars" % "bootstrap" % "4.3.1"

libraryDependencies += "org.webjars" % "jquery" % "3.3.1-2"

libraryDependencies += "org.webjars" % "popper.js" % "1.14.7"

libraryDependencies += "org.webjars" % "font-awesome" % "5.8.1"

libraryDependencies += "com.typesafe.akka" %% "akka-http" % "10.1.8"

libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.5.21"

libraryDependencies += "org.rogach" %% "scallop" % "3.2.0"

libraryDependencies += "io.github.lhotari" %% "akka-http-health" % "1.0.8"

libraryDependencies += "org.webjars" % "webjars-locator" % "0.36"

libraryDependencies += "com.thoughtworks.akka-http-webjars" %% "akka-http-webjars" % "1.0.0+95-97299c01"

libraryDependencies += "org.eclipse.jgit" % "org.eclipse.jgit" % "5.3.0.201903130848-r"

libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"

addCompilerPlugin("com.thoughtworks.dsl" %% "compilerplugins-bangnotation" % "1.1.1")

addCompilerPlugin("com.thoughtworks.dsl" %% "compilerplugins-reseteverywhere" % "1.1.1")

libraryDependencies += "com.thoughtworks.dsl" %% "keywords-await" % "1.1.1"

libraryDependencies += "com.thoughtworks.dsl" %% "keywords-catch" % "1.1.1"

libraryDependencies += "com.thoughtworks.dsl" %% "keywords-using" % "1.1.1"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)

ThisBuild / organization := "com.thoughtworks.modularizer"

fork := true

reStart / aggregate := false
