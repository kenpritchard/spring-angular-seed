# Deeplearning4j Seed
A small starter app to get a Spring back-end connected to an AngularJS front-end.

## Setup
Clone the project, providing the name of the new directory, and remove the .git folder:

`git clone --depth 1 --branch master https://github.com/kenpritchard/spring-angular-seed.git new_directory && rm -rf new_directory/.git`

or

`git clone --depth 1 --branch master git@github.com:kenpritchard/spring-angular-seed.git new_directory && rm -rf new_directory/.git`

If you are cloning to start a new project, edit the pom to reflect your group and artifact ID's along with modifying the package structure to reflect your organization's standards.

If you are planning to import the project into STS to start a new project, edit the .project file to set the projectDescription.name correctly.

## Build
`npm install` from the src/main directory to get the front-end dependencies set up.

`bower install` from the src/main directory to get the front-end packages set up.

`grunt build:dist` from the src/main directory to build the webapp folder.

`mvn package` to get the back-end built.

## Run
Run it thru STS or using Maven: `mvn spring-boot:run` to start the Spring app on port 8080.

To run the front-end separately with file watching and live reloading, run `grunt serve` from the src/main directory.

To prepare the front-end to be included in a WAR, run `grunt build:dist` from the src/main directory.
