#include <iostream>
#include<limits.h>
using namespace std;


void reverseArray(int arr[], int size) {
  

  // for(int left =0, right=size-1; left<=right; left++, right--) {
  //  swap(arr[left], arr[right]);
  // }
  
  int left = 0;
  int right = size - 1;
  while(left <= right) {
    swap(arr[left], arr[right]);
    left++;
    right--;
  }

  //printing the array;
  for(int i=0; i<size; i++) {
    cout << arr[i] << " "; 
  }
  
}
return 0;
}
