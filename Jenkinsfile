
pipeline {
    agent any
       parameters{
	              string (name: 'testSuite', defaultValue:'',description:'colocar el test a probar')
	}
    stages {
        stage('Download resources'){
            steps {
                echo 'se deberian descargar los resources'
            }
        }
        stage('Run Test'){
            steps{
                //update resources
		sh'mvn compile'
		//run test    
                sh 'mvn test -Dtest='+ testSuite 

            }
        }
	}
       post {
        always {
            echo 'One way or another, I have finished'
            deleteDir() /* clean up our workspace */
        }
    }
}
