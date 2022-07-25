def buildApp() {
    echo 'building the application ......'
}
def testApp() {
    echo 'testing the application ......'
}
def deployApp() {
    echo 'Deploying the application ......'
    echo params.VERSION
}

return this 
