# Code coverage on multi module maven projects for sonarcube

The default settings of jacoco and sonar show coverage only from tests within the 
same maven submodule. But in some cases one has test code that is not in the same module
as the code being tested, eg in integration tests. It would be great to have all the 
coverage reports aggregated into a single coverage. This project is an example of 
how to do this. It is an implementation (actually almost a copy) of
<https://stackoverflow.com/a/15535970/3312952>. 

The idea is to create a single jacoco.exec report by appending to it in every submodule.

This is simpler than using the jacoco:report-aggregate goal.
 