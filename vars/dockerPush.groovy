// vars/dockerPush.groovy
def call(String imageName, String tag, String dockerHubUser) {
    echo "Pushing Docker image: ${dockerHubUser}/${imageName}:${tag}"
    withCredentials([usernamePassword(credentialsId: 'docker-hub-cred', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
        sh 'docker login -u $USERNAME -p $PASSWORD'
        sh "docker push ${dockerHubUser}/${imageName}:${tag}"
    }
}
