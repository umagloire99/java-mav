def buildApp() {
    echo 'building the application ......'
}
def testApp() {
    echo 'testing the application ......'
}
def deployApp() {
    echo 'Deploying the application ......'
    echo "The deploy version is ${params.VERSION}"
}

return this 
