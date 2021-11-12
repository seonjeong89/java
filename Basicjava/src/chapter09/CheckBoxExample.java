package chapter09;

public class CheckBoxExample {
	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		checkBox.setOnSelectListener(
			new CheckBox.OnSelectListener() {
			@Override
			public void onSelect() {
				System.out.println("배경을 변경합니다.");				
			}
		});
		checkBox.select();
//		CheckBox checkBox = new CheckBox(() -> System.out.println("배경을 변경합니다."));
	}
}
