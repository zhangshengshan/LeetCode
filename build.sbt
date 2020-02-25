import sbtrelease.ReleasePlugin.autoImport.ReleaseTransformations._

ThisBuild / resolvers ++= Seq(
    
  Resolver.mavenLocal,
  Resolver.defaultLocal,
  "huaweicloud-maven" at  "https://repo.huaweicloud.com/repository/maven/",
  "ALIYUN OSS" at  "http://maven.aliyun.com/nexus/content/groups/public/",
  "Apache Development Snapshot Repository" at "https://repository.apache.org/content/repositories/snapshots/"
)

useGpg := true

ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/zhangshengshan/LeetCode"),
    "scm:git@github.com:zhangshengshan/LeetCode.git"
  )
)
ThisBuild / developers := List(
  Developer(
    id = "zhangshengshan",
    name = "zhangshengshan",
    email = "alphabetaog@163.com",
    url = url("http://zhangshengshan.github.io")
  )
)

ThisBuild / description := "A starter project for scala and sbt"
ThisBuild / licenses := List("Apache 2" -> new URL("http://www.apache.org/licenses/LICENSE-2.0.txt"))
ThisBuild / homepage := Some(url("https://github.com/example/project"))

ThisBuild / pomIncludeRepository := { _ => false }
ThisBuild / publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
ThisBuild / publishMavenStyle := true

name := "LeetCode"

organization := "io.github.zhangshengshan"

ThisBuild / scalaVersion := "2.11.12"

val flinkVersion = "1.5.0"

val flinkDependencies = Seq(
"org.apache.flink" %% "flink-scala" % flinkVersion % "provided",
"org.apache.flink" %% "flink-streaming-scala" % flinkVersion % "provided" ,
/*"org.scalactic" %% "scalactic" % "3.1.1",*/
"org.scalatest" %% "scalatest" % "3.1.1" % "test"
  )
lazy val root = (project in file(".")).
  settings(
    libraryDependencies ++= flinkDependencies
  )

assembly / mainClass := Some("org.example.Job")

// make run command include the provided dependencies
Compile / run := Defaults.runTask(Compile / fullClasspath,
  Compile / run / mainClass,
  Compile / run / runner
).evaluated

// stays inside the sbt console when we press "ctrl-c" while a Flink programme executes with "run" or "runMain"
Compile / run / fork := true
Global / cancelable := true

// exclude Scala library from assembly
assembly / assemblyOption := (assembly / assemblyOption).value.copy(includeScala = false)

releaseProcess := Seq[ReleaseStep](
//  TODO
  checkSnapshotDependencies,              // : ReleaseStep
  inquireVersions, // : ReleaseStep
  /*runClean,                               // : ReleaseStep*/
  /*runTest,                                // : ReleaseStep*/
  setReleaseVersion, // : ReleaseStep
  commitReleaseVersion, // : ReleaseStep, performs the initial git checks
  tagRelease, // : ReleaseStep
//  TODO
  publishArtifacts,                       // : ReleaseStep, checks whether `publishTo` is properly set up*/
  setNextVersion, // : ReleaseStep
  commitNextVersion, // : ReleaseStep
  pushChanges // : ReleaseStep, also checks that an upstream branch is properly configured
)
