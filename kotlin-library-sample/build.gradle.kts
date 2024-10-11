plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
    //id("cn.dorck.component.publisher")
    id("fiks-publish")
}

publishOptions {
    group = "com.fotile.fiks"
    artifactId = "kotlin-library-sample"
    version = "1.0.0-SNAPSHOT"
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}