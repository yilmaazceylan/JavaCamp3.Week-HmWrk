package kodlamaIOProject.Core.logging;

public class EmailLogger implements Logger {

	@Override
	public void log(String data) {
		
		System.out.println("Email gönderildi:"+ data);
	}

}
