
public class Application {

	public static void main(String[] args) {
		
		Box firstBox = new Box();
		Box secondBox = new Box();
		
		//firstBox.setContent(new Book());
		//secondBox.setContent(new Journal());
		
		Book book = new Book();
		Journal journal = new Journal();
		
		firstBox.setContent(book);
		secondBox.setContent(journal);
		
		System.out.println(firstBox.toString());
		System.out.println(secondBox.toString());
		System.out.println();
		
		//X. �� ����� �������� ���� � ��� �� ������ � ��� �������
		
		secondBox.setContent(book);
		System.out.println(secondBox.toString());
		System.out.println();
		
		((Book)firstBox.getContent()).setTitle("New Title");
		
		//X. ������� title ������� �� ������ �������, �� ������ title ������� �� ������ �������, ������ ��� ��� ���� �� ��� �� ������.
		
		System.out.println(firstBox.toString());
		System.out.println(secondBox.toString());
		System.out.println("");
		
	}

}
