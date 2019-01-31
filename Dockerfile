FROM java:8
VOLUME /tmp
ADD ./build/libs/client-demo-0.0.1-SNAPSHOT.jar app.jar
CMD java - jar /build/libs/app-0.1.0-RELEASE.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]