# Parking Slot Booking Web App
## This project is made as a part of the CS F213 : Object Oriented Programming Course.

## Project Overview:
The Application allows users to book parking slots (Virtual) and allow them to add workers to their particular slot to avail services such as Air Filling, Car Washes and any of their choice and this data will be maintained on a regular basis in database. The Web App is fully Secured where you have Authentication in order to get things done. Only the Users who've got their Emails verified through the OTP will be able to register and use the app.

## Technologies Used:
1. [HTML, CSS and JS](https://www.javascript.com/) : FrontEnd Interface.
2. [Thymeleaf]( https://www.thymeleaf.org/v) : For the Connection between Frontend and Backend.
3. [ Spring Boot ](https://spring.io/projects/spring-boot) : For all the Backend Logic.
4. [ MySql ](https://www.mysql.com/) : For Storing all the Data.


## Steps to Run the Application on your own System :
1. First download the project Zip folder and open it in either STS or IntelliJ.
2. go to the application.properties file in src/main/resources and make the following changes..
3. change the server.port to any port as you wish, and change the username and password of spring.datasource attributes as per your mysql configuration.
4. And change the last part of datasource url attribute to the database name created locally on your mysql workbench.
5. To avail the service of email for otp verification change username and password attributes of spring.mail to any dummy email of your own.
6. Simply Run the project and go to localhost:'whatever port you have set' and see the Project working.


## Contributors:
- [ Sai Rahul](https://github.com/SaiRahul01)
- [ Rahil Sanghavi](https://github.com/xbdhshshs)
- [ Vishnu Praneeth](https://github.com/viseeth10)
- [ Sanchit Gupta ](https://github.com/sanchitg21)
