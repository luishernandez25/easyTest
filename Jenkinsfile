pipeline {
    agent any


    stages {
        stage('Download resources'){
            steps {
               echo 'se deberian descargar los resources'
            }
        }
        stage('Run Test'){
            steps{
                //run build command
                sh 'mvn test'

            }
        }
    }
}
