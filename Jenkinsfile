
pipeline {
    agent any
       parameters{
	              string (name: 'testSuite', default:'',description:'colocar el test a probar'
	}
    stages {
        stage('Download resources'){
            steps {
                echo 'se deberian descargar los resources'
            }
        }
        stage('Run Test'){
            steps{
                //run build command
                sh 'mvn test'+ testSuite 

            }
        }
        post{
            cleanup{
                deleteDir()

            }
   
