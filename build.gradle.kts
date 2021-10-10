
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Project.gradle)
        classpath(Project.kotlin_gradle_plugin)
    }
}

tasks{
    val clean by registering(Delete::class){
        delete(buildDir)
    }
}