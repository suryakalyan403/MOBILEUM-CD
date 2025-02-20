import com.mobileum.builds.RafmDeployments


def call(Map pipelineparams) {

    RafmDeployments rafmdeployments = new RafmDeployments()


    pipeline {
      agents any

      stages{

        stage("Extract Docker Image") {

           steps {

            script {
                
                echo "===================${pipelineparams.ENV-NAME}============"
                echo "Method Call: ${rafmdeployments.dockerImgExtract('/home/rsoni/base/0.4.9/images', 'base-0.4.9.tar.gz') }"

              }

            }

         }

      }

   }

 }

