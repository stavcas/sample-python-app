multibranchPipelineJob('example') {
    branchSources {
        git {
            id('123456789') // IMPORTANT: use a constant and unique identifier
            remote('https://github.com/stavcas/sample-python-app')
            includes('main')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
    factory {
      workflowBranchProjectFactory {
        scriptPath('jenkins/Jenkinsfile')
      }
    }
}