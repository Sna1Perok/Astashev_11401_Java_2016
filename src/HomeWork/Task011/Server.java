
/**
 *
 *  перед методом go он добавляет количесво очастников,а после вычитает 1
 *

public class Server {
    final int PORT = 8082;
    static int count=0;
    ArrayList<Connection> connections;
    public String history="История ответов пока пуста";
    public int clients = 0;
    public int position = 1;
    public ArrayList<String> users = null ;
    public int ready = 0;
    public HashMap<String, Integer> resultMap = new HashMap<String, Integer>();
    public Server() throws IOException {
        connections = new ArrayList<Connection>();
        go();
    }

    public void go() throws IOException {

       // serverInterface.waiting();
        ServerSocket s1 = new ServerSocket(PORT);
       // System.out.println("Starting server");
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
} **/