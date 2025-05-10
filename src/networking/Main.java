package networking;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws UnknownHostException {
		String url = "mdaftabdeveloper.github.io";
		InetAddress inetAddress = Inet4Address.getByName(url);
		// return the address in the array form
		System.out.println("Address: " + Arrays.toString(inetAddress.getAddress()));
		// return the address in the original form
		System.out.println("Address: " + inetAddress.getHostAddress());

		// check for any wildcard address--return boolean value
		System.out.println("Is any local address: " + inetAddress.isAnyLocalAddress());

		// check for any local address is linked or not
		System.out.println("Is any link address: " + inetAddress.isLinkLocalAddress());

		// show the hashcode
		System.out.println("Hashcode: " + inetAddress.hashCode());

	}

}
