def call(String repoUrl, String branch) {
  echo "Cloning the repository: ${repoUrl}, Branch: ${branch}"
  git url: repoUrl, branch: branch
  echo 'Code cloned successfully!'
}
