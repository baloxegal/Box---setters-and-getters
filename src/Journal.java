
public class Journal implements ThingInterface {

	private String name;
	private Integer pages;
	private String title;
	private String category;
		
	public Journal() {
		this.name = "Not indicated";
		this.pages = 0;
		this.title = "Not indicated";
		this.category = "Not indicated";
	}

	public Journal(String name, Integer pages, String title, String category) {
		this.name = name;
		this.pages = pages;
		this.title = title;
		this.category = category;
	}

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
		return "Journal name = " + name + ", pages = " + pages + ", title = " + title + ", category = " + category;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
