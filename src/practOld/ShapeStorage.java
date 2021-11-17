package practOld;

class Shape {
	private int id;
	private String name;

	public Shape(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ID: " + id + " Shape: " + name;
	}
}

public class ShapeStorage {

	private Shape[] shapes = new Shape[5];
	private int index;

	public void addShape(String name) {
		int i = index++;
		shapes[i] = new Shape(i, name);
	}

	public Shape[] getShapes() {
		return shapes;
	}

}
