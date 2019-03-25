package sec05.exam11_try_with_resource;

public class TryWithResourceExample {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외처리 코드가 실행되었습니다.");
		}

	}

}
