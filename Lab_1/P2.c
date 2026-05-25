#include <stdio.h>
void main(){
    int n;
	printf("Enter Number: ");
	scanf("%d", &n);

    int sum = 0;
    while(n!=0){
        int rem = n%10;
        sum += rem;
        n /= 10;
    }

    printf("Sum: %d", sum);
}