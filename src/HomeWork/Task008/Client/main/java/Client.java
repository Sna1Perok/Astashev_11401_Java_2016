package ru.kpfu.itis.Group11401.Astashev.Task008.Client.main.java; /**
 * Created by 1 on 12.12.2015.
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static String info = "";

    public static void main(String[] args) throws IOException {
        ApplicationContext ac =   new ClassPathXmlApplicationContext("ru/kpfu/itis/Group11401/Astashev/Task008/Client/main/java/spring-config.xml");
        int port = 8082;
        String score = "0";
        int end = 3;
        String host = "";
        int position = 0;
        HelloInterface helloInterface = new HelloInterface();
        helloInterface.setVisible(true);
        String name = helloInterface.getReady();
        String[] nameMas = name.split(";");
        host = nameMas[1];
        //Socket socket = new Socket(host, port);
        Socket socket = (Socket) ac.getBean("socket");
        PrintWriter os = new PrintWriter(
                socket.getOutputStream(), true);
        BufferedReader is = new BufferedReader(
                new InputStreamReader(
                        socket.getInputStream()
                )
        );

       // socket = new Socket(host, port);
        while (true) {
            while (Integer.parseInt(score) != end) {
                os.println(nameMas[0]);
                helloInterface.setVisible(false);
                System.out.println("жду");
                info = is.readLine();
                if (info.equals("start")) {
                    GameInterface user = new GameInterface();
                    user.setVisible(true);
                    info = is.readLine();
                    System.out.println(info + " - получил ");
                    String[] infoMas = info.split("::");
                    info = infoMas[0];
                    System.out.println(infoMas[0] + " - infomas 0 - " + infoMas.length);
                   System.out.println(infoMas[1] + " - infomas 1 - " + infoMas.length);
                    System.out.println(" '" + info + "' ");

                    String results = user.setInfo(infoMas);
                    System.out.println(results + " - пришежшие");
                    user.setVisible(false);
                    os.println(results);
                    ResultsRaundInterface resultsRaundInterface = new ResultsRaundInterface();
                    resultsRaundInterface.setInfo(infoMas);
                    resultsRaundInterface.setVisible(true);
                    score = is.readLine();
                    System.out.println(score + " - score");
                    resultsRaundInterface.wainting(nameMas[0], score);
                    resultsRaundInterface.setVisible(false);
                    os.println("end tour");
                    position = Integer.parseInt(is.readLine());
                    if (Integer.parseInt(score) != end) {
                        os.println(position);
                    }
                }
            }
            os.println(position + 1);
            WinInterface winInterface = new WinInterface();
            winInterface.setVisible(true);
            winInterface.setInfo(position);
            score = "0";
        }
    }
}