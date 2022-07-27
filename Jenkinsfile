#!/usr/bin/env groovy

/* groovylint-disable-next-line CompileStatic */
@Library('jenkins-shared-library')

/* groovylint-disable-next-line CompileStatic, NoDef, UnusedVariable, VariableTypeRequired */
def gv

/* groovylint-disable-next-line CompileStatic */
pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('init') {
            steps {
                script {
                    gv = load('script.groovy')
                }
            }
        }

        stage('Build Jar') {
            steps {
                script {
                    buildJar()
                }
            }
        }

        stage('Build Image and push image') {
            steps {
                script {
                    buildImage 'umagloire/demo-app:3.0'
                    dockerLogin()
                    dockerPusher 'umagloire/demo-app:3.0'
                }
            }
        }

        stage('Deploy App') {
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }
}