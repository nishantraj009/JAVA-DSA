public class reverse {
    public static void ReversArray(int marks[]){
        int first =0, last = marks.length-1;
        while(first<last){
            int temp = marks[last];
            marks[last] = marks[first];
            marks[first] = temp;

            first++;
            last--;

        }
    }
    public static void main(String[] args){
        int marks[] = {45,32,48,44,40};
         ReversArray(marks);
         for(int i=0; i<marks.length;i++){
           System.out.print(marks[i]+ " ");
          
         }
        
    }
}




// 🔄 Reverse Array — Step by Step Logic

// Problem: Ek array ke elements ko ulta karna hai.


// Array me do pointer set karte hain:

// first → index 0

// last → index (array.length - 1)

// Jab tak first < last ho:

// first aur last wale elements swap kar do

// first++ → ek step aage

// last-- → ek step peeche




// 👀 Visualization (Very Important!)

// Array:

// [10, 20, 30, 40, 50]
//   ↑              ↑
// first=0        last=4
// Swap → [50, 20, 30, 40, 10]
// first=1, last=3


// Next:

// [50, 20, 30, 40, 10]
//      ↑        ↑
//    first=1  last=3
// Swap → [50, 40, 30, 20, 10]
// first=2, last=2


// Ab:

// first == last → Stop!

