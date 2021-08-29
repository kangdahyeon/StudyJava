//package mafia_TimeTrack;
//
//import java.util.*;
//import java.io.*;
//
//import chat.Server;
//
//public class Game {
//	HashMap<String, DataOutputStream> clients;
//	HashMap<String, DataInputStream> clients_in;
//	HashMap<String, String> clients_job;
//	Iterator<String> it;
//	int num, maf, pol, doc; // ��, ���Ǿ�, ����, �ǻ�
//	public int Num;
//	boolean day = true; // �� ���� �����ϴ� ���
//	boolean chat = true; // Ŭ���̾�Ʈ ä�� ���� ����
//	public Main main; // GameŬ������ ����Ŭ���� Main�� ����.
//	public Server server; // ServerŬ������ ����
//
//	public Game() {
//		System.out.println("Game ������");
//	}
//
//	public void Set(Server server) {
//		try {
//			// ������ ������ �޾ƿ´�.
//			this.server = server;
//			this.clients = server.clients;
//			this.clients_in = server.clients_in; // �ʿ伺 ���� �ؾ���.
//			this.clients_job = server.clients_job;
//
//			num = clients.size();
//			if (clients.isEmpty()) {
//				System.out.println("Ŭ���̾�Ʈ�� ����ֽ��ϴ�.");
//			} else {
//				maf = num / 3;
//				// it = clients.keySet().iterator();
//				// while (it.hasNext()) {
//				// clients_job.put(it.next(), "Citizen");
//				// System.out.println("��� �ù�����"); // �׽�Ʈ ���
//				// }
//
//				System.out.println("---------���Ǿ� ����---------");
//				// ��μ��� ¥�� ���Ǿ� ����. keyset�� iterator�� ���ط��� ����..
//
//				if (num > 5) {
//
//					String mafia[] = new String[num];// �迭 ����
//					Arrays.fill(mafia, 0);// 0���� �ʱ�ȭ
//					
//					for (int i = 0; i < maf; i++) {
//						mafia[i] = "1";// ���Ǿ� ����ŭ 1����
//					}
//
//					List<String> mafiaList = Arrays.asList(mafia); // �迭�� ����Ʈ��
//					Collections.shuffle(mafiaList);// ����Ʈ ����~
//
//					for (int i = 0; i < mafiaList.size() - 1; i++) {
//						it = clients.keySet().iterator();
//						if (mafiaList.get(i) == "1")// �ش簪�� 1�̸� ���Ǿ�
//							clients_job.put(it.next(), "Mafia");
//						else
//							// �ƴϸ� �� 0�̸� �ù�
//							clients_job.put(it.next(), "citizen");
//					}
//
//					/*
//					 * while (maf > 1) { System.out.println("ù��° while ����"); //
//					 * �׽�Ʈ ��� it = clients.keySet().iterator(); while
//					 * (it.hasNext()) { System.out.println("�ι�° while ����"); //
//					 * �׽�Ʈ ��� val = random.nextInt(num);
//					 * System.out.println(val); // �׽�Ʈ ��� if (val == 1) { if
//					 * (maf < 1) { System.out.println("���Ǿ� ����"); // �׽�Ʈ ���
//					 * break; } maf--; clients_job.put(it.next(), "Mafia");
//					 * System.out.println("���Ǿ� �Ѹ� ����"); // �׽�Ʈ ��� } else {
//					 * clients_job.put(it.next(), "Citizen");
//					 * System.out.println("�׳� �ù�����"); // �׽�Ʈ ��� } } }
//					 * System.out.println("���ο�: " + num + "��");
//					 * System.out.println("���Ǿ� ��: " + num + "/3=" + maf);
//					 */
//				} else {
//					System.out.println("�ο��� �ʹ� �����ϴ�.(6�� �̻�)");
//				}
//				System.out.println("----------------------------");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	public void Status() {
//		it = clients_job.keySet().iterator();
//		System.out.println("�������ͽ�����" + clients_job.keySet());
//		while (it.hasNext()) {
//			String temp = it.next();
//			System.out.println("�������ͽ��ݺ�������");
//			System.out.println("�̸�: " + temp);
//			System.out.println("����: " + clients_job.get(temp));
//		}
//	}
//
//	public void Start() {
//		server.gameon = true;
//		System.out.println("���ǾƸ� �����մϴ�!");
//		main = new Main();
//		main.start();
//	}
//
//	public void End() {
//		server.gameon = false;
//		System.out.println("������ �������ϴ�.");
//	}
//
//	public class Main extends Thread {
//		boolean Win() {
//			boolean win = true; // true:�ù��̱�, false:���Ǿ��̱�
//			int maf_num = 0, citi_num = 0;
//			Iterator<String> it = clients_job.keySet().iterator();
//			while (it.hasNext()) {
//				String tmpid = it.next();
//				switch (tmpid) {
//				case "Mafia":
//					maf_num++;
//					break;
//				case "Citizen":
//					citi_num++;
//					break;
//				}
//
//			}
//			if (maf_num >= citi_num) {
//				System.out.println("���Ǿư� �̰���ϴ�.");
//				win = false;
//			} else if (maf_num == 0) {
//				System.out.println("�ù��� �̰���ϴ�.");
//				win = true;
//			}
//			return win;
//		}
//
//		public void TimeOut(int sec) { // �ð������� �ش�. �ð��� ������ ��ȭ ����.
//			System.out.println(sec + "�� �� ������ �����մϴ�.");
//			server.sender.chat = false; // ServerSenderŬ������ chat�� false��.
//										// sendToAll�Լ� �۵�����.
//
//		}
//
//		public void PointOut() { // ����
//			System.out.println("�������ּ���.");
//		}
//
//		public void LiveOrDead(String id) { // ��ǥ
//			System.out.println("��ǥ���ּ���.");
//		}
//
//		public void run() {
//			while (day) { // ��
//				if (Win())
//					break; // �ºΰ� ������ �˻�
//				System.out.println("���� �Ǿ����ϴ�.");
//				TimeOut(180);
//
//				day = false;
//				if (!day) { // ��
//					System.out.println("���� �Ǿ����ϴ�.");
//
//					day = true;
//				} // ��
//			} // �� while
//			End();
//		} // run
//	} // Main
//} // Game