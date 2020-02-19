/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn how to create Gradle builds at https://guides.gradle.org/creating-new-gradle-builds
 */

/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Scala library project to get you started.
 * For more details take a look at the Scala plugin chapter in the Gradle
 * User Manual available at https://docs.gradle.org/6.1/userguide/scala_plugin.html
 */

plugins {
    // Apply the scala plugin to add support for Scala
    scala

    // Apply the java-library plugin for API and implementation separation.
    application
}

repositories {
    // Use jcenter for resolving dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
}

application {
    // Define the main class for the application.
    mainClassName = "spark.App"
}

dependencies {

    // Use Scala 2.12 in our library project
    implementation("org.scala-lang:scala-library:2.11.10")

    implementation("org.apache.spark:spark-core_2.11:2.1.0")
	implementation("org.apache.spark:spark-sql_2.11:2.1.0")
	implementation("org.apache.spark:spark-hive_2.11:2.1.0")

    implementation("org.scala-lang:scala-xml:2.11.0-M4")

    // Use Scalatest for testing our library
    testImplementation("junit:junit:4.12")
    testImplementation("org.scalatest:scalatest_2.11:3.0.8")

    // Need scala-xml at test runtime
    testRuntimeOnly("org.scala-lang.modules:scala-xml_2.11:1.2.0")
}