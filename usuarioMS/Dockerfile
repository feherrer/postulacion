FROM openjdk:11
RUN mkdir -p /usr/src/usuarioms
COPY /target/UsuarioPY-0.0.1-SNAPSHOT.jar /usr/src/usuarioms
WORKDIR /usr/src/usuarioms
EXPOSE 8076
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Duser.timezone=EC", "-jar", "UsuarioMS-0.0.1-SNAPSHOT.jar"]