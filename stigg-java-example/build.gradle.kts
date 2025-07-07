plugins {
    id("stigg.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":stigg-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    mainClass = "com.stigg.api.example.Main"
}
