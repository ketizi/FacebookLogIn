import StepObject.LogInSteps;
import Utils.ChromeRunner;
import org.junit.Test;
import static DataObject.LogInData.*;

public class LogIn extends ChromeRunner {
    @Test

    public void logInWithIncorrectData() throws InterruptedException {


        LogInSteps step1 = new LogInSteps(driver); // რომ შევქმნით LogInSteps ის ობიექტს და მის მეთოდებს მივწვდებით.
        step1.emailInput(incorrectEmailData);
        step1.passwordInput(incorrectPasswordData);  // მხოლოდ ეს 4 სტრიქონი იწერება ტესტში.
        step1.logInButton();
        Thread.sleep(6000);

    }
    @Test
    public void LogInWithCorrectEmail() throws InterruptedException {


        LogInSteps step2 = new  LogInSteps(driver);
        step2.emailInput(correctEmailData);
        step2.passwordInput(incorrectPasswordData);
        step2.logInButton();
        Thread.sleep(6000); // sleep არასდროს იწერება ტესტირების პროცესში !!!


    }




}
