import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitHubSearchTest {

    @Test
    void ShouldFindEnterpriseSolution() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";


        open("https://github.com/");
        $(".header-menu-wrapper").$(byText("Solutions")).hover();
        $("[href='/enterprise']").click();
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered\n" + "developer platform"));

    }
}
