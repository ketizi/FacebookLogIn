package StepObject;

import PageObject.LogInPage;
import org.openqa.selenium.WebDriver;

public class LogInSteps extends LogInPage {
    WebDriver driver ;

    public LogInSteps (WebDriver driver1) {
        driver = driver1; // დარწმუნებულები ვართ რომ ეს ჩემი დრაივერი არასდროს იქნება ცარიელი

    }

    public void emailInput(String s) {
        driver.findElement(emailField).sendKeys(s);

    }

    public void passwordInput(String s){
        driver.findElement(passwordField).sendKeys(s);
    }

    public void logInButton(){ // აქ არაფრი გადაცემა არ გვინდა უბრალოდ უნდა დააკლიკოს
        driver.findElement(logInButton).click();
    }


}
