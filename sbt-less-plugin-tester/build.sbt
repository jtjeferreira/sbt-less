import com.typesafe.sbt.web.SbtWeb

lazy val root = project.in(file(".")).addPlugins(SbtWeb)

//JsEngineKeys.engineType := JsEngineKeys.EngineType.Node

libraryDependencies += "org.webjars" % "bootstrap" % "3.0.2"

LessKeys.compress in WebKeys.Assets := false