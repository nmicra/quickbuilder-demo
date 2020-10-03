pipeline {
    agent any
	tools {
		maven "maven-3.6.3"
	}
    stages {
		stage ('Sleep Stage') {
            steps {
                echo 'You have 5 seconds to cancel the build'
				sleep 5
            }
        }
		stage ('Get Incremental POM') {
            steps {
                sh 'curl http://localhost:8080/pom/${env.BRANCH_NAME}/${currentBuild.number} > pom.xml'
				cat pom.xml
            }
        }
        stage ('Compile Stage') {
            steps {
				//sh '${M2_HOME}/bin/mvn -f pompoms/reactor/pom.xml clean install'
				//sh 'mvn -f pompoms/reactor/pom.xml clean install'
				sh 'mvn clean install'
            }
        }
        
        stage ('Expose Artifacts') {
         steps {
              archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
          }
         }
         
    }

}