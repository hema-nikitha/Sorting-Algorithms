class BubbleSort{
    // create an array 
    public static void array(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");

        }
        System.out.println();

        }
        public static void main(String[] args) {
            int a[]={1,4,7,5};
            System.out.println("Before Sorting");
            array(a);
            for(int i=0;i<a.length-1;i++){
                for(int j=0;j<a.length-i-1;j++){
                    if(a[j]>a[j+1]){
                        int temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    



                    }

                    
                    
                }
                System.out.println("After  " +(i+1)+ "pass");
                array(a);

            }
            System.out.println("After sorting");
            array(a);

        }
    }
