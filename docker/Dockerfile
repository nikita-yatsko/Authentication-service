FROM eclipse-temurin:21-jre

WORKDIR /srv

COPY target/*.jar .
COPY docker/auth-service.sh .

RUN chmod +x auth-service.sh

EXPOSE 8081

ENTRYPOINT ["./auth-service.sh"]