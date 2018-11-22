import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloYou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="";
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter your name");
			name=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello "+name);
	}

}
