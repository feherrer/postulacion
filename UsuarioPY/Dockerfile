FROM openjdk:11
RUN mkdir -p /usr/src/usuariopy
COPY /target/UsuarioPY-0.0.1-SNAPSHOT.jar /usr/src/usuariopy
WORKDIR /usr/src/usuariopy
EXPOSE 8076
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Duser.timezone=EC", "-jar", "UsuarioPY-0.0.1-SNAPSHOT.jar"]