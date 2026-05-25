#include <stdio.h>
void main(){
    int size;
    printf("Enter size: ");
    scanf("%d", &size);

    int arr[size];
    printf("Enter elements: ");
    for(int i=0 ; i<size ; i++){
        scanf("%d", &arr[i]);
    }

    int sum = 0;
    for(int i=0 ; i<size ; i++){
        if(arr[i]%2==0){
            sum += arr[i];
        }
    }

    printf("Sum of even number: %d", sum);
}