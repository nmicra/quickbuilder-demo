pipeline {
    agent any
    stages {
		stage ('Sleep Stage') {
            steps {
                echo 'You have 5 seconds to cancel the build'
				sleep 5
            }
        }
        stage ('Compile Stage') {
            steps {
                sh 'mvn -f pompoms/reactor/pom.xml clean install'
            }
        }
        
        stage ('Expose Artifacts') {
         steps {
              archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
          }
         }
         
    }

}