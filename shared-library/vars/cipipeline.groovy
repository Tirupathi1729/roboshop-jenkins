//def info(message) {
//    echo "INFO: ${message}"
//}
//
//def warning(message) {
//    echo "WARNING: ${message}"
//}


def call() {
    pipeline {
        agent any

        stages {
            stage('Compile') {
                steps {
                    echo 'Hello World'
                    sh 'env'
                    script {
                        info 'Starting'
                        warning 'Nothing to do!'
                    }
                }
            }


            stage('Test') {
                steps {
                    echo 'Hello World'
                }
            }

            stage('Code Quality') {
                steps {
                    echo 'Hello World'
                }
            }

            stage('Code Security') {
                when {
                    expression {BRANCH_NAME == "main"}
                }
                steps {
                    echo 'Hello World'
                }
            }

            stage('Release') {
                steps {
                    echo 'Hello World'
                }
            }

        }
    }
}
