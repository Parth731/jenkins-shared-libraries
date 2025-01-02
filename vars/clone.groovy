// vars/code.groovy
def call(String repoUrl, String branchName) {
    echo "Cloning repository from ${repoUrl}, branch: ${branchName}"
    git branch: branchName, url: repoUrl
}
