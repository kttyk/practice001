package silver;

public class Silver1031 {
    void test() throws Exception {
    	System.out.println("test");
    }
    
    void hoge() throws RuntimeException {
    	System.out.println("hoge");
    }
    public static void main(String[] args) throws Exception {
    	Silver1031 s = new Silver1031();
    	s.test();
    	s.hoge();
    }
}
