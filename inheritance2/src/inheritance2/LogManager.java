package inheritance2;

public class LogManager {
	public void log(int logType) {
		if(logType == 1) {
			System.out.println("Veritabanýna loglandý");
		}else if(logType == 2) {
			System.out.println("Dosyaya loglandý Email gönderildi");
		}else {
			System.out.println("Email gönderildi");
		}
	}
}


//Loglama turleri
//1 - Database
//2 - File
//3 - Email