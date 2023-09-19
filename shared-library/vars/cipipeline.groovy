def call() {
    node('workstation') {
        sh "find . | sed -e '1d' |xargs rm -rf"
        git branch: "${BRANCH_NAME}", url: "https://github.com/Tirupathi1729/${component}"
        stage('Compile Code') {
            common.compile()
        }
        stage('Test') {
            print 'Hello'
        }
        stage('Code Quality') {
            print 'Hello'
        }
        stage('Code Security') {
            print 'Hello'
        }
        stage('Release') {
            print 'Hello'
        }
    }
}