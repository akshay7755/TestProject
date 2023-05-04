package Errors;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots {
    
	public void TakeScreenshot(WebDriver driver,String TCID) {
		try {
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("D:\\Software2\\Workspace\\MavenDemo\\Utility\\Parameterization\\ScreenshotCopy\\"+TCID+".jpg");
	
	FileHandler.copy(src, dest);
	
	}catch(Exception E) {
		E.printStackTrace();
	}
	}
}