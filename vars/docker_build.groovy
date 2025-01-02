def call(String ProjectName, String ImageTag, String DockerHubUser){
  echo 'docker build start'
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
  echo 'docker build end'
}
