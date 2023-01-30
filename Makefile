#PKG = foo
# -Xlint:all
JAVA_HOME=/usr/share/java
COMPILE_FLAGS=-Werror -cp .:$(JAVA_HOME)/junit.jar:$(JAVA_HOME)/hamcrest-core.jar
TEST_FLAGS = -enableassertions -cp .:$(JAVA_HOME)/junit.jar:$(JAVA_HOME)/hamcrest-core.jar org.junit.runner.JUnitCore
RUN_FLAGS = -enableassertions -cp .

.SUFFIXES: .java .class
.java.class:
	javac $(COMPILE_FLAGS) $*.java

MAIN=
TESTER=ListTests
CLASSES=ArrayExamples.java FileExample.java LectureExamples.java LinkedListExample.java ListExamples.java MethodsTests.java $(TESTER).java 

default: build

build: $(CLASSES:.java=.class)

.PHONY: clean
clean:
	$(RM) $(CLASSES:.java=.class)

test: build
	java $(TEST_FLAGS) $(TESTER)

#run: build
	#java $(RUN_FLAGS) $(MAIN)
