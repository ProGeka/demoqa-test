package demoTests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void BeforeAll(){
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = true;

    }

    @Test
    void loginFormTest(){
        open("/text-box");
        $("#userName").setValue("Ilya Pobiypech");
        $("#userEmail").setValue("Ily@Pobiypech.ru");
        $("#currentAddress").setValue("Another adress 1");
        $("#permanentAddress").setValue("Another adress 2");
        $("#submit").click();
        $("#output").shouldHave(text("Ilya Pobiypech"), text("Ily@Pobiypech.ru"),
                text("Another adress 1"), text("Another adress 2"));





    }
}