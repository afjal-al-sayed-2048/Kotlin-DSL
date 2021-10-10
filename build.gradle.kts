

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.0.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.21")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}


/*plugins{
    `kotlin-dsl`
}*/

/*task clean(type: Delete) {
    delete rootProject.buildDir
}*/

tasks{
    val clean by registering(Delete::class){
        delete(buildDir)
    }
}