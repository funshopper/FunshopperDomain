FROM openjdk:8-jdk
RUN mkdir /funshopperdomain 
COPY . /funshopperdomain
RUN ["/funshopperdomain/gradlew","build"]
ENTRYPOINT ["java", "-jar", "/funshopperdomain/build/libs/FunshopperDomain.jar"]