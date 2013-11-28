ds-project
==========

DS Final Project


Dependancies
------------

- maven for eclipse
- maven command line

Instructions
------------
1. Clone to git folder
2. In eclipse, create new maven project
3. Change the directory to `git/ds-project/group-11`
4. Back in the terminal, add NXT libraries

  `cp -r ~/git/ds-project/group-11/lib/native/ ~/.m2/repository/lejos/nxt/nxt/0.0.1-SNAPSHOT/`
5. While in the same directory as `pom.xml`, run the following commands:

  Linux: `mvn install:install-file -Dfile=lib/pccomm.jar -DgroupId=lejos.nxt -DartifactId=nxt -Dversion=0.0.1-SNAPSHOT -Dpackaging=jar -Dsources=lib/src/pccomm-src.zip`
  Windows Power Shell: `mvn install:install-file '-Dfile=lib/pccomm.jar' '-DgroupId=lejos.nxt' '-DartifactId=nxt' '-Dversion=0.0.1-SNAPSHOT' '-Dpackaging=jar' '-Dsources=lib/src/pccomm-src.zip'`

6. In eclipse, right-click project folder, Run As, Run Configurations
7. Create a new configuration for Maven Build
  1. Name: group11
  2. Base directory: ${workspace_loc:/group11}
  3. Goals: exec:java
  4. Add parameters
    1. Name: exec.mainClass
    2. Value: project.Main
  5. Click Run
8. Home page: <http://localhost:8080>
9. Example REST URI: <http://localhost:8080/api/time>
