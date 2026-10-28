FROM ubuntu:latest
LABEL authors="zenau"

ENTRYPOINT ["top", "-b"]