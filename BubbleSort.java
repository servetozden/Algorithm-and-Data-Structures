package Algorithm;



// Karsılastırma algoritmasıdır. ilk eleman değeri ikisinden büyük ise yer değiştirir.
// 3 4 2 9 1 = 1 2 3 4 9
public class BubbleSort {

    public static void main(String[] args) {
        Integer[] data = {1,9,6,2,3,};
        sort(data);

    }

    private static void sort(Integer[] intArray){

        int n = intArray.length;
        int temp;

        for (int i=0; i< n; i++){
            for (int j=1; j<(n-i); j++){
                if (intArray[j-1] > intArray[j]){ // kendini ve yanında elemanı karsılastırıyor
                    temp= intArray[j-1]; // önceki elemanı temp atıyor.
                    intArray[j-1] = intArray[j]; // burda sayıları yer degistior. j= 2 sayalım burda 2 5 e denk geliyor onu j=1 atıyor.
                    intArray[j] = temp;// j kac ise ona temp atıyor

                }
            }
        }

    }
}
