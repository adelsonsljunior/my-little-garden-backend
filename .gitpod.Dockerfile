FROM gitpod/workspace-full:latest
USER gitpod

RUN sdk install java 20.0.2-open && sdk default java 20.0.2-open