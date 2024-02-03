def buildApp() {
    echo 'Building the applications...'
}

def testApp() {
    echo 'Testing the applications...'
}

def deployApp() {
    echo 'Deploying...'
    echo "Deploying version ${params.VERSION}"
}