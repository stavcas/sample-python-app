FROM --platform=$BUILDPLATFORM jenkins/jnlp-agent-python3 AS builder

WORKDIR /build

COPY requirements.txt /build
RUN --mount=type=cache,target=/root/.cache/pip \
    pip3 install -r requirements.txt