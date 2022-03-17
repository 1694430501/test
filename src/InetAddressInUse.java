import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author: wz
 * @date: 2022/02/09
 * 获取当前ip地址
 */
public class InetAddressInUse {
		public static void main(String[] args){
		try {
			InetAddress ip4 = Inet4Address.getLocalHost();
			System.out.println(ip4.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}				
	}
}

