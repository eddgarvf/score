# Score computing

command line utility that will compute a score for a list of first names.

#Specification

The list of names will be provided as a text file. The full path to the names file will be specified as a
command line argument. The names file will contain a single line of quoted, comma-separated names. A
small sample of data can be found at the end of this document and a full sample file (names.txt) is
attached.
To score a list of names, you must sort it alphabetically and sum the individual scores for all the names.
To score a name, sum the alphabetical value of each letter (A=1, B=2, C=3, etc...) and multiply the sum
by the name’s position in the list (1-based).

#How to run the project

####IntelliJ
Run the SpringBoot Application
####Command Line
java -jar target/score-0.0.1-SNAPSHOT.jar
####Maven
mvn spring-boot:run

#How does it look

/Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/bin/java -XX:TieredStopAtLevel=1 -noverify -Dspring.output.ansi.enabled=always -Dcom.sun.management.jmxremote -Dspring.jmx.enabled=true -Dspring.liveBeansView.mbeanDomain -Dspring.application.admin.enabled=true "-javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=62441:/Applications/IntelliJ IDEA.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath "/Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/lib/ext/jaccess.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/lib/tools.jar:/Users/eddgarvf/Desktop/eddgarvf Mac IBM-Acoustic/theOcc/score/target/classes:/Users/eddgarvf/.m2/repository/org/springframework/boot/spring-boot-starter/2.2.1.RELEASE/spring-boot-starter-2.2.1.RELEASE.jar:/Users/eddgarvf/.m2/repository/org/springframework/boot/spring-boot/2.2.1.RELEASE/spring-boot-2.2.1.RELEASE.jar:/Users/eddgarvf/.m2/repository/org/springframework/spring-context/5.2.1.RELEASE/spring-context-5.2.1.RELEASE.jar:/Users/eddgarvf/.m2/repository/org/springframework/spring-aop/5.2.1.RELEASE/spring-aop-5.2.1.RELEASE.jar:/Users/eddgarvf/.m2/repository/org/springframework/spring-beans/5.2.1.RELEASE/spring-beans-5.2.1.RELEASE.jar:/Users/eddgarvf/.m2/repository/org/springframework/spring-expression/5.2.1.RELEASE/spring-expression-5.2.1.RELEASE.jar:/Users/eddgarvf/.m2/repository/org/springframework/boot/spring-boot-autoconfigure/2.2.1.RELEASE/spring-boot-autoconfigure-2.2.1.RELEASE.jar:/Users/eddgarvf/.m2/repository/org/springframework/boot/spring-boot-starter-logging/2.2.1.RELEASE/spring-boot-starter-logging-2.2.1.RELEASE.jar:/Users/eddgarvf/.m2/repository/ch/qos/logback/logback-classic/1.2.3/logback-classic-1.2.3.jar:/Users/eddgarvf/.m2/repository/ch/qos/logback/logback-core/1.2.3/logback-core-1.2.3.jar:/Users/eddgarvf/.m2/repository/org/apache/logging/log4j/log4j-to-slf4j/2.12.1/log4j-to-slf4j-2.12.1.jar:/Users/eddgarvf/.m2/repository/org/apache/logging/log4j/log4j-api/2.12.1/log4j-api-2.12.1.jar:/Users/eddgarvf/.m2/repository/org/slf4j/jul-to-slf4j/1.7.29/jul-to-slf4j-1.7.29.jar:/Users/eddgarvf/.m2/repository/jakarta/annotation/jakarta.annotation-api/1.3.5/jakarta.annotation-api-1.3.5.jar:/Users/eddgarvf/.m2/repository/org/springframework/spring-core/5.2.1.RELEASE/spring-core-5.2.1.RELEASE.jar:/Users/eddgarvf/.m2/repository/org/springframework/spring-jcl/5.2.1.RELEASE/spring-jcl-5.2.1.RELEASE.jar:/Users/eddgarvf/.m2/repository/org/yaml/snakeyaml/1.25/snakeyaml-1.25.jar:/Users/eddgarvf/.m2/repository/org/slf4j/slf4j-api/1.7.29/slf4j-api-1.7.29.jar" com.eddgarvf.score.ScoreApplication
Picked up JAVA_TOOL_OPTIONS: -Dfile.encoding=UTF-8 -Djavax.net.ssl.trustStore=/Users/eddgarvf/.security/cacerts

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.2.1.RELEASE)

2019-11-19 14:41:07.625  INFO 6340 --- [           main] com.eddgarvf.score.ScoreApplication      : Starting ScoreApplication on macbook-pro-4.usca.ibm.com with PID 6340 (started by eddgarvf in /Users/eddgarvf/Desktop/eddgarvf Mac IBM-Acoustic/theOcc/score)
2019-11-19 14:41:07.629  INFO 6340 --- [           main] com.eddgarvf.score.ScoreApplication      : No active profile set, falling back to default profiles: default
2019-11-19 14:41:08.084  INFO 6340 --- [           main] com.eddgarvf.score.ScoreApplication      : Started ScoreApplication in 0.823 seconds (JVM running for 1.482)
Provide the file path to be computed: 
/Users/eddgarvf/Desktop/eddgarvf Mac IBM-Acoustic/theOcc/score/src/main/resources/files/OCC Take Home Coding names.txt
Computed File Result: 871198282

Process finished with exit code 0