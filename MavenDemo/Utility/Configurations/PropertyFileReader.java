package Configurations;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileReader {
Properties pro;
public PropertyFileReader() {
	

try {
	FileInputStream File=new FileInputStream("D:\\Software2\\Workspace\\MavenDemo\\resources\\Config.properties");
      
	pro = new Properties();
	
	pro.load(File);
	
	}catch(Exception e) {
		e.printStackTrace();
	}
}
public String getUidname(){
	String TUS= pro.getProperty("Uidp");
	return TUS;
	
}
public String getPwd() {
	
	String TPWD =pro.getProperty("Pwdp");
	return TPWD;
}

public String getUrl() {
	String Turl= pro.getProperty("Url");
	return Turl;
}
public String getChromePath() {
	String TChromePath = pro.getProperty("chromepath");
	return TChromePath;
		
	}
}
