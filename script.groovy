def buildApp() {
    echo 'building the application ......'
}
def testApp() {
    echo 'testing the application ......'
}
def deployApp() {
    echo 'Deploying the application ......'
    echo 'Deploy the version of the applicatipn ${params.VERSION}'
}

return this 
