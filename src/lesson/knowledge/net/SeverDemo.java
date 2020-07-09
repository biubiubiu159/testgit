package lesson.knowledge.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SeverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader in = null;
		PrintWriter out = null;
		ServerSocket ss = null;
		Socket s = null;
		Scanner sc = new Scanner(System.in);
		String messages;
		
		try {
			ss = new ServerSocket(8888);
			System.out.println("*************server**************");
			s = ss.accept();
			
			System.out.println("客户端连接IP地址"+ s.getInetAddress().getHostAddress());
			System.out.println("客户端连接端口号"+ s.getPort());

			//接收消息
			in = new BufferedReader(
					new InputStreamReader(s.getInputStream()));
			out = new PrintWriter(
					new OutputStreamWriter(s.getOutputStream()));
			while(true) {
				messages = in.readLine();
				System.out.println("客户端发送的消息是："+messages);
				
				//返回消息
				if(messages.equals("exit")) {
					System.out.println("客户端已下线");
					break;
				}
				
				System.out.println("回复客户端：");
				messages = sc.nextLine();
				out.println(messages);
				out.flush();
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(s != null) {
				try {
					s.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
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
			if(ss != null) {
				try {
					ss.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
