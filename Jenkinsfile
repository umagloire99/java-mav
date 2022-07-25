
pipeline {
    
    agent any
    parameters {
        choice(name: '  VERSION', choices: ['1.1.0', '1.1.1', '1.1.2'])
        booleanParam(name: 'executeTests', defaultValue:true, description: 'execute the phase only is true')
    }
    stages { 

        stage('build') {

            steps {
                echo 'building the application ......'
            }
        }
        stage('test') {

            steps {
                echo 'testing the application ....'
            }
        }

        stage('deploy') {
            when {
                expression {
                    params.executeTests == true
                }
            }
            steps {
                echo 'deploying the application .....'
            }
        }
    }
}