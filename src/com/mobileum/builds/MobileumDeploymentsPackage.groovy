package com.mobileum.builds

class RafmDeployments implements Serializable {

      def jenkins

      RafmDeployments(jenkins) {

          this.jenkins = jenkins


      }

    
      def dockerImgExtract(filePath, fileName) {

          docker extract -i filePath/fileName
          
          return "$fileName: Image Extracted Successfully"


      }





}
