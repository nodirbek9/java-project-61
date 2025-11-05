plugins {
    checkstyle
    application
    id("org.sonarqube") version "7.0.1.6134"
}

checkstyle {
    toolVersion = "10.12.4"
    configFile = file("/java-project-61/config/checkstyle/checkstyle.xml")
}

sonar {
    properties {
        property("sonar.projectKey", "nodirbek9_java-project-61");
        property("sonar.organization", "nodirbek9")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}
tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    // Входная точка
    mainClass.set("hexlet.code.App")
}