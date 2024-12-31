class Mergesort{
    // create a function and put array, left index, right index parameters
    public static void mergesort(int[] a,int l,int r){
        if(l<r){
            // creating mid index
            int mid=(l+r)/2;
            // create functions for diving left, right merged arrrays based on mid value
            mergesort(a,l,mid);
            mergesort(a,mid+1,r);
            merge(a,l,mid,r);
        }
    }
    // merge func for merging 2 halves
    public static void merge(int[]a,int l,int mid,int r){
        // size of left array
        int n1=mid-l+1;
        //size of right array
        int n2=r-mid;
        //array creation
        int[] la=new int[n1];
        int[] ra=new int[n2];

        // left array
        for(int i=0;i<n1;i++){
            la[i]=a[l+i];

          // right array  
        }

        for(int i=0;i<n2;i++){
            ra[i]=a[(mid+1)+i];
        }
        // create pointers
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(la[i]<=ra[j])
            {

            
            a[k]=la[i];
            i++;
        }
        else{
            a[k]=ra[j];
            j++;
        }
        k++;


    } 
    while(i<n1){
        a[k]=la[i];
        i++;
        k++;
    }  
    while(j<n2){
        a[k]=ra[j];
        j++;
        k++;
    }


    }
    public static void main(String[] args){
        
        int[] a={8,4,9,1,0};
        System.out.println("Before Sorting");
        for(int n:a){
            
            System.out.print(n+" ");

        }
        System.out.println();
        mergesort(a,0,a.length-1);
        System.out.println("After sorting");
        for(int n:a){
            System.out.print(n+" ");
        }
        System.out.println();

    }


}
