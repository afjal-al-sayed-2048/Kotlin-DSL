
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(ProjectDependencies.gradle)
        classpath(ProjectDependencies.kotlin_gradle_plugin)
    }
}

tasks{
    val clean by registering(Delete::class){
        delete(buildDir)
    }
}