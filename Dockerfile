FROM alpine:3.4

RUN echo 'Hello world from Dockerfile :)'

RUN apk update
RUN apk add vim
RUN apk add curl

RUN ls