
import java.net.InetAddress;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class InterAdderss {

	public static void main(String[] args) throws  Exception{
		// TODO 自动生成的方法存根
		
		URL url = new URL("http","www.baidu.com",80,"/curriculum.htm");
		InputStream input = url.openStream();
		Scanner scan = new Scanner(input);
		scan.useDelimiter("\n");
		while(scan.hasNext()) {
			System.out.println(scan.next());
		}
		
		
		/*InetAddress locAdd = null;
		InetAddress remAdd = null;
		
		locAdd = InetAddress.getLocalHost();
		remAdd = InetAddress.getByName("www.sina.com");
		
		System.out.println("本机IP：" + locAdd.getHostAddress());
		System.out.println("远程IP：" + remAdd.getHostAddress());
		System.out.println("本机是否可达：" + locAdd.isReachable(5000));*/
	}

}
