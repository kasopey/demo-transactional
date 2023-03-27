# Build
mvn clean install
# Run
    java -jar target/transactional-0.0.1-SNAPSHOT.jar

# Database web console
    http://localhost:8080/h2-console/
# Endpoints
## List countries (formatted by "jq")
    curl -w "\n" -X GET "http://localhost:8080/country" | jq
## Get 400 status because name is blank
    curl -w "\n" -X POST "http://localhost:8080/country?name="
## Get 200 status and store country in database
    curl -w "\n" -X POST "http://localhost:8080/country?name=Sanescobar"
## Get 500 error and not rolled back transaction because wrongly user @Transactional
    curl -w "\n" -X POST "http://localhost:8080/country?withException=true&name=Dummy"