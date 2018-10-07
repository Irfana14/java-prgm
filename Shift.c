#include <stdio.h>
 
/*
 * Function to calculate Greatest Common 
 * Divisor of two number
 */
int getGcd(int a, int b) {
  if (b == 0)
    return a;
  else
    return getGcd(b, a % b);
}
 
/*
* Function to left rotate arr[] of siz n by d
*/
void rotateArray(int *array, int N, int size) {
  int i, j, k, temp, gcd = getGcd(size, N);
  /* This loop will run gcd times, in each iteration 
  it will shift one element of each block to it's 
  appropriate position */
  for (i = 0; i < gcd; i++) {
      /* shift ith element of each block */
      temp = array[i];
      j = i;
      while(1) {
          k = j + N; 
          if (k >= size)
             k = k - size;
          if (k == i) /* one rotation completed */
             break;
          /*Swap jth element with j+N th element */
          array[j] = array[k]; 
          j = k;
      }
      array[j] = temp;
  }
}
 
int main(){
    int array[10] = {0,1,2,3,4,5,6,7,8,9}; 
    int i;
  
    printf("Original Array\n");
    for(i = 0; i<10; i++){
 printf("%d ", array[i]);
    }
  
    rotateArray(array, 3, 10);
  
    printf("\nRotated Array\n");
    for(i = 0; i<10; i++){
 printf("%d ", array[i]);
    }
 
    return 0;
}
