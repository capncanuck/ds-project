ds-project
==========

DS Final Project


Dependancies
------------

- maven for eclipse
- maven command line

Instructions
------------
1. clone to git folder
2. in eclipse, create new maven project
3. change the directory to `git/ds-project/group-11`
4. Home page: <http://localhost:8080>
5. Example REST URI: <http://localhost:8080/api/time>
6. Add NXT libraries

  1. Make sure `git/ds-project/lib/src/native/linux/x86_64/libjlibnxt.so` is in your library path like `/usr/lib`

  2. `sudo ldconfig`

7. While in the same directory as `pom.xml`, run the following commands:

  1. `mvn install:install-file -Dfile=lib/pccomm.jar -DgroupId=lejos.nxt -DartifactId=nxt -Dversion=0.0.1-SNAPSHOT -Dpackaging=jar -Dsources=lib/src/pccomm-src.zip`

  2. `mvn clean install`

  3. `mvn exec:java -Dexec.mainClass="project.Main"`
