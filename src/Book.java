
public class Book implements ThingInterface {

	private String name;
	private Integer pages;
	private String title;
	private String authorName;
	private Integer publishingYear;
	
	public Book() {
		this.name = "Not indicated";
		this.pages = 0;
		this.title = "Not indicated";
		this.authorName = "Not indicated";
		this.publishingYear = 0;
	}
	
	public Book(String name, Integer pages, String title, String authorName, Integer publishingYear) {
		this.name = name;
		this.pages = pages;
		this.title = title;
		this.authorName = authorName;
		this.publishingYear = publishingYear;
	}

	/*IX. Обращение к любому полю класса возможно посредством синтаксиса: имя объекта . декларатор поля.
	 * Указывая имя объекта, мы можем достучаться только до его личных полей.
		
	*/
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book name = " + name + ", pages = " + pages + ", title = " + title + ", authorName = " + authorName
				+ ", publishingYear = " + publishingYear;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Integer getPublishingYear() {
		return publishingYear;
	}

	public void setPublishingYear(Integer publishingYear) {
		this.publishingYear = publishingYear;
	}
	
	

}
