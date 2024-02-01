multibranchPipelineJob('example') {
    branchSources {
        git {
            id('123456789') // IMPORTANT: use a constant and unique identifier
            
            repoOwner('stavcas')
            repository('sample-python-app')
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