package Work;

public class Lambda {

    public static void main(String[] args) {

//            MyInterface m = new MyInterfaceImpl();
//            m.show();

//        MyInterface m = new MyInterface(){
//
//            public void show(){
//                System.out.println("Implementing functional interface using anonymous class");
//            }
//        };
//        m.show();

//        MyInterface m = () -> System.out.println("Functional interface implementation using lambda expression");
//
//        m.show();


//          SumInterface m= (a, b)-> a+b;
//
//        System.out.println("Sum of 2 and 3 ="+m.sum(2,3));
//        System.out.println(m.sum(10,23));

        LengthInterface len = str-> str.length();

        System.out.println("Length of string = "+len.getLength("Chetan Singh Chauhan"));

    }
}
