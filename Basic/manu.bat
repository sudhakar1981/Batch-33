set projectLocation=D:\Automation Softwares\Automationworkspace\Basic
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\sample.xml
pause