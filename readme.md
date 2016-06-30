# WolkRest

REST library written to be used in android applications for WolkAbout Smart IoT Cloud.
This version requires Android Annotations 4.0.0

You can import it in your project using gradle or maven configurations below.

Gradle
------

```sh
repositories {
    maven {
        url  "http://dl.bintray.com/wolkabout/maven"
    }
}

dependencies {
    compile 'com.wolkabout:restandroid:1.0.0'
}
```
Maven
-----
```sh
<repository>
    <id>bintray-wolkabout-WolkConnector</id>
    <name>bintray</name>
    <url>http://dl.bintray.com/wolkabout/maven</url>
</repository>

<dependency>
  <groupId>com.wolkabout</groupId>
  <artifactId>restandroid</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```