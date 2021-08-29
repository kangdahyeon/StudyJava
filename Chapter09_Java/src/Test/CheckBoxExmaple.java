package Test;
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

class BackgroundChangeListener implements CheckBox.OnSelectListener {
	@Override
	public void onSelect() {
		System.out.println("배경을 변경합니다.");
	}
}
public class CheckBoxExmaple {
	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		checkBox.setOnSelectListener(new BackgroundChangeListener());
		checkBox.select();
	}
}
