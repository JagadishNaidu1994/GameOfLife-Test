def buildWar() {
    echo "Building the application..."
    sh 'mvn install'
} 

def deployApp() {
    echo 'Deploying the application...'
    sshagent(['deploy-test']) {
                sh "scp -o StrictHostKeyChecking=no gameoflife-web/target/gameoflife.war ec2-user@54.218.218.31:/opt/apache-tomcat-9.0.64/webapps"
                }
} 

return this
