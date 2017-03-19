name := "$project_name$"
organization := "$organization$"
scalaVersion := "$scala_version$"

enablePlugins(JavaAppPackaging)
enablePlugins(DockerPlugin)
dockerBaseImage := "java:openjdk-8-jre"
dockerRepository := Some("$docker_repository$")
