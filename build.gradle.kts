plugins {
    kotlin("jvm") version "2.0.21"
//    kotlin("jvm") version "2.1.0"
}


val kotest = "6.0.0.M1"
//val kotest = "5.9.1"
dependencies {
    testImplementation("io.kotest:kotest-runner-junit5:${kotest}")
}

repositories {
    mavenCentral()
}


// Eclipse Temurin 21 + kotest 5.9.1 + kotlin 2.0.21 => ArrayIndexOutOfBoundsException
// Eclipse Temurin 21 + kotest 5.9.1 + kotlin 2.1.0 => ArrayIndexOutOfBoundsException
// Eclipse Temurin 21 + kotest 6.0.0.M1 + kotlin 2.1.0 => TestTimeoutException
// Eclipse Temurin 21 + kotest 6.0.0.M1 + kotlin 2.0.21=> TestTimeoutException