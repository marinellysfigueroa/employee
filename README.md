# employee

[![Build Status](https://travis-ci.org/codecentric/employee.svg?branch=master)](https://travis-ci.org/codecentric/employee)
[![Coverage Status](https://coveralls.io/repos/github/codecentric/employee/badge.svg?branch=master)](https://coveralls.io/github/codecentric/employee?branch=master)
[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

Minimal [Spring Boot](http://projects.spring.io/spring-boot/) sample app.

## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `de.codecentric.springbootsample.Application` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

## Deploying the application to OpenShift

The easiest way to deploy the sample application to OpenShift is to use the [OpenShift CLI](https://docs.openshift.org/latest/cli_reference/index.html):

```shell
oc new-app codecentric/springboot-maven3-centos~https://github.com/codecentric/employee
```

This will create:

* An ImageStream called "springboot-maven3-centos"
* An ImageStream called "employee"
* A BuildConfig called "employee"
* DeploymentConfig called "employee"
* Service called "employee"

If you want to access the app from outside your OpenShift installation, you have to expose the employee service:

```shell
oc expose employee --hostname=www.example.com
```

## Copyright

Released under the Apache License 2.0. See the [LICENSE](https://github.com/codecentric/employee/blob/master/LICENSE) file.

