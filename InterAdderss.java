
import java.net.InetAddress;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class InterAdderss {

	public static void main(String[] args) throws  Exception{
		// TODO �Զ����ɵķ������
		
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
		
		System.out.println("����IP��" + locAdd.getHostAddress());
		System.out.println("Զ��IP��" + remAdd.getHostAddress());
		System.out.println("�����Ƿ�ɴ" + locAdd.isReachable(5000));*/
	}

}
