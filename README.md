Log4J extras
===
[ ![Download](https://api.bintray.com/packages/obsidiandynamics/log4j-extras/log4jextras-json/images/download.svg) ](https://bintray.com/obsidiandynamics/log4j-extras/log4jextras-json/_latestVersion)

Log4J addons/modules comprising:

* [`log4jextras-json`](https://github.com/obsidiandynamics/log4j-extras/tree/master/json) - JSON layout
* [`log4jextras-splunk`](https://github.com/obsidiandynamics/log4j-extras/tree/master/splunk) - Splunk HEC appender

# Getting started
Select just the module(s) that you need from the list above.

The builds are hosted on JCenter. (Maven users may need to add the JCenter repository to their POM.) Simply add the following snippet to your build file. Replace the version placeholder `x.y.z` in the snippet with the version shown on the Download badge at the top of this README, and `log4jextras-module` with the name of the actual module you need.

For Maven:

```xml
<dependency>
  <groupId>com.obsidiandynamics.log4jextras</groupId>
  <artifactId>log4jextras-module</artifactId>
  <version>x.y.z</version>
  <type>pom</type>
</dependency>
```

For Gradle:

```groovy
compile 'com.obsidiandynamics.log4jextras:log4jextras-module:x.y.z'
```
