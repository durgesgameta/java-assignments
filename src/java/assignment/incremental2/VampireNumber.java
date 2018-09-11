package assignment.incremental2;

public class VampireNumber {
    // keep the count of vampire number encuontered till now
    static int t=0;

    //for storing the last vampire number as two permutation of the same number can be fangs
    static int last=-1;

    //check wether the number is vampire or not
    public static String checkVampireNumber(int arr[],int size,int no){
            int l=0,r=0;

            // left sub number
            for(int i=0;i<=size/2-1;++i) l=l*10+arr[i];

            //right sub number
            for(int i=size/2;i<size;++i) r=r*10+arr[i];

            if(l*r==no) {
                if(l%10==0 && r%10==0) return "";  // to check wether both the fangs  have zero at last or not

                // to check wether the last permutaion of the number could make fangs or not
                else if(last==no){
                    return "";
                }

                else{
                    ++t;   // increase the count
                    last=no; // update the last
                    return l+ " "+ r+" "+ no;
                }

            }
            return "";
    }

    public  static void swap(int arr[],int l,int r){
        int temp;
        temp = arr[l];
        arr[l]=arr[r];
        arr[r] = temp;
    }

    //function to get all the permutation of the number

    public static void permute(int arr[], int l, int r, int size,int no){
        int i;
        if (l == r){
            String res=checkVampireNumber(arr,size,no);  //for each permutation check wether the number is prime or not
            if(res=="") ;
            else System.out.println(res);
        }

        else
        {
            for (i = l; i <= r; i++)
            {
                swap(arr,l,i);
                permute(arr, l+1, r,size,no);
                swap(arr,l,i); //backtrack
            }

        }
    }


    public static void main(String[] args) {

        /*starting from 4 digit no. as 1 & 3 digit no. cannot be vampire no. nor any two digit no. can be vampiire as no multiplication of two digit
         give the no. with same digits */

        int no=1001;
        int arr[]=new int[20];
        int i=0;
        while(t<100){
             i=0;
            int dummy=no;

            // get the number in the form of a array
            while(dummy!=0){
                int remainder = dummy % 10;
                arr[i] = remainder;
                dummy = dummy/10;
                i++;
            }

            // permute on the array representing the number
            permute(arr,0,i-1,i,no);

            /* repeat the process for the next number to check wethere it is vampire number or not this ends when we
            get first 100 vampire number */
            ++no;
        }


    }
}
