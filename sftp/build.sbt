name := "sftp"

libraryDependencies ++= Seq(
  "com.github.mwiede" % "jsch"                      % "0.2.6",
  "com.dimafeng"     %% "testcontainers-scala-core" % "0.40.12" % Test
)
