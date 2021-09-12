package silver;

public class Silver1027 {

	public static void main(String[] args) {
		try {
			throw new Exception();
		} catch (RuntimeException e) {
			throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("A");
		} finally {
			System.out.println("B");
		}
	}

}
