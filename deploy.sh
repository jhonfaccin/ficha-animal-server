mvn clean package

#substituir pelo seu caminho para a pasta home do wildfly. 
wildfly=/home/jhon/dev/sourse/wildfly-10.1.0.Final

cp target/ficha-animal-server.war $wildfly/standalone/deployments/