plugins {
    id("java")
}

group = "luna.selenium"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.seleniumhq.selenium:selenium-java:4.38.0")
    testImplementation("io.github.bonigarcia:webdrivermanager:6.3.3")
    testImplementation("org.hamcrest:hamcrest:3.0")
}

tasks.test {
    useJUnitPlatform()
}