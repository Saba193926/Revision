public class Arrays {
    public static void main(String[] args) {
        //static array disadvantages,
        // 1. Fixed size (instead we can use dynamic arrays like arraylist and hashmaps)
        //2. Same datatype values (instead we can use object datatype array)

        //1. Static Array
        int a1[]=new int[5];
        for (int i=0;i<=4;i++){
            a1[i]=i;
            System.out.println("a["+i+"]="+a1[i]);
        }

        //2. Object Array
        Object obj1[]= new Object[5];
        obj1[0]="firstname"; obj1[1]="10";obj1[2]=true;
        for (Object o:obj1) {
            System.out.println(o);
        }

        //3. 2D Array
        String x[][]= new String[3][4];   // 3 row and 4 columns
        System.out.println(x.length);
        System.out.println(x[0].length);
    }
}
