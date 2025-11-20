#!/usr/bin/env bash

PROFILE=${PROFILE:-local-idea}

echo "Starting service with profile: ${PROFILE}"
exec java -jar /srv/auth-service-0.0.1-SNAPSHOT.jar --spring.profiles.active=$PROFILE