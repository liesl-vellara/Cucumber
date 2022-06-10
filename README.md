# Cucumber
It is a framework used on the client sides

# What files are important?
1. .feature file
2. Test Runner
3. Test

## 1. .feature file
This file is in the src/test/recources
The file is written in Gherkin Language which consists of the following keywords
1. feature: the name of the application
2. Scenario: the paricular feature
3. Given: the pre conditions
4. When: the test step
5. And : the next test step
6. Then: the post conditions
and many more

## 2. Test Runner
By default, cucumber framework runs with JUnit, but we can also run it with TestNG, after adding the repective plugins from mvn repository
The test runner connects the .feature file with the test file and run the test file with the particular conditions

## 3. Test
This consists of the steps required in the .feature file
In this Test file, we use the creditials to login in skillary.com

# When do we use Cucumber Framework?
Cucumber framework is most commonly used for User Acceptance Testing and the testers collaborate with the Business Analyst of the project
