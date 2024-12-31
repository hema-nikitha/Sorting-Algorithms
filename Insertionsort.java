

class Insertionsort{
    public static void array(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    

    }
    public static void main(String[] args) {
        int a[]={3,9,4,6,0};
        System.out.println("Before sorting");
        array(a);
        //process
        for(int i=1;i<a.length;i++){

        
            int c=a[i];                  // current element "c"     
            int j=i-1;                   // prev element "j"  i-1(j) a[j]|curr a[i](c)  
            while(j>=0&&a[j]>c){
                a[j+1]=a[j];             
                j--;
        }
            a[j+1]=c;
            System.out.println("After" +i+ "passes");

            array(a);


        }
        System.out.println("After sorting");
        array(a);
    }
}
                                                                                                                                                                               

    
