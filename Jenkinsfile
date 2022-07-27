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
                    buildJar 'umagloire/demo-app:3.0'
                }
            }
        }

        stage('Build Image') {
            steps {
                script {
                    buildImage 'umagloire/demo-app:3.0'
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