package icapps.ios;

def execute() {
 node('xcode'){
  wrap([$class: 'AnsiColorBuildWrapper', 'colorMapName': 'xterm']) {
             
                 checkout scm
                 echo 'beginnning workflow...'      

                 stage 'build'
                 sh '''#!/bin/bash
                 fastlane beta
                 '''
  }
 }
}
         
return this;
