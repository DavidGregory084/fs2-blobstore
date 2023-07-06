name := "s3"

val fs2Version = "2.5.11"
val awsVersion = "2.20.95"

libraryDependencies ++= Seq(
  "software.amazon.awssdk" % "s3"                        % awsVersion,
  "co.fs2"                %% "fs2-reactive-streams"      % fs2Version,
  "software.amazon.awssdk" % "s3-transfer-manager"       % awsVersion % Test,
  "com.dimafeng"          %% "testcontainers-scala-core" % "0.40.17"          % Test
)
