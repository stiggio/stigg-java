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
    // Use `./gradlew :stigg-java-example:run` to run `Main`
    // Use `./gradlew :stigg-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.stigg.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
