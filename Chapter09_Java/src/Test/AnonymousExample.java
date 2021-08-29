package Test;
class Worker {
	void start() {
		System.out.println("���� �ֽ��ϴ�.");
	}
}

class Anonymous {
	Worker field = new Worker() {
		@Override
		void start() {
			System.out.println("�������� �մϴ�.");
		}
	};
		void method1() {
			Worker localVar = new Worker() {
				@Override
				void start() {
					System.out.println("������ �մϴ�.");
				}
			};
			localVar.start();
		}
		void method2(Worker worker) {
			worker.start();
		}
	};
public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.start();
		anony.method1();
		anony.method2(new Worker() {
			@Override
			void start() {
				System.out.println("�׽�Ʈ�� �մϴ�.");
			}
		}
				);
	}
}
