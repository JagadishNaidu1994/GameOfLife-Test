//defining variable
def gv

pipeline {
    agent any
    stages {
        stage("load script") {
            steps {
                script {
                  // linking script file
                    gv = load "script.groovy"
                }
            }
        }
        stage("build war") {
            steps {
                script {
                    echo "Building............"
                    gv.buildWar()
                }
            }
        }
        stage("Deploy War File") {
            steps {
                script {
                    echo "Deploying War File.........."
                    gv.deployApp()
                }
            }
        }
    }   
}
