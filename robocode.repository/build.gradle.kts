plugins {
    id("net.sf.robocode.java-conventions")
    `java-library`
}

dependencies {
    implementation(project(":robocode.api"))
    implementation(project(":robocode.core"))
    implementation(project(":robocode.host"))
    implementation(libs.picocontainer)
}

description = "Robocode Repository"

tasks {
    javadoc {
        source = sourceSets["main"].java
        include("net/sf/robocode/repository/Module.java")
    }

    jar {
        dependsOn(javadoc)
    }
}