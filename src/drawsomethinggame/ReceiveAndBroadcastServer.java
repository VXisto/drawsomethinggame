package drawsomethinggame;

/**
 * @author Prof. Dr. Plinio Vilela - plinio@ft.unicamp.br
 * 
 */
public class ReceiveAndBroadcastServer{
	public ReceiveAndBroadcastServer(int port){
		new ReceiveAndBroadcast(port);
	}

	public static void main(String[] args) {
		new ReceiveAndBroadcastServer(3333);
	}
}
