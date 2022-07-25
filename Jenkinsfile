def gv

pipeline {
    
    agent any
    parameters {
        choice(name: '  VERSION', choices: ['1.1.0', '1.1.1', '1.1.2'])
        booleanParam(name: 'executeTests', defaultValue:true, description: 'execute the phase only is true')
    }
    stages { 

        stage('init') {
            steps {
                gv = load('script.groovy')
            }
        }

        stage('build') {

            steps {
                script {
                    gv.buildApp()
                }
            }
        }
        
        stage('test') {

            steps {
                script {
                    gv.testApp()
                }
            }
        }

        stage('deploy') {
            when {
                expression {
                    params.executeTests == true
                }
            }
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }
}