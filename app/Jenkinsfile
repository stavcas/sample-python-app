pipeline {
  // triggers { pollSCM '* * * * *' }
  agent { label 'docker-agent'}
  options { skipDefaultCheckout(true) }
  stages {
    stage('pull_prep') {
      steps {
        echo "Zimbabuew"
        // checkout poll: true, 
        // checkout scm: scmGit(
        //   branches: [[name: "refs/pull/${params.PR_NUMBER}/head"]],
        //   userRemoteConfigs: [[url: 'https://github.com/stavcas/sample-python-app']])
      }
    }
  }
}