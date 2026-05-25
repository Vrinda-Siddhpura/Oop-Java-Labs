#include <stdio.h>

void main(){
    char string[] = "darshan";
    
    int len = 0;
    while(string[len] != '\0'){
        len++;
    }

    for(int i=0 ; i<len ; i++){
        for(int k=0 ; k<len-i ; k++){
            printf(" ");
        }

        for(int j=0 ; j<=i ; j++){
            printf("%c ", string[j]);
        }
        printf("\n");
    }
}