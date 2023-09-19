def call() {
    node('workstation') {
        sh "find . | sed -e '1d' |xargs rm -rf"
        //git branch: "${BRANCH_NAME}", url: "https://github.com/Tirupathi1729/${component}"
        if(env.TAG_NAME ==~ "'*") {
            env.branch_name ="refs/tags/${env.TAG_NAME}"
        } else {
            env.branch_name = "${env.BRANCH_NAME}"
        }
        checkout scmGit (
                branches: [[name: branch_name]],
                userRemoteConfigs: [[url:"https://github.com/Tirupathi1729/${component}"]]
        )
        stage('Compile Code') {
            common.compile()
        }
        if (env.TAG_NAME == null) {
            stage('Test') {
                print 'Hello'
            }
            stage('Code Quality') {
                print 'Hello'
            }
        }
        if (env.BRANCH_NAME == main) {
            stage('Code Security') {
                print 'Hello'
            }
        }
        if (env.TAG_NAME ==~ ".*") {
            stage('Release') {
                print 'Hello'
            }
        }
    }
}