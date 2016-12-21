
lazy val commonSettings = Seq(
  name := "FinanceWatcher",

  version := "1.0",

  scalaVersion := "2.11.8",

  libraryDependencies ++= Seq(
    "org.mongodb" %% "casbah" % "3.1.1",
    "org.json4s" %% "json4s-jackson" % "3.4.2",
    "org.mongodb" % "bson" % "3.2.2",
    "joda-time" % "joda-time" % "2.9.6"
  )
)

lazy val core = (project in file("core"))
  .settings(commonSettings: _*).enablePlugins(PlayScala).settings(
  name := "core"
)
    