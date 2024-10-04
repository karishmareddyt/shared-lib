def call(){
sshagent(['tomcat']) {
    sh "scp -o StrictHostKeyChecking=no target/ai-leads.war ec2-user@172.31.1.73:/opt/tomcat9/webapps/"
    sh "ssh ec2-user@172.31.1.73 /opt/tomcat9/bin/shutdown.sh"
    sh "ssh ec2-user@172.31.1.73 /opt/tomcat9/bin/startup.sh"
    }
}
