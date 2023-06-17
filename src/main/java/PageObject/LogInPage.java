package PageObject;

import org.openqa.selenium.By;

public class LogInPage {
    protected By // უსაფრთხო რომ იყო წვდომის მოდიფიკატორი, შემოგვაქვს, რომ მხოლოდ შვილმა კლასმა დაინახოს ეს ელემენტი და ჩაწეროს ინფორმაცია

    emailField = By.name("email"),
    passwordField = By.id("pass"),
    logInButton = By.name("login");
}
