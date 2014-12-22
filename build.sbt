import SonatypeKeys._

sonatypeSettings

name := "reactive-rabbit"

version := "0.2.1"

organization := "io.scalac"

startYear := Some(2014)

licenses := Seq("Apache License 2.0" -> url("http://opensource.org/licenses/Apache-2.0"))

homepage := Some(url("https://github.com/ScalaConsultants/reactive-rabbit"))

scalaVersion := "2.11.4"

crossScalaVersions := Seq("2.10.4")

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-Xfatal-warnings", "-target:jvm-1.7")

libraryDependencies ++= Seq(
  "org.reactivestreams" % "reactive-streams" % "0.4.0",
  "com.rabbitmq" % "amqp-client" % "3.4.1",
  "org.scala-stm" %% "scala-stm" % "0.7",
  "com.typesafe" % "config" % "1.2.1",               // Configuration
  "joda-time" % "joda-time" % "2.5",                 // for DateTime
  "org.joda" % "joda-convert" % "1.7",
  "com.typesafe.akka" %% "akka-actor" % "2.3.7",     // for ByteString
  "com.google.guava" % "guava" % "18.0",             // for MediaType
  "com.google.code.findbugs" % "jsr305" % "3.0.0",
  "org.scalatest" %% "scalatest" % "2.2.1" % "test", // for TCK
  "com.google.inject" % "guice" % "3.0" % "test",    // to make sbt happy
  "org.reactivestreams" % "reactive-streams-tck" % "0.4.0" % "test",
  "com.typesafe.akka" %% "akka-stream-experimental" % "0.11" % "test"
)

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

pomIncludeRepository := {
  x ⇒ false
}

pomExtra := (
  <scm>
    <url>git@github.com:ScalaConsultants/reactive-rabbit.git</url>
    <connection>scm:git:git@github.com:ScalaConsultants/reactive-rabbit.git</connection>
  </scm>
  <developers>
    <developer>
      <id>mkiedys</id>
      <name>Michał Kiędyś</name>
      <url>https://twitter.com/mkiedys</url>
    </developer>
  </developers>
)
