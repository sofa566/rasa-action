1. mvn clean ;
2. mvn dependency:copy-dependencies
3. mvn package
4. copy target/rasa-action.jar <botfront_project_dir>/actions_jar/
5. copy target/dependency/*    <botfront_project_dir>/actions_jar/