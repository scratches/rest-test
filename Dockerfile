FROM projectriff/java-function-invoker:latest
ARG FUNCTION_JAR=/functions/rest-test-0.1.0-SNAPSHOT.jar
ARG FUNCTION_CLASS=hello&main=com.example.RestTestApplication
ADD target/rest-test-0.1.0-SNAPSHOT.jar $FUNCTION_JAR
ENV FUNCTION_URI file://${FUNCTION_JAR}?handler=${FUNCTION_CLASS}
