// vars/dockerBuild.groovy
def call(String imageName, String tag, String dockerHubUser) {
    echo "Building Docker image: ${dockerHubUser}/${imageName}:${tag}"
    sh "docker build -t ${imageName}:${tag} ."
    sh "docker tag ${imageName}:${tag} ${dockerHubUser}/${imageName}:${tag}"
}
