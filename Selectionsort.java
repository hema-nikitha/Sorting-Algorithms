

class Selectionsort{
    public static void array(int[]a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        
    }
    public static void main(String[] args){
        int a[]={1,4,7,5};
        System.out.println("Before Swapping");
        array(a);
        for(int i=0;i<a.length-1;i++){
            int s=i;
        
        for(int j=i+1;j<a.length;j++){
            if(a[s]>a[j]){
                s=j;

            }
        }
            int temp=a[s];
            a[s]=a[i];
            a[i]=temp;
        

    System.out.println("After" +(i+1)+ "passes");
    array(a);
    
}

System.out.println("After sorting");
array(a);
    }
}
    


       