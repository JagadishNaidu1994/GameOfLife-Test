def buildWar() {
    echo "building the application..."
    sh 'mvn install'
} 

def deployApp() {
    echo 'deploying the application...'
} 

return this
