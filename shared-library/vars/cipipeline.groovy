def call() {
    node('workstation') {
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







    pipeline {
        agent any

        stages {
            stage('Compile') {
                steps {
                    echo 'Hello World'
                    sh 'env'
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

