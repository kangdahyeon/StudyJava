package Test2;
class CheckBox {
	OnSelectListener listener;
	
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}
	void select() {
		listener.onSelect();
	}
	
	static interface OnSelectListener {
		void onSelect();
	}
}

public class CheckBoxExample {
	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		checkBox.setOnSelectListener(new CheckBox.OnSelectListener() {
			
			@Override
			public void onSelect() {
				System.out.println("����� �����մϴ�.");
			}
		});
		checkBox.select();
	}
}
