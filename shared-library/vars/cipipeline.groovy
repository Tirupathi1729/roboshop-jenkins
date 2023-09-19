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
//                    script {
//                        info 'Starting'
//                        warning 'Nothing to do!'
//                    }
                }
            }


            stage('Test') {
                when {
                    allOf{
                        expression { env.BRANCH_NAME != null }
                        expression { env.TAG_NAME == null }
                    }

                }
                steps {
                    echo 'Hello World'
                }
            }

            stage('Code Quality') {
                when {
                    allOf {
                        expression { env.BRANCH_NAME != null }
                        expression { env.TAG_NAME == null }
                    }

                }
                steps {
                    echo 'Hello World'
                }
            }

            stage('Code Security') {
                when {
                    expression { BRANCH_NAME == "main" }
                }
                steps {
                    echo 'Hello World'
                }
            }

            stage('Release') {
                when {
                    expression {env.TAG_NAME ==~ ".*"}
                }
                steps {
                    echo 'Hello World'
                }
            }

        }
    }
}
