FROM jenkins/jenkins:2.426.1-lts 
COPY --chown=jenkins:jenkins plugins.txt /usr/share/jenkins/plugins.txt 
RUN jenkins-plugin-cli -f /usr/share/jenkins/plugins.txt 
ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false 
ENV CASC_JENKINS_CONFIG /var/jenkins_home/jenkins.yaml
EXPOSE 8080