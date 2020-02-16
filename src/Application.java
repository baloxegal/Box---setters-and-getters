
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
		
		//X. Мы можем положить один и тот же объект в обе коробки
		
		secondBox.setContent(book);
		System.out.println(secondBox.toString());
		System.out.println();
		
		((Book)firstBox.getContent()).setTitle("New Title");
		
		//X. Изменяя title объекта из первой коробки, мы меняем title объекта из второй коробки, потому что это один ти тот же объект.
		
		System.out.println(firstBox.toString());
		System.out.println(secondBox.toString());
		System.out.println("");
		
	}

}
