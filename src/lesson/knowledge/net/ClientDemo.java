package lesson.knowledge.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintWriter out = null;
		BufferedReader in = null;
		Socket s = null;
		Scanner sc = new Scanner(System.in);
		String messages;
		
		try {
			System.out.println("******************Client******************");
			s = new Socket("127.0.0.1",8888);
			System.out.println("与服务器连接成功"+s.getInetAddress().getHostAddress());
			System.out.println("与客户端连接成功 端口号"+s.getPort());
			
			out = new PrintWriter(
					new OutputStreamWriter(s.getOutputStream()));
			in = new BufferedReader(
					new InputStreamReader(s.getInputStream()));
			
			while(true) {

				System.out.println("请向服务端发送消息：");
				messages = sc.nextLine();
				out.println(messages);
				out.flush();
				
				if(messages.equals("exit")) {
					break;
				}
				
				messages = in.readLine();
				System.out.println("服务器返回的消息："+messages);
			}
				
			
			
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(out != null) {
				out.close();
			}
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(s != null) {
				try {
					s.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		
	}

}
