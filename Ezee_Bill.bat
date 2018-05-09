set projectLocation=C:\Users\ext.cvelakaturichowd\eclipse-workspace\Ezee_Bill_Of_Landing
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause