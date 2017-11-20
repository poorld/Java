package copy;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Server extends JFrame implements ActionListener {
    JTextArea input;//��ʾ��Ϣ
    JTextArea output;//������Ϣ
    JButton close;//�رհ�ť
    JButton send;//������ť
    JScrollPane top = new JScrollPane();//��input�Ĺ������
    JPanel medium, bottom;//��output���رհ�ť�����Ͱ�ť

    String inMessage, outMessage;
    ServerSocket server = null;
    Socket you = null;
    String s = null;
    PrintWriter pw = null;
    BufferedReader br = null;

    /**
     * @param args
     */
    public Server() {
        super();
        setTitle("������");
        setVisible(true);
        setBounds(600, 150, 350, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        top = new JScrollPane();
        top.setPreferredSize(new Dimension(300, 200));
        top.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        output = new JTextArea(6, 25);
        top.setViewportView(output);

        medium = new JPanel();
        medium.setPreferredSize(new Dimension(300, 120));
        input = new JTextArea(4, 27);
        medium.add(input);

        bottom = new JPanel();
        bottom.setPreferredSize(new Dimension(300, 60));
        close = new JButton("�ر�");
        close.addActionListener(this);
        send = new JButton("����");
        send.addActionListener(this);
        bottom.add(close);
        bottom.add(send);

        getContentPane().add(top, BorderLayout.NORTH);
        getContentPane().add(medium, BorderLayout.CENTER);
        getContentPane().add(bottom, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Server sever = new Server();
        sever.run();
    }

    public void run() {

        try {

            server = new ServerSocket(2222);
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            you = server.accept();
            br = new BufferedReader(new InputStreamReader(you.getInputStream()));
            pw = new PrintWriter(you.getOutputStream(), true);
            while ((inMessage = br.readLine()) != null) {
                output.append("�ͻ���˵��" + inMessage + "\n");
            }
        } catch (Exception e) {
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (close.hasFocus()) {
            try {
                server.close();
                System.out.println("�������ѹر�");
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
        if (send.hasFocus()) {
            outMessage = input.getText();
            input.setText(null);
            output.append("������˵��" + outMessage + "\n");
            pw.println(outMessage);
            pw.flush();
        }
    }

}