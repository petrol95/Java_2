package Lesson_1.Examples;

public class Outer {

    public class Inner {
        private int innerVar;

        public Inner(int innerVar) {
            this.innerVar = innerVar;
        }

        public void innerInfo() {
            System.out.println(innerVar + " / " + outerVar);
        }

        // outerInfo();
    }

    private int outerVar;

    public Outer(int outerVar) {
        this.outerVar = outerVar;
    }

    public void outerInfo() {
        Inner inner = new Inner(10);
        System.out.println(outerVar + " / " + inner.innerVar);
        inner.innerInfo();
    }
}
