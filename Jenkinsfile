pipeline {
    agent any
    
    tools {
        maven "apache-maven-3.6.0"
    }
    
    stages {
        stage("Compile") {
            steps {
                sh "mvn compile"
            }
        }
        stage("Unit test") {
            steps {
                sh "mvn test"
            }
        }
    }
}
