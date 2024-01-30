FROM jenkins/agent AS builder

USER root
RUN apt update && apt install -y python3 python3-pip 
COPY requirements.txt  .
USER jenkins
RUN pip3 install -r requirements.txt --break-system-packages