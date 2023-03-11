all: clean build exec
clean:
	mvn clean
build:
	mvn compile
exec:
	mvn exec:java
