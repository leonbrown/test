pipeline {
    agent any
    stages {
        stage('Freestyle Copy') {
            steps {
                sh '''
                echo "Hello, jenkins is working"
                chmod +x hello.sh
                ./hello.sh
                '''
            }
        }
        stage('Greeting') {
            steps {
                sh '''
                echo "Hello, class!"
                '''
            }
        }
    }
}
