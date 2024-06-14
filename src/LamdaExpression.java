public class LamdaExpression {

    public interface demo{
        public void method();
    }

    static class Anonymous{
        public void meth1(){
            System.out.println("This is method one.");
            System.out.println("This is method two.");
        }
    }
    public static void main(String[] args) {
        Anonymous obj=new Anonymous(){
            @Override
            public void meth1() {
                super.meth1();
            }
        };

        /* lamda expression */
        demo obj1=()->{
            System.out.println("This is lamda expression");
        };
        obj1.method();

    }
}
