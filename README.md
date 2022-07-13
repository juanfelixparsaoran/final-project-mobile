Nama : Juan Felix Parsaoran Tarigan<br>
Kode Peserta : KSAT006ONL017
# final-project-mobile

## Overview
This is project is a katalon project for testing Bank App Demo in android for final project BTDP bootcamp for Katalon

## Test Scenario
### Register
- Register with valid data
- Register with blank data

### Login
- Login with valid credentials
- Make a boolean local variable (usernameInvalid, default true) check whether to run Test Case Login with invalid username or invalid password

### Account
- Create account first time
- Create account not the first time

### Deposit
- Deposit with valid amount
- Deposit with blank amount

### Payment
- Payment with new payee and sufficient balance
- Payment with unsufficient balance

### Transfer
- Transfer with sufficient balance
- Transfer with unsufficient balance

### Logout
- Check if logout is successfull

## Summary
All the test case is 100% passed
<br><br><br><br>



#### Add-ons :)
##### Problem with this final project
- I couldn't get all the toast element and it is difficult to verify any negative scenario like invalid credential in login and unsufficient balance in transfer. In exchange, I used default element to verify the scenario.
- Keyword verify is not applicable in if-else statement. I just want to take a false value, but the keyword failed the test case.
- The app is crashing in android 6.0 below so i upgrade my virtual mobile to android 10 and it works.
