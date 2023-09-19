def call() {
    node('workstation') {
        git branch: 'main', url: 'https://github.com/Tirupathi1729/${componenet}'
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