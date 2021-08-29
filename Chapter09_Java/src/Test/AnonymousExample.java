package Test;
class Worker {
	void start() {
		System.out.println("쉬고 있습니다.");
	}
}

class Anonymous {
	Worker field = new Worker() {
		@Override
		void start() {
			System.out.println("디자인을 합니다.");
		}
	};
		void method1() {
			Worker localVar = new Worker() {
				@Override
				void start() {
					System.out.println("개발을 합니다.");
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
				System.out.println("테스트를 합니다.");
			}
		}
				);
	}
}
