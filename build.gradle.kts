val versionKotlin: String by project
val versionKtor: String by project
val versionLogback: String by project
val versionApp: String by project

// Note: The `plugins` block is the newer method of applying plugins, but in order to be able to add a plugin
// via this mechanism they must be available on the Gradle Plugin Repository: http://plugins.gradle.org/
// where possible, plugins should be added via this section
plugins {
    application
    kotlin("jvm") version "1.4.10"
}

group = "com.technical"
version = versionApp
application {
    mainClassName = "io.ktor.server.jetty.EngineMain"
}

repositories {
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$versionKotlin")

    implementation("io.ktor:ktor-server-jetty:$versionKtor")
    implementation("ch.qos.logback:logback-classic:$versionLogback")

    // issuing our own JWT tokens
    implementation("io.ktor:ktor-auth:$versionKtor")
    implementation("io.ktor:ktor-auth-jwt:$versionKtor")

    testImplementation("io.ktor:ktor-server-tests:$versionKtor")
}

kotlin.sourceSets["main"].kotlin.srcDirs("src")
kotlin.sourceSets["test"].kotlin.srcDirs("test")

sourceSets["main"].resources.srcDirs("resources")
sourceSets["test"].resources.srcDirs("testresources")