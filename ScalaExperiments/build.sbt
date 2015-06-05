lazy val root = (project in file(".")).
  settings(
    name := "ScalaExperiments",
    version := "1.0",
    scalaVersion := "2.11.6", /* Use 'scala -version' */
    EclipseKeys.withSource := true
  )

