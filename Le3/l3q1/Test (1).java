class Test implements Testable {
    public void display() {  
        System.out.println("Test class implementing display()");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.display();
    }
}
