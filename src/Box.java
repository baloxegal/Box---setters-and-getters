
public class Box {
	/*
    2. ����� � �������� ����������� content �������������� ThingInterface, � � ����� ������� ���� ���� name.
    */
    private ThingInterface content;
    
    // 3.
    
    public Box() {
    	
    }
    
    public Box(ThingInterface content) {
    	this.content = content;
    }

	public ThingInterface getContent() {
		return content;
	}

	public void setContent(ThingInterface content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Box content = " + content.toString();
	}
	
	
}
