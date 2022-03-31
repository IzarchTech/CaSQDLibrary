plugins {
    kotlin("jvm") version "1.6.10"
    `java-library`
}

group = "tech.izarch"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    api("org.apache.commons:commons-math3:3.6.1")
    implementation("com.google.guava:guava:31.1-jre")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}