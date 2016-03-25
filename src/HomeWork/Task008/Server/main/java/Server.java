package ru.kpfu.itis.Group11401.Astashev.Task008.Server.main.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;


public class Server {
    final int PORT = 8082;
    ArrayList<Connection> connections;
    public String history="История ответов пока пуста";
    public int clients = 0;
    public int position = 1;
    public ArrayList<String> users = null ;
    public int ready = 0;
    public HashMap<String, Integer> resultMap = new HashMap<>();
    public Server() throws IOException {
        connections = new ArrayList<>();
        go();
    }

    public void go() throws IOException {
        ApplicationContext ac =   new ClassPathXmlApplicationContext("ru/kpfu/itis/Group11401/Astashev/Task008/Server/main/java/spring-config.xml");
       // serverInterface.waiting();
        //ServerSocket s1 = new ServerSocket(PORT);
        ServerSocket s1 = (ServerSocket) ac.getBean("s1");
        System.out.println("Starting server");
        ServerInterface serverInterface = new ServerInterface();
        serverInterface.setVisible(true);
        clients = serverInterface.getKol();
        while (true) {
            Socket client = s1.accept();
            System.out.println("Connected!");
            System.out.println(ready);
            connections.add(new Connection(this, client,"",clients,ready));
        }
    }

    public static void main(String[] args) throws IOException {

        Server server = new Server();

    }
}