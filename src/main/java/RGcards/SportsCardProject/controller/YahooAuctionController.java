package RGcards.SportsCardProject.controller;

import RGcards.SportsCardProject.bot.YahooAuctionBot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crawler")
public class YahooAuctionController {

    @Autowired
    private YahooAuctionBot yahooAuctionBot;

    @GetMapping("/search")
    public String searchForNewProduct(Model model){
        System.setProperty("webdriver.chrome.driver", "C:/cd driver/chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        yahooAuctionBot.getNewProductList(driver,"Bobby Witt");
        return null;
    }
}
