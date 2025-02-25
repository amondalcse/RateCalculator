# RateCalculator
Just the demo for an assignment below the brief explaination
Framework structure:
     RateCalculator
         Src
           Main
           Test
             Java
                com.ratecalculator.commonmethods(package)
                            GenricMethods(Class)-> Here we can write all the common methods used in our framework like click,sendkeys, selectDropdowm etc..
                com.ratecalculator.pages(package)
                            DashBoardPage(Class)-> Here based on Page we can add the web Locator and the methonds what action we are going to perform on it.
                com.ratecalculator.tests(package)
                            DashBoardTest(Class)-> Here in this class we can write the test cases on dashboard page.
                            BaseClass(Class)-> In this class we can use the pre-requisite of the automation script like open the browser and close the browser
                com.ratecalculator.utility(package)
                            PropertyFileReader-> In this class write a method to get the data from the property file 
Create a file on Prject directory
  ->config.properties-> wehere we can store the Url and the config level data
Create a file on Project directory
  ->testNg.xml file-> from where we can run the automation script


Run the Script:
1. clone the project ->open in any Intellij IDE-> go to  the testNG file-> right click and run with testNg.xml file
2. clone the project -> navigate to the project folder and -> mvn test
                            
                
