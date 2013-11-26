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
4. Run the Main class in `git/ds-project/group-11/project/Main.java` as a Java Application
5. Home page: <http://localhost:8080>
6. Example REST URI: <http://localhost:8080/api/time>
7. Add NXT libraries
  1. Make sure `git/ds-project/lib/src/native/linux/x86_64/libjlibnxt.so` is in your library path like `/usr/lib`
  2. `sudo ldconfig`

8. While in the same directory as `pom.xml`, run the following commands:
  1. `mvn install:install-file -Dfile=lib/pccomm.jar -DgroupId=lejos.nxt -DartifactId=nxt -Dversion=0.0.1-SNAPSHOT -Dpackaging=jar -Dsources=lib/src/pccomm-src.zip`
  2. `mvn clean install`
  3. `mvn exec:java -Dexec.mainClass="project.Main"`
