public static void inOrder( int[] a){
        int max = a[0];
        for(int i = 1; i< a.length; i++){
          if(max<a[i])
            max = a[i];
        }
        int[] temp = new int[max];
        
        for(int i = 0; i< a.length; i++){
            temp[a[i]] += 1;
        }
        
        for(int i = 0; i< temp.length; i++){
          if(temp[i] != 0){
            for( int j = 0; j< temp[i]; j++){
              system.out.println(j +" ");
            }
          }
        }
      }
   
