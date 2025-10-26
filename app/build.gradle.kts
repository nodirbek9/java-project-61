plugins {
    id("java")
    application
    id("org.sonarqube") version "7.0.1.6134"
}
sonar {
    properties {
        property("sonar.projectKey", "nodirbek9_java-project-61");
        property ("sonar.organization", "nodirbek9")
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

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}
application {
    // Входная точка
    mainClass.set("hexlet.code.App")
}

tasks.test {
    useJUnitPlatform()
}