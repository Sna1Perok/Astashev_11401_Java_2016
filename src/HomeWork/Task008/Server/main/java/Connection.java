package ru.kpfu.itis.Group11401.Astashev.Task008.Server.main.java; /**
 * Created by 1 on 12.12.2015.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;


class Connection implements Runnable {
    String name;
    Socket socket;
    Thread thread;
    Server server;
    String history;
    int resultsPoint = 0;
    int ready = 0;
    boolean lastresult;
    boolean readyBool = false;
    int clients;
    String[] syllables = {"на", "ну", "но", "ны", "ни", "не", "ня", "нё",
            "ню", "нэ", "нь", "та", "ту", "то", "ты", "ти", "те", "тя",
            "тё", "тю", "тэ", "ть", "ха", "ху", "хо", "хи", "хе", "хэ",
            "хь", "ва", "ву", "во", "вы", "ви", "ве", "вя", "вё", "вю",
            "вэ", "вь", "да", "ду", "до", "ды", "ди", "де", "дя", "дё",
            "дю", "дэ", "дь", "за", "зу", "зо", "зы", "зи", "зе", "зя",
            "зё", "зю", "зэ", "зь", "па", "пу", "по", "пы", "пи", "пе",
            "пя", "пё", "пю", "пэ", "пь", "са", "су", "со", "сы", "си",
            "се", "ся", "сё", "сю", "сэ", "сь", "ца", "цу", "цо", "цы",
            "ци", "це", "ша", "шу", "шо", "ши", "ше", "шё", "шь", "йа",
            "йо", "йи", "йе", "йю"};//102
  //  private String slog;
  //  private int time;

    public Connection(Server server, Socket socket, String history, int clients, int ready) {
        this.socket = socket;
        this.server = server;
        this.history = history;
        this.clients = clients;
        this.ready = ready;
        thread = new Thread(this);
        thread.start();
    }

    public void run() {

        try {
            PrintWriter os = new PrintWriter(
                    socket.getOutputStream(), true);
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(
                            socket.getInputStream()
                    )
            );
            Scanner scanner = new Scanner(System.in);


            while (true) {
                while (server.ready < server.clients) {
                    System.out.println("ждемс");
                    if (!readyBool) {
                        name = is.readLine();
                        System.out.println(name);
                        server.resultMap.put(name, 0);
                        server.ready++;
                        readyBool = true;
                    }
                }

                os.println("start");

                String sillable = getSlog();
              //  System.out.println(sillable);
               // String sillable = "ко";
                  int location = getSrc();
              //  int location = 0;
                int time = getTime();
                String information = sillable + ";" + location + ";" + time;
                System.out.println(server.history + " - history");
                os.println(information + "::" + server.history);
                String results = is.readLine();

                System.out.println(results + "- resultsss");
                if (!results.equals("null")) {
                   // String[] resultMas = results.split(";");
                   // System.out.println(resultMas[0] + " - mas0");
                  //  System.out.println(resultMas[1] + " - mas1");
                   // resultMas[1] = resultMas[1].toLowerCase();
                    results.toLowerCase();
                    if (location == 0 && results.indexOf(sillable) == 0) {
                    //   System.out.println(lastresult = checkResultWord(resultMas[1]+ "  - wtf"));
                        lastresult = checkResultWord();
                        //lastresult = checkResultWord();
                    }
                    if (location == 1 && results.indexOf(sillable) != 0 &&results.indexOf(sillable) !=results.length() - sillable.length()) {
                        lastresult = checkResultWord();
                      //  lastresult = checkResultWord(results);
                    }
                    if (location == 2 && results.indexOf(sillable) == results.length() - sillable.length()) {
                        lastresult = checkResultWord();
                        //lastresult = checkResultWord();
                    }
                    if (lastresult) {
                       System.out.println("yeeees");
                        resultsPoint++;
                    }
                }

                server.resultMap.put(name, resultsPoint);
                addToHistory(results);
                os.println(server.resultMap.get(name));
                System.out.println(server.resultMap.get(name) + " - score");
                if (is.readLine().equals("end tour")) {
                    server.ready--;
                    System.out.println(server.ready + "lol");
                }
                int position = server.position;
                os.println(server.position);
                if(Integer.parseInt(is.readLine())!= position){
                    server.position++;
                }
                readyBool = false;
                lastresult = false;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean checkResultWord() {
        Random random = new Random();
        int kol = random.nextInt(2);
        if(kol > 0){
            return true;
        }else {
            return  false;
        }

    }


    private void addToHistory(String results) {
        if(server.history.equals("История ответов пока пуста")){
            server.history = "";
        }
        System.out.println(name + " - name");
         System.out.println(results + "  - results");
        server.history += name + ": " + results + ";";
        System.out.println(server.history + " - history");
    }

   /* private boolean checkResultWord(String resultMas) throws SQLException, ClassNotFoundException {
        java.sql.Connection conn = DB.getConnect();
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM  word WHERE word = ? ");
        stmt.setString(1, resultMas.toLowerCase());
        //System.out.println(resultMas.toLowerCase() + "sssss");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            if (rs.getString(1).equals(null)) {
                return false;
            }
        }
        return true;
    }*/

    public String getSlog() {
        Random random = new Random();
        return syllables[random.nextInt(102)];
    }

    public int getSrc() {
        Random random = new Random();
        return random.nextInt(3);
    }

    public int getTime() {
        return 10;
    }
}