
lazy val commonSettings = Seq(
  name := "FinanceWatcher",

  version := "1.0",

  scalaVersion := "2.11.8",

  libraryDependencies ++= Seq(
    "org.mongodb" %% "casbah" % "3.1.1",
    "org.mongodb" % "bson" % "3.2.2"
  )
)

lazy val core = (project in file("core")).settings(commonSettings: _*).settings(
  name := "core"
)
    