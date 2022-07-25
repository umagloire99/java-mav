
pipeline {

    agent any

    stages {

        stage('build') {
            steps {
                script {
                echo 'Building the application......'
                }
            }
        }

        stage('test') {
            steps {
                script {
                  echo 'Testing the application.........'
                }
            }
        }

        stage('deploy') {
            when {
                    expression {
                        BRANCH_NAME == 'main'
                    }
                }
            steps {
                script {
                     echo 'Deploying the application ......'
                }
            }
        }

    }
}