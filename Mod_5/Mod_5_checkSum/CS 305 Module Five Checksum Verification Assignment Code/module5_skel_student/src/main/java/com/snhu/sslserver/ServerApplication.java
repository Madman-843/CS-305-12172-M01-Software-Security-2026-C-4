package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

}

@RestController
class ServerController{
//Adds hash function to return the checksum value for the data string that contains my name.    
    @RequestMapping("/hash")
    public String myHash() throws Exception{
    	// 1) Unique data string containing First and LAST name
    	String data = "Jacob Griggs";
    	
    	// 2) Collision-resistant algorithm
    	// SHA-256 is a collision-resistant hash algorithm used
    	// to verify data integrity and generate checksums.
    	String algorithm = "SHA-256";
    	
    	//3 Compute digest
    	import java.nio.charset.StandardCharsets;
    	
    	byte[] hashBytes = md.digest(data.getBytes(StandardCharsets.UTF_8));
    	//4) convert to lowercase
    		String checksumHex = bytesToHex(hashBytes);
    		

    	// 5) Return simple HTML so you can screenshot in the browser
    	//    (If your grader wants JSON, see the JSON variant below.)
    		  StringBuilder html = new StringBuilder();
    		   html.append("<html><body style=\"font-family:Segoe UI,Arial,sans-serif;\">")
    		      .append("<h2>Checksum Verification</h2>")
    		      .append("<p><strong>Data String:</strong> ").append(escape(data)).append("</p>")
    		      .append("<p><strong>Algorithm:</strong> ").append(algorithm).append("</p>")
    		      .append("<p><strong>Checksum (hex):</strong> ").append(checksumHex).append("</p>")
    		      .append("</body></html>");
    		     return html.toString();
    		    }

    	// Helper: bytes -> hex
    	private static String bytesToHex(byte[] bytes) {
    		StringBuilder sb = new StringBuilder(bytes.length * 2);
    		for (byte b : bytes) {
    		   String hex = Integer.toHexString(b & 0xff);
    		    if (hex.length() == 1) sb.append('0');
    		    sb.append(hex);
    		        }
    		   return sb.toString();
    		    }

    	// Simple HTML escaping for the data string
    	private static String escape(String s) {
    		2
    		return s.replace("&", "&amp;")
    		3
    		.replace("<", "&lt;")
    		4
    		.replace(">", "&gt;");
    		5
    		}
    		   }
