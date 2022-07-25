def buildJar() {
    echo 'building JAR file ......'
    sh 'mvn package'
}

def buildImage() {
    echo 'building docker Image and push to docker hub ......'
    withCredentials([usernamePassword(credentialsId: 'docker-hub', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t umagloire/demo-app:2.0 .'
        sh 'echo $PASS | docker login -u $USER --password-stdin'
        sh 'echo docker push umagloire/demo-app:2.0'
    }
}

def deployApp() {
    echo 'Deploying the application ......'
}

return this 
