package a.b.c.kosmo.util.chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
 
class TcpChatServerManager {
	
	private List<Socket> socketList;
 
    // ������ : TCSM ��ü�� �����ϸ� ���ϸ���Ʈ �ϳ� ����
    public TcpChatServerManager() {
        socketList = new ArrayList<Socket>();
    }
 
    // ���� �߰� �޼ҵ�
    public void addSocket(Socket socket) {
        this.socketList.add(socket);
        new Thread(new ReceiverThread(socket)).start();
    }
 
    // ��ƼŬ���̾�Ʈ�� ������ ���ÿ� �����ϱ� ���� ������ ���� ������ ���������� ������ �־����.
    class ReceiverThread implements Runnable {
        
    	private Socket socket; // ����
 
        public ReceiverThread(Socket socket) {
            this.socket = socket;
        }
 
        @Override
        public void run() {
            // TODO Auto-generated method stub
 
        	try {
                // Ŭ���̾�Ʈ�� ���� �޽��� �б� ���� �۾�
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    
                while (true) {
                    String msg = br.readLine(); // Ŭ���̾�Ʈ�� ���� �޽��� �б�
                    System.out.println(msg);
                    // ���� �޽����� �޽��� ���� Ŭ���̾�Ʈ �����ϰ� ��� Ŭ���̾�Ʈ���� ������
                    Socket tmpSocket = null;
                    try {                        
                        for (int i = 0; i < socketList.size(); i++) { // ���ϸ���Ʈ�� ��ȸ�ϸ鼭
                            tmpSocket = socketList.get(i);
                            // socketList.get(0) -> ���� ��ü                            
                            if (socket.equals(tmpSocket)) continue;
                            // �޽����� ���� Ŭ���̾�Ʈ��� �ݺ��� �ѹ� �ǳʶٱ�
                            
                            // ������ ���� �޽����� Ŭ���̾�Ʈ�� �۽��ϱ�
                            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(tmpSocket.getOutputStream()));                            
                            bw.write(msg + "\n");
                            bw.flush();
                        }
                    }catch(Exception e) {
                        System.out.println(tmpSocket.getRemoteSocketAddress() + "���� ����");
                        //������ ���� Ŭ���̾�Ʈ�� ���� ���� ����
                        socketList.remove(tmpSocket); 
                        
                        System.out.println("===============����������=================");
                        for(Socket s : socketList) {
                            System.out.println(s.getRemoteSocketAddress());
                        }
                        System.out.println("==========================================");                        
                    }
                }
            } catch (IOException e) {
            	System.out.println("������ >>> : " + e.getMessage());
            }
            finally {
                if(socket != null) {
                    System.out.println(socket.getRemoteSocketAddress() + "���� ����");
                    socketList.remove(socket); 
                    //������ ���� Ŭ���̾�Ʈ�� ���� ���� ����
                    
                    System.out.println("===============����������=================");
                    for(Socket s : socketList) {
                        System.out.println(s.getRemoteSocketAddress());
                    }
                    System.out.println("==========================================");
                }
            }
        }
    }
}


public class SwingChatServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TcpChatServerManager tcsm = new TcpChatServerManager();
		 
		try {
			
			@SuppressWarnings("resource")
			ServerSocket serSocket = new ServerSocket(5000);
			System.out.println("SwingChatServer ���� :: " + serSocket);
			
			while (true) {
				System.out.println("��� �� ......");
				
				// Ŭ���̾�Ʈ ��û ��� 
				Socket socket = serSocket.accept(); 
				System.out.println(socket.getRemoteSocketAddress() + " : ����");
				
				// ���ϸŴ����� ���ϸ�Ͽ� �߰� 
				tcsm.addSocket(socket); 
			}		 
		} catch (IOException e) {
			System.out.println("������ >>> : " + e.getMessage());
		}	
	}
} // end of TcpChatServer



