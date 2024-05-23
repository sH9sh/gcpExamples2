mvn clean package -DskipTests

gcloud functions deploy helloWorldFunction \
  --entry-point com.gcp.gcpExample2.HelloWorld \
  --runtime java17 \
  --trigger-http \
  --allow-unauthenticated \
  --source target/deploy