package sec02.exam07;

public interface DataAccessObject {
	DataAccessObject dbwork();

	void select();
	void insert();
	void update();
	void delete();

}
