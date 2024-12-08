node {
    def WORKSPACE = "/var/lib/jenkins/workspace/springboot-deploy"
    def dockerImageTag = "springboot-deploy:${env.BUILD_NUMBER}"

    try {

        stage("checkout") {
            git url: 'https://github.com/ManikantaUmmidi/ProjectWithJenkins.git'
            branch:  'main'
        }
        stage("build docker"){
            dockerImage = docker.build("springboot-deploy:${env.BUILD_NUMBER}")
        }
        stage("deploy docker") {
            echo "Docker Image Tag Name: ${dockerImageTag}"

            sh "docker stop springboot-deploy || true && docker rm springboot-deploy || true"
            sh "docker run --name springboot-deploy -d -p 8081:8080 springboot-deploy:${env.BUILD_NUMBER}"
        }
    } catch(e) {
        throw e
    }
}