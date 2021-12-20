public class OverrideTest {

    public static void main(String[] args) {

        new OverrideTest().test();
    }

    private void test() {
        SuperClass a = new SubClass();
        a.doh(1);
    }

    class SuperClass {

        public char doh(char c) {
            System.out.println("doh(char)");
            return 'c';
        }

        public float doh(float f) {
            System.out.println("doh(float)");
            return 1.0f;
        }
    }

    class OtherClass { }

    class SubClass extends SuperClass {

        public void doh(OtherClass o) {
            System.out.println("doh(OtherClass)");
        }
    }
}
