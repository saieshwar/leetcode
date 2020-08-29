//                     return true;
//                 n =sum;
//             }
//         return false;
//         }
        
//     }
        
        //****************Using floyd detetction algorithm***************
        int slow =n,fast = n;
        do{
        slow = sumofsquares(slow);
        fast = sumofsquares(fast);
        fast = sumofsquares(fast);
            if(fast ==1)
                return true;
        }while(slow!=fast);
        
        return false;
    }
​
        
            
        private int sumofsquares(int n){
            int sum = 0;
            while(n>0){
                sum = sum + (int)Math.pow(n%10,2);
                n= n/10;
                }
            return sum;
        }
}
​
