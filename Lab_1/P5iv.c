#include <stdio.h>
void main(){
    int n;
    printf("Enter number: ");
    scanf("%d", &n);

    for(int i=n ; i>=1 ; i--){
        for(int k=0 ; k<n-i ; k++){
            printf(" ");
        }

        for(int j=1 ; j<=i ; j++){
            if(i%2==0){
                printf("# ");
            }
            else{
                printf("* ");
            }
        }
        printf("\n");
    }
}