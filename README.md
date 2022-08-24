# cse234-2022-term-project-team30
cse234-2022-term-project-team30 created by GitHub Classroom
# HOTEL BOOKING APP 
> My Mobile Project README file 
> - Figma file  https://www.figma.com/file/HJDo4ABWH8CvsrZWwK67X0/HappyBookings?node-id=0%3A1
>  - Static username :yarengokhn@gmail.com 
> - Static password :Ya2!ren7



## Project Description
>My project allows the user to book from a hotel she/he chooses between the dates she/he wants at the location she wants, and if the user wishes, she/he can easily cancel her reservation easily from the cancel and profile page.The user can see the ratings of the rooms in the hotels, read the comments, and also have detailed information about the rooms.

My  project is about hotel booking.
It has 7 screens.These are:  
 - Login page 
 - Signup page
 - Home  page
 - Details  page 
 - Booking  page
 - Cancel-profile page 
 - Filter  page 
### Login Page and Signup Page

- In my project, it asks the user to enter the email and password if he or she registered on the login page and can login to the application easily and quickly after entering the user information. If the user has not registered before, he clicks on the register button and is redirected to the registration page where the user is asked to enter the email and password again. In this section, it is checked whether the user password and e-mail are valid, and if they are invalid, the user is informed with an error message. After that, the user can be redirected to the login page.
 ### Home Page
- The user will be able to see the world's most popular hotels, star ratings and how many comments they have made when entering this page from the home page. Clicking on any of these hotels opens the details page. You can see more hotels by scroll down  this page.Also at the top of the page there is a search field you can enter what you are looking for.
### Details Page

- This page shows the available rooms of the selected hotel.
shows the room types, prices for one night and the room's facilities.
 By clicking the heart icon here, we get the room or hotel to the favorites section, and when we click the book now button, we go to the Booking page with more detailed information.

### Booking Page
- On the reservation page, we choose the arrival and departure days and the number of people to stay. By looking at these criteria, our total expenditure is calculated and when we click on the book now button with our registered payment method, we reserve a room on the dates we choose. In addition, on this page, we can see the comments made about the room we have chosen and the rating of the room. . After making a reservation and staying in this room, we can comment and evaluate the room. We can also click on the heart icon in the top right and put it in favorites for later viewing.

### Filter Page 
 - We list all the hotels in the selected location and between the dates we selected on the filter page, starting with the hotel with the highest score, according to the scoring order,we reach the booking page by clicking the details page with the book now button, and then clicking the book now button of the room we have chosen. 
### Cancel and Profile Page 
- On this page, there are booked rooms and our favorites section. Every clicked room or hotel with the heart icon comes to the favorites section here. In this section, the user can exit by pressing the log out button and can change the payment method if he wants, and the user can see the reserved rooms in this section and can cancel them from here.


  # Important features on the login and signup page
  - valid email feature :emails should  contains @ and . marks 
ıf they do not contain these marks then it gives a short message and says invalid email and it gives error and say should consist @ and . 

   - valid password :It checks if the minimum password length 8 and should consist 1 uppercase, 1 number and  1 special character.

   - remember me function :I added the remember me function using Sharedpreferences. When the user ticks the box, the system saves the user's email and password.In the future, I would like to improve this feature and provide the user with a quick login opportunity by allowing the information to be recorded directly.
  
