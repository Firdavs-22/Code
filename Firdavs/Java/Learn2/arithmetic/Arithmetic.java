package arithmetic;

public class Arithmetic {
    public static void main(String[] args) {
        int a = 10,b = 20,res;
        res = a+b;
        System.out.println("+: "+res );
        res = a-b;
        System.out.println("-: "+res);
        res = a*b;
        System.out.println("*: "+res);
        res = a/b;
        System.out.println("/: "+res);
        double d = a/b;
        System.out.println("/: "+d);
        d = (double) a/b;
        System.out.println("/: "+d);
        res = 7%3;
        System.out.println("%: "+res);
        a++;
        b--;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        a+=b;
        System.out.println("a+=b: "+a);


        double pi = 3.14;
        pi++;
        System.out.println(pi-1);
        System.out.println(pi+1);
        pi--;
        System.out.println(pi+1 - 0.000000000000001);
        System.out.println(pi/2);
        System.out.println(pi*2);

        pi += 5;
        pi = pi + 5;
        System.out.println(pi);
        int i =  8;
        System.out.println(i%3);
    }
}
