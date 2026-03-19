plugins {
    java
    id("io.github.reyerizo.gradle.jcstress") version "0.9.0"
}

repositories {
    mavenCentral()
}

dependencies {
    jcstress("org.openjdk.jcstress:jcstress-core:0.15")
}
